package config.converters;

import enums.BrowserRemoteType;
import enums.MobileRemoteType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteTypeEnum implements Converter<MobileRemoteType> {

  @Override
  public MobileRemoteType convert(Method method, String mobileRemoteType) {

    return MobileRemoteType.valueOf(mobileRemoteType.toUpperCase());
  }
}
