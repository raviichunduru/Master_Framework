package driver.manager.mobile.remote.browserstack;

import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static config.factory.FrameworkConfigFactory.getConfig;

public class BrowserStackIOSManager {

  private BrowserStackIOSManager () {}

  public static WebDriver getDriver ()
  {
    XCUITestOptions options = new XCUITestOptions();

    options.setPlatformName("IOS"); //Optional
    options.setAutomationName(AutomationName.IOS_XCUI_TEST); //Optional
    options.setDeviceName("iPod touch (7th generation)");
    options.setApp("System.getProperty(\"user.dir\")+\"/ios-app.zip");

    return new RemoteWebDriver(getConfig().localAppiumServer(), options);
  }
}
