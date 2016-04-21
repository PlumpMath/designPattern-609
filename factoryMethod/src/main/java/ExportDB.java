/**
 * 导出数据到数据库中
 * Created by jerry on 16-4-21.
 */
public class ExportDB implements ExportFileApi{

    @Override
    public boolean export(String data) {
        System.out.println("导出数据： " +data+ " 到数据库中");
        return true;
    }
}
