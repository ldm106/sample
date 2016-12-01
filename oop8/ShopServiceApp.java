public class ShopServiceApp{
	public static void main(String[] args){

	ShopService obj1=ShopService.getInstance();
	ShopService obj2=ShopService.getInstance();
	System.out.println(obj1);
	System.out.println(obj2);

	}
}