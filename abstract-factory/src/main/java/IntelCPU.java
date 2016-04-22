/**
 * Intel 的 CPU
 * Created by jerry on 16-4-22.
 */
public class IntelCPU implements CPUApi {

    /**
     * CPU 的针脚数
     */
    private int pins;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU 针脚数：" + pins);
    }
}
