package config.converters;

import enums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeEnum implements Converter<RunMode> {

  @Override
  public RunMode convert(Method method, String runMode) {

    return RunMode.valueOf(runMode.toUpperCase());
  }
}
