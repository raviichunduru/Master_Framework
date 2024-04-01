package config.converters;

import enums.BrowserRemoteType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemoteTypeEnum implements Converter<BrowserRemoteType> {

  @Override
  public BrowserRemoteType convert(Method method, String browserRemoteType) {

    return BrowserRemoteType.valueOf(browserRemoteType.toUpperCase());
  }
}
