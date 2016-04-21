/**
 * 测试类
 * Created by jerry on 16-4-21.
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        operate.export("test");
    }
}
