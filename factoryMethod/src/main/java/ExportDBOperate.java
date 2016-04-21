/**
 * Created by jerry on 16-4-21.
 */
public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
