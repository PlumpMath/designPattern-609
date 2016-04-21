/**
 * Created by jerry on 16-4-21.
 */
public class ExportXmlOperate extends ExportOperateByPara {

    /**
     * 覆写工厂方法
     * @param type
     * @return
     */
    @Override
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;
        // 这里是一个强大功能，可以让子类选择性覆盖，不想覆盖的方法可以返回去让父类实现
        if (type == 3) {
            api = new ExportXml();
        } else {
            api = super.factoryMethod(type);
        }
        return api;
    }
}
