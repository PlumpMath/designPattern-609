/**
 * 装机方案二： 使用AMD 的CPU 和 微星的主板
 * Created by jerry on 16-4-22.
 */
public class Schema2 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new MSIMainBoard(939);
    }
}
