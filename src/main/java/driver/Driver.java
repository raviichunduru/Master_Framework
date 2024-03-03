package driver;

import config.factory.ConfigFactory;
import driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

import static config.factory.ConfigFactory.getConfig;

public class Driver {

  static WebDriver driver = null;

  public static void initDriver ()
  {
    driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    driver.get(getConfig().URL());
  }

  public static void quitDriver ()
  {
    driver.quit();
  }
}
