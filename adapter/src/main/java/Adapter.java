/**
 * Created by jerry on 16-4-20.
 */
public class Adapter implements LogFileOperateApi {

    private LogDBOperateApi adaptee;

    public Adapter(LogDBOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 从文件里读取日志
     */
    @Override
    public void getFileLog() {
        adaptee.getDBLog();
    }

    /**
     * 将日志写入文件当中去
     */
    @Override
    public void addFileLog() {
        adaptee.addDBLog();
    }

    /**
     * 删除一条日志
     */
    @Override
    public void removeFileLog() {
        adaptee.removeDBLog();
    }
}
