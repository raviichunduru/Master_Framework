package driver;

import driver.entity.MobileDriverData;
import driver.entity.WebDriverData;
import driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static config.factory.FrameworkConfigFactory.getConfig;
import static driver.DriverManager.getDriver;
import static driver.DriverManager.setDriver;
import static driver.DriverManager.unLoad;

public final class Driver {

  private Driver () {}

  public static void initDriverForWeb()
  {
    if(Objects.isNull(getDriver())) {
      WebDriverData webDriverData = WebDriverData.builder()
        .setBrowserRemoteType(getConfig().browserRemoteType())
        .setBrowser(getConfig().browser())
        .build();

      WebDriver driver = DriverFactory
        .getDriverForWeb(getConfig().runMode())
        .getDriver(webDriverData);

      setDriver(driver);
      loadURL();
    }
  }

  private static void loadURL() {
    DriverManager.getDriver().get(getConfig().webURL());
    DriverManager.getDriver().manage().window().maximize();
  }

  public static void initDriverForMobile()
  {
    MobileDriverData mobileDriverData = MobileDriverData.builder()
      .setMobileRemoteType(getConfig().mobileRemoteType())
      .setMobilePlatformType(getConfig().mobilePlatformType())
      .build();

    WebDriver driver = DriverFactory
                 .getDriverForMobile(getConfig().runMode())
                 .getDriver(mobileDriverData);

    setDriver(driver);
  }

  public static void quitDriver ()
  {
    if(Objects.nonNull(getDriver()))
    {
      getDriver().quit();
      unLoad();
    }
  }
}
