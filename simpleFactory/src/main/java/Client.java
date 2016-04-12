/**
 * @ClassName Client 
 * @Description: 外部调用 
 * @author Jerry 
 * @date 2016年3月27日 上午10:13:35 
 */ 
public class Client {

	public static void main(String[] args) {
//		Api api = new Impl();
		Api api = Factory.createApi();	//无须在客户端直接new具体实现  
		api.test("最爱你的人是我，你怎么舍得我难过");
	}

}
