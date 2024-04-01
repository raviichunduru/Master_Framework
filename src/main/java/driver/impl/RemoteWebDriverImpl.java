package driver.impl;

import driver.IWebDriver;
import driver.entity.WebDriverData;
import driver.factory.web.remote.RemoteWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {

  @Override
  public WebDriver getDriver(WebDriverData webDriverData) {
    return RemoteWebDriverFactory.getDriver(webDriverData.getBrowserRemoteType(),webDriverData.getBrowser());
  }
}
