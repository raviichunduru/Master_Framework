package driver.entity;

import enums.Browser;
import enums.BrowserRemoteType;
import enums.RunMode;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class WebDriverData {

  private RunMode runMode;
  private BrowserRemoteType browserRemoteType;
  private Browser browser;
}
