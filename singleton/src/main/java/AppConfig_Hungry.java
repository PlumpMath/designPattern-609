import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 饿汉式
 * Created by jerry on 16-4-12.
 */
public class AppConfig_Hungry {

    private String parameterA;
    private String parameterB;

    private static AppConfig_Hungry instance = new AppConfig_Hungry();

    public static AppConfig_Hungry getInstance() {
        return instance;
    }

    private AppConfig_Hungry() {
        readConfig();
    }

    private void readConfig() {
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = AppConfig_Hungry.class.getResourceAsStream("AppConfig.properties");
            prop.load(in);
            this.parameterA = prop.getProperty("paraA");
            this.parameterB = prop.getProperty("paraB");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

}
