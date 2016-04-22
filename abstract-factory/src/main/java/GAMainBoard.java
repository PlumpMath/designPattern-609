/**
 * 技嘉主板
 * Created by jerry on 16-4-22.
 */
public class GAMainBoard implements MainBoardApi {

    /**
     * CPU 插槽孔数
     */
    private int cpuHoles;

    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("技嘉主板CPU插孔数：" + cpuHoles);
    }
}
