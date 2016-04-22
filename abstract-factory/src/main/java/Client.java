/**
 * 客户端调用,模拟客户
 * Created by jerry on 16-4-22.
 */
public class Client {

    public static void main(String[] args) {
        // 告诉装机人员自己的需求
       /* ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(1,2);*/

        ComputerEnginee2 enginee2 = new ComputerEnginee2();
        AbstractFactory schema = new Schema1();
        enginee2.makeComputer(schema);
    }
}
