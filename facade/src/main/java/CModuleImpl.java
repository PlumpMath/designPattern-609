/**
 * @Description C模块实现
 * @author jerry 
 * @date 2016年4月11日下午2:17:10
 */
public class CModuleImpl implements CModuleApi {

	@Override
	public void c1() {
		System.out.println("调用了C模块");
	}

	@Override
	public void c2() {
		//TODO 主要用于子模块间互相调用
	}

	@Override
	public void c3() {
		//TODO 主要用于子模块间互相调用
	}
}
