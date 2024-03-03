package config;

import config.converters.StringToBrowserEnum;
import config.converters.StringToBrowserTypeEnum;
import config.converters.StringToRemoteTypeEnum;
import config.converters.StringToURL;
import enums.RemoteType;
import enums.Browser;
import enums.BrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "system:properties",
  "system:env",
  "file:${user.dir}/src/test/resources/config.properties",
})
public interface FrameworkConfig extends Config {

  String URL();
  
  @DefaultValue("CHROME")
  @ConverterClass(StringToBrowserEnum.class)
  Browser browser();

  @ConverterClass(StringToBrowserTypeEnum.class)
  BrowserType browserType();

  @ConverterClass(StringToRemoteTypeEnum.class)
  RemoteType remoteType();

  @ConverterClass(StringToURL.class)
  URL seleniumGridURL();

  @ConverterClass(StringToURL.class)
  URL selenoidURL();
}
