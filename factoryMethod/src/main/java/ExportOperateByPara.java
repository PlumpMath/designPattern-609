/**
 * 实现导出数据操作功能
 * Created by jerry on 16-4-21.
 */
public class ExportOperateByPara {

    /**
     * 导出数据
     * @param data
     * @param type 类型选择
     * @return
     */
    public boolean export(int type, String data) {
        ExportFileApi api = factoryMethod(type);
        return api.export(data);
    }

    /**
     * 工厂方法，根据参数创建导出的文件对象的接口对象
     * @param type
     * @return
     */
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;

        if (type == 1) {
            api = new ExportTxtFile();
        } else if (type == 2) {
            api = new ExportDB();
        }
        return api;
    }

}
