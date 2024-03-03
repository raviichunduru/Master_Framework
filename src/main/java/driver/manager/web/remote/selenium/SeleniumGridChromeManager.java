package driver.manager.web.remote.selenium;

import enums.Browser;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static config.factory.ConfigFactory.getConfig;

public final class SeleniumGridChromeManager {

  private SeleniumGridChromeManager () {}

  @SneakyThrows
  public static WebDriver getDriver ()
  {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName(String.valueOf(Browser.CHROME));

    return new RemoteWebDriver(getConfig().seleniumGridURL(),capabilities);
  }
}
