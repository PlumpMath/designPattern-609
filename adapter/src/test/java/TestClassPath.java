/**
 * Created by jerry on 16-4-20.
 */
public class TestClassPath {
    public static void main(String[] args) {
        System.out.println(TestClassPath.class.getResource("").getPath());
    }
}
