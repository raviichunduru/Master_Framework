package driver.manager.web.remote.selenium;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static config.factory.FrameworkConfigFactory.getConfig;

public final class SeleniumGridFireFoxManager {

  private SeleniumGridFireFoxManager () {}

  public static WebDriver getDriver ()
  {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName(String.valueOf(Browser.FIREFOX));

    return new RemoteWebDriver(getConfig().seleniumGridURL(),capabilities);
  }
}
