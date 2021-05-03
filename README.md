#Run app 

app prot : 8196
spring profil : dev 

# DiscworldCharacters

To run mongo alone : docker-compose -f docker-compose-mongodb.yml up

How to configure replicaset mongodb run : docker exec -it mongodb mongo

in the mongo shell

1: config = { "_id": "rs0", "members": [{ "_id": 0, "host": "mongodb:27017" }] }

2: rs.initiate(config)

should return message ok and in the mongodb Database local should find a collection oplog.rs


---------------------------------------------
#Docker container

build with maven the application : 

    mvn clean install

Build dockerfile :
 
    docker build -t discworld-characters .

Run in docker : 

    docker run -p 8196:8196 -t discworld-characters

Or run docker compose file

    docker-compose -f docker-compose.yml up


----------------------------------------------------
#Metrics actuator

run the application and go to 
    
    http://localhost:8196/actuator

----------------------------------------------------
#Metrics with prometheus

Download prometheus windows or pull official image on docker

in application-dev.yml there already have a config for prometheus export 
    
    management:
        endpoint:
            endpoints:
                web:
                    exposure:
                        include: health,info,prometheus

configure a new job_name ine Yaml of prometheus to use actuator of the app : 
    
    - job_name: 'spring boot scrape DiscWordCharacters'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 5s
    static_configs:
      - targets: ['localhost:8196']


    
