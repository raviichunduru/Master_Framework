package driver.impl;

import driver.IMobileDriver;
import driver.entity.MobileDriverData;
import driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {


  @Override
  public WebDriver getDriver(MobileDriverData mobileDriverData) {
    return RemoteMobileDriverFactory.getDriver(mobileDriverData.getMobileRemoteType(),mobileDriverData.getMobilePlatformType());
  }
}
