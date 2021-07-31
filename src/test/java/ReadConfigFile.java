import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.*;

@LoadPolicy(Config.LoadType.MERGE)
@Sources({
        "classpath:user.properties",
        "classpath:config.properties"
})
public interface ReadConfigFile extends Config {
    String url();

    @Config.Key("browser")
    String customName();

    String name();

    String pass();

}
