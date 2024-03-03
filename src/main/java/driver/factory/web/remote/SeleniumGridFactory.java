package driver.factory.web.remote;

import driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import enums.Browser;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {

  private SeleniumGridFactory () {}

  private static final Map<Browser, Supplier<WebDriver>> MAP = new EnumMap<>(Browser.class);
  private static final Supplier<WebDriver> CHROME = SeleniumGridChromeManager::getDriver;
  private static final Supplier<WebDriver> FIREFOX = SeleniumGridFireFoxManager::getDriver;

  static
  {
    MAP.put(Browser.CHROME,CHROME);
    MAP.put(Browser.FIREFOX,FIREFOX);
  }

  public static WebDriver getDriver (Browser browser)
  {
    return MAP.get(browser).get();
  }
}
