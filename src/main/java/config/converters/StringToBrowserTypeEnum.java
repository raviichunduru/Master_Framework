package config.converters;

import enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeEnum implements Converter<BrowserType> {

  @Override
  public BrowserType convert(Method method, String browserType) {

    return BrowserType.valueOf(browserType);
  }
}
