/**
 * @Description 工厂类，创建实例
 * @author jerry 
 * @date 2016年4月11日下午3:19:45
 */
public class Factory {

	private Factory(){}
	
	public static FacadeApi createFacade() {
		return new FacadeImpl();
	}
}
