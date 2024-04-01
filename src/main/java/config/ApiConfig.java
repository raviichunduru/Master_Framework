package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "system:properties",
  "system:env",
  "file:${user.dir}/src/test/resources/api-config.properties"
})
public interface ApiConfig extends Config {

  String apiBaseUrl();

  String listUsersEndPoint();

  String createUserEndPoint();




}
