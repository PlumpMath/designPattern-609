import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/** 
 * @ClassName Factory 
 * @Description: 其余代码和之前没有变化，只增加这样工厂类即可 
 * @author Jerry 
 * @date 2016年3月27日 上午10:23:30 
 */  
public class Factory {  
      
    public static Api createApi() {  
        Properties properties = new Properties();  
        InputStream in = null;  
        try {  
            in = Factory.class.getResourceAsStream("factory.properties");  
            properties.load(in);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        Api api = null;  
        try {  
            //使用反射创建实例  
            api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return api;  
    }  
      
    /**  
    * @Description: 通常把Factory当成一个工具类，不需要创建类实例，所以直接使用静态方法  
    * @param 当然可以添加参数，使得客户端可以选择自己想要初始化的实例，但不推荐，后面会解释原因   
    * @return Api  返回一个具体实现 
    * @throws  
    */  
    @Deprecated  
    public static Api createApi1() {  
        return new Impl();  
    }  
      
}  