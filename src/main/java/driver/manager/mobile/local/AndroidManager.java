package driver.manager.mobile.local;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebDriver;

import static config.factory.FrameworkConfigFactory.getConfig;

public final class AndroidManager {

  private AndroidManager () {}

  public static WebDriver getDriver ()
  {
    UiAutomator2Options options = new UiAutomator2Options();

    options.setPlatformName("Android"); //Optional
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); //Optional
    options.setDeviceName("Medium Phone API 30");
    options.setApp(System.getProperty("user.dir")+"/android-app.apk");

    return new AndroidDriver(getConfig().localAppiumServer(), options);
  }
}
