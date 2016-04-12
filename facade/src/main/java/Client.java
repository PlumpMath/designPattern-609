public class Client {

	public static void main(String[] args) {
//		AModuleApi a = new AModuleImpl();
//		a.a1();
//		BModuleApi b = new BModuleImpl();
//		b.b1();
//		CModuleApi c = new CModuleImpl();
//		c.c1();
		
//		Facade.test();
		
		FacadeApi api = Factory.createFacade();
		api.test();
	}
}
