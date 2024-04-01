package config.converters;

import enums.MobilePlatformType;
import enums.MobileRemoteType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobilePlatformTypeEnum implements Converter<MobilePlatformType> {

  @Override
  public MobilePlatformType convert(Method method, String mobilePlatformType) {

    return MobilePlatformType.valueOf(mobilePlatformType.toUpperCase());
  }
}
