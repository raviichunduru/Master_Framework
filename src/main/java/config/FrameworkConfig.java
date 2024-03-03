package config;

import config.converters.StringToBrowserType;
import enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "system:properties",
  "system:env",
  "file:${user.dir}/src/test/resources/config.properties",
})
public interface FrameworkConfig extends Config {

  String URL();
  
  @DefaultValue("CHROME")
  @ConverterClass(StringToBrowserType.class)
  BrowserType browser();
}
