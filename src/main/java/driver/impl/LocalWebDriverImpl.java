package driver.impl;

import driver.IWebDriver;
import driver.entity.WebDriverData;
import driver.factory.web.local.LocalWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

  @Override
  public WebDriver getDriver(WebDriverData webDriverData) {
    return LocalWebDriverFactory.getDriver(webDriverData.getBrowser());
  }
}
