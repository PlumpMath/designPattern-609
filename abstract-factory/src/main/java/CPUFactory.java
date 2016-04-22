/**
 * 创建CPU的简单工厂
 * Created by jerry on 16-4-22.
 */
public class CPUFactory {

    public static CPUApi createCPUApi(int type) {
        CPUApi cpu = null;

        if (type == 1) {
            cpu = new IntelCPU(1156);
        } else if (type == 2) {
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
