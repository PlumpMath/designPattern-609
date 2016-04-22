/**
 * 抽象工厂接口，虽然它叫抽象工厂，但通常其不是一个抽象类，而是一个接口
 * Created by jerry on 16-4-22.
 */
public interface AbstractFactory {
    public CPUApi createCPUApi();
    public MainBoardApi createMainBoardApi();
}
