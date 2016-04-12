/**
 * Created by jerry on 16-4-12.
 */
public class Client {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();

        String paraA = config.getParameterA();
        String paraB = config.getParameterB();
        System.out.println(paraA);
        System.out.println(paraB);
    }
}
