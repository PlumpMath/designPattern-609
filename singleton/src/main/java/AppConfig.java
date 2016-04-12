import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * Created by jerry on 16-4-12.
 */
public class AppConfig {

    private String parameterA;
    private String parameterB;

    public AppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("AppConfig.properties");
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
