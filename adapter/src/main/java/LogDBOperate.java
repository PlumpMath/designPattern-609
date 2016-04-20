/**
 * Created by jerry on 16-4-20.
 */
public class LogDBOperate implements LogDBOperateApi {
    /**
     * 从文件里读取日志
     */
    @Override
    public void getDBLog() {
        System.out.println("读取数据库日志");
    }

    /**
     * 将日志写入文件当中去
     */
    @Override
    public void addDBLog() {
        System.out.println("增加数据库日志");
    }

    /**
     * 删除一条日志
     */
    @Override
    public void removeDBLog() {
        System.out.println("删除数据库日志");
    }
}
