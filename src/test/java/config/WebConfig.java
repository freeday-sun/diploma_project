package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
    "system:properties",
    "classpath:config/api.properties"
})
public interface WebConfig extends Config {

  @Key("web.url")
  String webUrl();
}
