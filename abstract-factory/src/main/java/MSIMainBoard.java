/**
 * 微星主板
 * Created by jerry on 16-4-22.
 */
public class MSIMainBoard implements MainBoardApi {

    /**
     * CPU 插槽孔数
     */
    private int cpuHoles;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("微星主板CPU插孔数：" + cpuHoles);
    }
}
