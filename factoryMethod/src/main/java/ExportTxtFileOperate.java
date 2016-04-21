/**
 * 在这里真正创建具体对象
 * Created by jerry on 16-4-21.
 */
public class ExportTxtFileOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
