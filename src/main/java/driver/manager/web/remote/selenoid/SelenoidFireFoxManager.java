package driver.manager.web.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static config.factory.FrameworkConfigFactory.getConfig;

public final class SelenoidFireFoxManager {

  private SelenoidFireFoxManager () {}

  public static WebDriver getDriver ()
  {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability("browserName","firefox" );
    capabilities.setCapability("browserVersion","120" );
    capabilities.setCapability("enableVNC",true );
    capabilities.setCapability("enableVideo",false);

    return new RemoteWebDriver(getConfig().selenoidURL(), capabilities);
  }

}
