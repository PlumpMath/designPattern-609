import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 懒汉式
 * Created by jerry on 16-4-12.
 */
public class AppConfig_Lazy {

    private String parameterA;
    private String parameterB;

    private volatile static AppConfig_Lazy instance = null;

    public static AppConfig_Lazy getInstance() {
        //首先判断实例有没有初始化
        if (instance == null){
            //同步块，线程安全地创建实例
            synchronized (AppConfig_Lazy.class) {
                // 再次检查实例是否存在，如果不存在才真正创建实例
                if (instance == null)
                    instance = new AppConfig_Lazy();
            }
            instance = new AppConfig_Lazy();
        }
        return instance;
    }

    private AppConfig_Lazy() {
        readConfig();
    }

    private void readConfig() {
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = AppConfig_Lazy.class.getResourceAsStream("AppConfig.properties");
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
