import java.util.List;

/**
 * 操作数据库日志
 * Created by jerry on 16-4-20.
 */
public interface LogDBOperateApi {
    /**
     * 从文件里读取日志
     */
    public void getDBLog();

    /**
     * 将日志写入文件当中去
     */
    public void addDBLog();

    /**
     * 删除一条日志
     */
    public void removeDBLog();
}
