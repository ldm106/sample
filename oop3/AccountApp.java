
public class AccountApp{
	public static void main(String[] args){
	Account acc=new Account("�̵���","110-315-992989",3514,1000000);
	//System.out.println(acc.owner); owner�� �����Ҽ� ����.
	
	System.out.println("������:"+acc.getOwner());
	acc.info();
	

	
	}
}