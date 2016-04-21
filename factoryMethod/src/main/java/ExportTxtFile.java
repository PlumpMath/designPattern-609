/**
 * 将数据导出到txt文件中去
 * Created by jerry on 16-4-21.
 */
public class ExportTxtFile implements ExportFileApi{

    @Override
    public boolean export(String data) {
        System.out.println("导出数据: "+ data + " 到txt中");
        return true;
    }
}
