/**
 * 实现导出数据操作功能
 * Created by jerry on 16-4-21.
 */
public abstract class ExportOperate {

    /**
     * 导出数据
     * @param data
     * @return
     */
    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @return
     */
    protected abstract ExportFileApi factoryMethod();

}
