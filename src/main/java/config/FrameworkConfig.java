package config;

import config.converters.StringToBrowserEnum;
import config.converters.StringToMobilePlatformTypeEnum;
import config.converters.StringToMobileRemoteTypeEnum;
import config.converters.StringToRunModeEnum;
import config.converters.StringToBrowserRemoteTypeEnum;
import config.converters.StringToURL;
import enums.BrowserRemoteType;
import enums.Browser;
import enums.MobilePlatformType;
import enums.MobileRemoteType;
import enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "system:properties",
  "system:env",
  "file:${user.dir}/src/test/resources/config.properties",
  "file:${user.dir}/src/test/resources/staging-config.properties"
})
public interface FrameworkConfig extends Config {

  @DefaultValue("staging")
  String environment();

  @Key("${environment}.webURL")
  String webURL();

  String URL();
  
  @DefaultValue("CHROME")
  @ConverterClass(StringToBrowserEnum.class)
  Browser browser();

  @ConverterClass(StringToRunModeEnum.class)
  RunMode runMode();

  @ConverterClass(StringToBrowserRemoteTypeEnum.class)
  BrowserRemoteType browserRemoteType();

  @ConverterClass(StringToURL.class)
  URL seleniumGridURL();

  @ConverterClass(StringToURL.class)
  URL selenoidURL();

  @ConverterClass(StringToURL.class)
  URL localAppiumServer();

  @ConverterClass(StringToMobileRemoteTypeEnum.class)
  MobileRemoteType mobileRemoteType();

  @ConverterClass(StringToMobilePlatformTypeEnum.class)
  MobilePlatformType mobilePlatformType();
}
