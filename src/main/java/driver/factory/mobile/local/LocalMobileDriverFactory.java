package driver.factory.mobile.local;

import driver.manager.mobile.local.AndroidManager;
import driver.manager.mobile.local.IOSManager;
import driver.manager.web.local.ChromeManager;
import driver.manager.web.local.FireFoxManager;
import enums.Browser;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

  private LocalMobileDriverFactory() {}

  private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);
  private static final Supplier<WebDriver> ANDROID = AndroidManager::getDriver;
  private static final Supplier<WebDriver> IOS = IOSManager::getDriver;

  static
  {
    MAP.put(MobilePlatformType.ANDROID,ANDROID);
    MAP.put(MobilePlatformType.IOS, IOS);
  }

  public static WebDriver getDriver (MobilePlatformType mobilePlatformType)
  {
    return MAP.get(mobilePlatformType).get();
  }
}
