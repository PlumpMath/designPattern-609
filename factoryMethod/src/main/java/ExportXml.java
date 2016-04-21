/**
 * 导出到xml
 * Created by jerry on 16-4-21.
 */
public class ExportXml implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据： " + data + " 到xml文件");
        return true;
    }
}
