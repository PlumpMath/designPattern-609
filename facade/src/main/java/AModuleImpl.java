/**
 * @Description A模块实现
 * @author jerry 
 * @date 2016年4月11日下午2:17:10
 */
public class AModuleImpl implements AModuleApi {

	@Override
	public void a1() {
		System.out.println("调用了A模块");
	}

	@Override
	public void a2() {
		//TODO 主要用于子模块间互相调用
	}

	@Override
	public void a3() {
		//TODO 主要用于子模块间互相调用
	}
}
