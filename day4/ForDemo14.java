import java.util.Scanner;

public class ForDemo14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int balance = 0;
		for(;;){
				System.out.println("=================================");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("=================================");
				System.out.println();
				System.out.print("����>");
				int select=sc.nextInt();
				if(select==1){
				System.out.print("���ݾ�>");
				int y=sc.nextInt();
				balance+=y;
				}else if(select==2){
				System.out.print("��ݾ�>");
					
				int c=sc.nextInt();
				balance-=c;
				}else if(select==3){
				System.out.println("�ܰ�>"+(balance));
				}else{
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
