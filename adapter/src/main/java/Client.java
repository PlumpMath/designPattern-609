/**
 * 测试
 * Created by jerry on 16-4-20.
 */
public class Client {

    public static void main(String[] args) {
        // 文件日志
//        LogFileOperateApi fileLog = new LogFileOperate();

        //改为数据库日志
        LogFileOperateApi fileLog = new Adapter(new LogDBOperate());
        fileLog.addFileLog();
        fileLog.getFileLog();
        fileLog.removeFileLog();

    }
}
