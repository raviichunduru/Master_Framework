package driver.factory.web.remote;

import enums.Browser;
import enums.RemoteType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

  private RemoteDriverFactory () {}

  private static final Map<RemoteType,Function<Browser,WebDriver>> MAP = new EnumMap<>(RemoteType.class);

  private static final Function<Browser,WebDriver> SELENIUM_GRID = SeleniumGridFactory::getDriver;
  private static final Function<Browser,WebDriver> SELENOID = SelenoidFactory::getDriver;
  private static final Function<Browser,WebDriver> BROWSER_STACK = BrowserStackFactory::getDriver;

  static
  {
    MAP.put(RemoteType.SELENIUM_GRID, SELENIUM_GRID);
    MAP.put(RemoteType.SELENOID, SELENOID);
    MAP.put(RemoteType.BROWSER_STACK, BROWSER_STACK);
  }

  public static WebDriver getDriver (RemoteType remoteType, Browser browser)
  {
    return MAP.get(remoteType).apply(browser);
  }
}

