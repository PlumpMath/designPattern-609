
/**
 * 装机人员类,接受用户需求，组装计算机
 * Created by jerry on 16-4-22.
 */
public class ComputerEngineer {

    private CPUApi cpu;
    private MainBoardApi mainBoard;

    public void makeComputer(int cpuType, int mainBoardType) {
        //组装计算机
        initComponent(cpuType, mainBoardType);
        // 测试计算机
        // ...
    }

    /**
     * 组装计算机
     * @param cpuType 客户选择的cpu类型
     * @param mainBoardType 客户选择的主板类型
     */
    private void initComponent(int cpuType, int mainBoardType) {
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainBoard = MainBoardFactory.createMainBoardApi(mainBoardType);

        //运行配件是否可以用
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
