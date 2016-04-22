/**
 * 装机方案一： 使用Intel 的CPU 和 技嘉的主板
 * Created by jerry on 16-4-22.
 */
public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new GAMainBoard(1156);
    }
}
