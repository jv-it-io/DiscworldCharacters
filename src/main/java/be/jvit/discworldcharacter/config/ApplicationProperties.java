package be.jvit.discworldcharacter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Jonathan Vandersmissen
 * @created 4/11/2021
 * @project DiscWorldCharacter
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
   private String springFoxUrl;

   private final Mongock mongock = new Mongock();

   public Mongock getMongock() {
      return mongock;
   }

   public static class Mongock {

      private String path = "be.fgov.famhp.mpm.reference.config.dbmigrations";
      private boolean enable = true;

      public String getPath() {
         return path;
      }

      public void setPath(String path) {
         this.path = path;
      }

      public boolean isEnable() {
         return enable;
      }

      public void setEnable(boolean enable) {
         this.enable = enable;
      }
   }
}
