package driver.factory.mobile.remote;

import enums.MobilePlatformType;
import enums.MobileRemoteType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

  private RemoteMobileDriverFactory() {}

  private static final Map<MobileRemoteType,Function<MobilePlatformType,WebDriver>> MAP = new EnumMap<>(MobileRemoteType.class);

  private static final Function<MobilePlatformType,WebDriver> BROWSER_STACK = BrowserStackMobileFactory::getDriver;
  //private static final Function<MobilePlatformType,WebDriver> SAUCE_LABS = SauceLabsMobileFactory::getDriver;

  static
  {
    MAP.put(MobileRemoteType.BROWSER_STACK, BROWSER_STACK);
    //MAP.put(MobileRemoteType.SAUCE_LABS, SAUCE_LABS);
  }

  public static WebDriver getDriver (MobileRemoteType mobileRemoteType, MobilePlatformType mobilePlatformType)
  {
    return MAP.get(mobileRemoteType).apply(mobilePlatformType);
  }
}

