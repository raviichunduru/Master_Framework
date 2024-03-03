package config.converters;

import enums.BrowserType;
import enums.RemoteType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteTypeEnum implements Converter<RemoteType> {

  @Override
  public RemoteType convert(Method method, String remoteType) {

    return RemoteType.valueOf(remoteType);
  }
}
