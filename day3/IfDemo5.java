import java.util.Scanner;

public class IfDemo5{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1: Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
	
	System.out.print("�ݾ��� �Է�:");
	int money = sc.nextInt();
	System.out.print("���Ḧ ������");
	int no = sc.nextInt();

	int returnCoin=0;
		if(no==1){
			System.out.println("Ŀ�Ǹ� �޾ư�����");
			returnCoin = money - 1500;}
		else if(no==2){
			System.out.println("�����ֽ��� �޾ư�����");
			returnCoin = money - 2000;}
		else if(no==3){
			System.out.println("�̿����Ḧ �޾ư�����");
			returnCoin = money - 1000;}
		else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			}
			System.out.println("�Ž�����:"+returnCoin+"��");
	}
}
