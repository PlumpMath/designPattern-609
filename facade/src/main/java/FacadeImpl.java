/**
 * @Description 外观接口实现
 * @author jerry 
 * @date 2016年4月11日下午3:19:25
 */
public class FacadeImpl implements FacadeApi {

	@Override
	public void a1() {
		new AModuleImpl().a1();
	}

	@Override
	public void b1() {
		new BModuleImpl().b1();
	}

	@Override
	public void c1() {
		new CModuleImpl().c1();
	}

	@Override
	public void test() {
		a1();
		b1();
		c1();
	}
}
