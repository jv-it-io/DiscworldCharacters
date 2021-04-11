# DiscworldCharecters
How to configure replicaset mongodb : run docker exec -it mongodb mongo

in the mongo shell

1: config = { "_id": "rs0", "members": [{ "_id": 0, "host": "mongodb:27017" }] }

2: rs.initiate(config)

should return message ok and in the mongodb Database local should find a collection oplog.rs
