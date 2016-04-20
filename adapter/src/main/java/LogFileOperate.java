
/**
 * 文件操作接口的实现类
 * Created by jerry on 16-4-20.
 */
public class LogFileOperate implements LogFileOperateApi {

    /**
     * 从文件里读取日志
     */
    @Override
    public void getFileLog() {
        System.out.println("读取文件日志");
    }

    /**
     * 将日志写入文件当中去
     */
    @Override
    public void addFileLog() {
        System.out.println("增加文件日志");
    }

    /**
     * 删除一条日志
     */
    @Override
    public void removeFileLog() {
        System.out.println("删除文件日志");
    }
}
