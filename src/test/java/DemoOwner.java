import org.aeonbits.owner.ConfigFactory;

public class DemoOwner {

    static ReadConfigFile readConfigFile = ConfigFactory.create(ReadConfigFile.class);

    public static void main(String[] args) {
        System.out.println(readConfigFile.url());

        System.out.println(readConfigFile.customName());

        System.out.println(readConfigFile.name());
        System.out.println(readConfigFile.pass());
    }
}
