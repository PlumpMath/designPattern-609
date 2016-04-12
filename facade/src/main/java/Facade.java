/**
 * @Description 外观类,通常设计成单例
 * @author jerry 
 * @date 2016年4月11日下午2:43:26
 */
public class Facade {
	private Facade(){}
	
	public static void test(){
		AModuleApi a = new AModuleImpl();
		a.a1();
		BModuleApi b = new BModuleImpl();
		b.b1();
		CModuleApi c = new CModuleImpl();
		c.c1();
	}
}
