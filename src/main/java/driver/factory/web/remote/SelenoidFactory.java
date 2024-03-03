package driver.factory.web.remote;

import driver.manager.web.remote.selenoid.SelenoidChromeManager;
import driver.manager.web.remote.selenoid.SelenoidFireFoxManager;
import enums.Browser;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {

  private SelenoidFactory () {}

  private static final Map<Browser, Supplier<WebDriver>> MAP = new EnumMap<>(Browser.class);
  private static final Supplier<WebDriver> CHROME = SelenoidChromeManager::getDriver;
  private static final Supplier<WebDriver> FIREFOX = SelenoidFireFoxManager::getDriver;

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
