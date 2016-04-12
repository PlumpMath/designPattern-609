import java.util.HashMap;
import java.util.Map;

/**
 * 简单演示扩展的单例模式，创造3个实例
 * TODO 扩展调度算法
 * Created by jerry on 16-4-12.
 */
public class SingletonExtend {
    /**
     * 定义一个缺省的key前缀
     */
    private final static String DEFAULT_PREKEY = "Cache";
    /**
     * 缓存实例的容器
     */
    private static Map<String, SingletonExtend> map = new HashMap<String, SingletonExtend>();
    /**
     * 用来记录当前第几个实例
     */
    private static int num = 1;
    /**
     * 最大实例个数
     */
    private final static int MAX_NUM = 3;

    private SingletonExtend() {
    }

    public static SingletonExtend getInstance() {
        String key = DEFAULT_PREKEY + num;
        SingletonExtend singletonExtend = map.get(key);
        if (singletonExtend == null) {
            singletonExtend = new SingletonExtend();
            map.put(key, singletonExtend);
        }
        ++num;
        if (num > MAX_NUM)
            num = 1;

        return singletonExtend;
    }

    public static void main(String[] args) {
        SingletonExtend s1 = getInstance();
        SingletonExtend s2 = getInstance();
        SingletonExtend s3 = getInstance();
        SingletonExtend s4 = getInstance();
        SingletonExtend s5 = getInstance();
        SingletonExtend s6 = getInstance();

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("s5="+s5);
        System.out.println("s6="+s6);
    }
}
