
/**
 * 装机人员类,接受装机方案，组装计算机
 * Created by jerry on 16-4-22.
 */
public class ComputerEnginee2 {

    private CPUApi cpu;
    private MainBoardApi mainBoard;

    public void makeComputer(AbstractFactory schema) {
        //组装计算机
        initComponent(schema);
        // 测试计算机
        // ...
    }

    /**
     * 组装计算机
     * @param cpuType 客户选择的cpu类型
     * @param mainBoardType 客户选择的主板类型
     */
    private void initComponent(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainBoard = schema.createMainBoardApi();
        //运行配件是否可以用
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
