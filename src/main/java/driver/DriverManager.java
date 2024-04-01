package driver;

import enums.ContextType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import static enums.ContextType.MOBILE;
import static enums.ContextType.WEB;
import static java.lang.ThreadLocal.withInitial;

public final class DriverManager {

  private DriverManager () {}

  private static final ThreadLocal<WebDriver> WEB_DRIVER = new ThreadLocal<>();
  private static final ThreadLocal<WebDriver> MOBILE_DRIVER = new ThreadLocal<>();
  private static final ThreadLocal<ContextType> CONTEXT = withInitial(() -> WEB);
  private static final Map<ContextType,ThreadLocal<WebDriver>> DRIVER_MAP = new EnumMap<>(ContextType.class);

  public static WebDriver getDriver ()
  {
    return CONTEXT.get().equals(WEB)
              ? WEB_DRIVER.get()
              : MOBILE_DRIVER.get();
  }

  public static void setDriver (WebDriver driver)
  {
    if(isMobileDriver(driver))
    {
      MOBILE_DRIVER.set(driver);
      DRIVER_MAP.put(MOBILE,MOBILE_DRIVER);
      CONTEXT.set(MOBILE);
    }
    else
    {
      WEB_DRIVER.set(driver);
      DRIVER_MAP.put(WEB, WEB_DRIVER);
      CONTEXT.set(WEB);
    }
  }

  private static boolean isMobileDriver(WebDriver driver)
  {
    return driver instanceof AndroidDriver || driver instanceof IOSDriver;
  }

  public static void unLoad ()
  {
    WEB_DRIVER.remove();
    MOBILE_DRIVER.remove();
    CONTEXT.remove();
  }
}
