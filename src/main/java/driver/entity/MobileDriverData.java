package driver.entity;

import enums.Browser;
import enums.BrowserRemoteType;
import enums.MobilePlatformType;
import enums.MobileRemoteType;
import enums.RunMode;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class MobileDriverData {

  private RunMode runMode;
  private MobileRemoteType mobileRemoteType;
  private MobilePlatformType mobilePlatformType;
}
