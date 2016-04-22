/**
 * 创建主板的简单工厂
 * Created by jerry on 16-4-22.
 */
public class MainBoardFactory {

    public static MainBoardApi createMainBoardApi(int type) {
        MainBoardApi mainBoard = null;

        if (type == 1) {
            mainBoard = new GAMainBoard(1156);
        } else if (type == 2) {
            mainBoard = new MSIMainBoard(939);
        }
        return mainBoard;
    }
}
