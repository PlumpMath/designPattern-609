/**
 * 测试类2
 * Created by jerry on 16-4-21.
 */
public class Client2 {

    public static void main(String[] args) {
        ExportOperateByPara operate = new ExportXmlOperate();
        operate.export(1,"test1");
        operate.export(2,"test2");
        operate.export(3,"test3");
    }
}
