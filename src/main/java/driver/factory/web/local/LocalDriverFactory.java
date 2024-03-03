package driver.factory.web.local;

import driver.manager.web.local.ChromeManager;
import driver.manager.web.local.FireFoxManager;
import enums.Browser;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

  private LocalDriverFactory() {}

  private static final Map<Browser, Supplier<WebDriver>> MAP = new EnumMap<>(Browser.class);
  private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
  private static final Supplier<WebDriver> FIREFOX = FireFoxManager::getDriver;

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
