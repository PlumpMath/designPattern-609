
/**
 * 日志文件操作接口
 * Created by jerry on 16-4-20.
 */
public interface LogFileOperateApi {

    /**
     * 从文件里读取日志
     */
    public void getFileLog();

    /**
     * 将日志写入文件当中去
     */
    public void addFileLog();

    /**
     * 删除一条日志
     */
    public void removeFileLog();

}
