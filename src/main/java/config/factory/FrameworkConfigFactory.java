package config.factory;

import config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class FrameworkConfigFactory {

  private FrameworkConfigFactory() {}

  public static FrameworkConfig getConfig ()
  {
    return ConfigCache.getOrCreate(FrameworkConfig.class);
  }


}
