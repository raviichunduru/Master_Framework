package config;

import config.converters.StringToURL;
import org.aeonbits.owner.Config;
import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "file:${user.dir}/src/test/resources/browser-stack.properties",
})
public interface BrowserStackConfig extends Config {

  String userName();

  String key();

  @DefaultValue("https://${userName}:${key}@hub-cloud.browserstack.com/wd/hub")
  @ConverterClass(StringToURL.class)
  URL browserStackURL();
}
