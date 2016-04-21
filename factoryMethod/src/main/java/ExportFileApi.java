/**
 * 各种导出形式的操作都遵循此接口
 * Created by jerry on 16-4-21.
 */
public interface ExportFileApi {
    /**
     * 导出内容
     * @param data 导出数据
     * @return 是否成功
     */
    public boolean export(String data);
}
