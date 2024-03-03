package driver.manager.web.remote.browserstack;

import config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackFireFoxManager {

  private BrowserStackFireFoxManager () {}

  public static WebDriver getDriver ()
  {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability("browser","firefox" );
    capabilities.setCapability("browser_version","latest" );
    capabilities.setCapability("os","Windows" );
    capabilities.setCapability("os_version","10");

    return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
  }
}
