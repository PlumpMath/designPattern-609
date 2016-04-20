import java.io.Serializable;

/**
 * 日志数据对象，这里为了方便，简化好多字段
 * Created by jerry on 16-4-20.
 */
public class LogModel implements Serializable{

    /**
     * 日志ID
     */
    private String logId;
    /**
     * 操作人员
     */
    private String operateUser;
    /**
     * 内容
     */
    private String content;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
