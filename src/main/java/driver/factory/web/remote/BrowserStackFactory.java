package driver.factory.web.remote;

import driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import driver.manager.web.remote.browserstack.BrowserStackFireFoxManager;
import enums.Browser;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

  private BrowserStackFactory () {}

  private static final Map<Browser, Supplier<WebDriver>> MAP = new EnumMap<>(Browser.class);
  private static final Supplier<WebDriver> CHROME = BrowserStackChromeManager::getDriver;
  private static final Supplier<WebDriver> FIREFOX = BrowserStackFireFoxManager::getDriver;

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
