	import java.util.Scanner;
	public class AccountApp{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Account a=new Account();

	for(;;){
	System.out.println("1.��� 2.��ȸ 3.������� 4.�Ա� 5.��� 6.����\n");
	System.out.print("�޴� ����:");
	int menuNo=sc.nextInt();
	if(menuNo==1){
			System.out.println("�̸��� ��й�ȣ �Աݾ��� �Է��Ͻÿ�:");
			System.out.print("�̸� �Է�:");
			String name=sc.next();
			a.setName(name);
			System.out.print("��й�ȣ �Է�:");
			int password=sc.nextInt();
			a.setPassword(password);
			System.out.print("�����Աݾ��Է�:");
			int balance=sc.nextInt();
			a.setBalance(balance);

			a.setAccount("110-315-992989");
	}else if(menuNo==2){
			System.out.println("�̸�:"+a.getName()+" ���¹�ȣ:"+a.getAccount()+" �ܾ�:"+a.getBalance());


	}else if(menuNo==3){
			System.out.print("��й�ȣ�� �ٲٽ÷��� ���� ��й�ȣ�� �Է��Ͻÿ�:");
			int password1=sc.nextInt();
			if(password1==a.getPassword()){
					System.out.print("���� ��й�ȣ�� �����Ƿ� �� ��й�ȣ�� �Է��Ͻÿ�:");
					int password2=sc.nextInt();
					a.setPassword(password2);
					System.out.println("��й�ȣ�� ���������� ����Ǿ����ϴ�.");
					System.out.println("�� ��й�ȣ:"+a.getPassword());
			}else{
				System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�. ó������ �ٽý����Ͻʽÿ�.");
			}

	}else if(menuNo==4){
		System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�:");
		int plusmoney=sc.nextInt();
		
		a.setBalance(a.getBalance() + plusmoney);
		System.out.println("�ܾ���"+a.getBalance()+"�Դϴ�.");


	}else if(menuNo==5){
		System.out.print("��й�ȣ �Է��Ͻÿ�:");
		int confirm=sc.nextInt();
		if(confirm == a.getPassword()){
			System.out.print("��ݾ��� �Է��Ͻÿ�:");
			int minusmoney=sc.nextInt();
			a.setBalance(a.getBalance() - minusmoney);
			System.out.println("�ܾ���"+a.getBalance()+"�Դϴ�.");
		}else{
		System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}

	}else if(menuNo==6){
		System.out.println("�����մϴ�.");
		break;
	}



	}
	
	


	}
}