
public class AccountApp{
	public static void main(String[] args){
	Account acc=new Account("이동민","110-315-992989",3514,1000000);
	//System.out.println(acc.owner); owner에 접근할수 없다.
	
	System.out.println("예금주:"+acc.getOwner());
	acc.info();
	

	
	}
}