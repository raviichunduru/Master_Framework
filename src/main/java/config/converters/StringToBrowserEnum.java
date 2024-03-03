package config.converters;

import enums.Browser;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserEnum implements Converter<Browser> {

  @Override
  public Browser convert(Method method, String browser) {

    Map<String, Browser> map = Map.of("CHROME", Browser.CHROME,
                                          "FIREFOX", Browser.FIREFOX);

    return map.getOrDefault(browser.toUpperCase(), Browser.CHROME);
  }
}
