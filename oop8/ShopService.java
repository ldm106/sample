public class ShopService{
private static ShopService s=new ShopService();

private ShopService(){
}

static ShopService getInstance(){
return s;
}

}