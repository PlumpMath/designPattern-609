/**
 * @Description B模块实现
 * @author jerry 
 * @date 2016年4月11日下午2:17:10
 */
public class BModuleImpl implements BModuleApi {

	@Override
	public void b1() {
		System.out.println("调用了B模块");
	}

	@Override
	public void b2() {
		//TODO 主要用于子模块间互相调用
	}

	@Override
	public void b3() {
		//TODO 主要用于子模块间互相调用
	}
}
