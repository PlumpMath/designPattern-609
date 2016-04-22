/**
 * AMD 的 CPU
 * Created by jerry on 16-4-22.
 */
public class AMDCPU implements CPUApi {

    /**
     * CPU 的针脚数
     */
    private int pins;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU 针脚数：" + pins);
    }
}
