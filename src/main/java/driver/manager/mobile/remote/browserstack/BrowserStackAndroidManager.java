package driver.manager.mobile.remote.browserstack;

import config.factory.BrowserStackConfigFactory;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {

  private BrowserStackAndroidManager () {}

  public static WebDriver getDriver ()
  {
    UiAutomator2Options options = new UiAutomator2Options();

    options.setPlatformName("Android"); //Optional
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); //Optional
    options.setDeviceName("Medium Phone API 30");
    options.setApp(System.getProperty("user.dir")+"/android-app.apk");

    return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), options);
  }
}
