package driver.factory.mobile.remote;

import driver.manager.mobile.remote.browserstack.BrowserStackAndroidManager;
import driver.manager.mobile.remote.browserstack.BrowserStackIOSManager;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

  private BrowserStackMobileFactory() {}

  private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);
  private static final Supplier<WebDriver> ANDROID = BrowserStackAndroidManager::getDriver;
  private static final Supplier<WebDriver> IOS = BrowserStackIOSManager::getDriver;

  static
  {
    MAP.put(MobilePlatformType.ANDROID, ANDROID);
    MAP.put(MobilePlatformType.IOS, IOS);
  }

  public static WebDriver getDriver (MobilePlatformType mobilePlatformType)
  {
    return MAP.get(mobilePlatformType).get();
  }
}
