import java.util.Scanner;
public class IfDemo4
{
	public static void main(String[] aggs)
		{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("1: Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
	
	System.out.print("�ݾ��� �Է�:");
	int money = sc.nextInt();
	System.out.print("���Ḧ ������");
	int no = sc.nextInt();

	if( no == 1){
		if(money>=1500){
			System.out.println("Ŀ���Դϴ�. �ܵ��� "+(money-1500)+"�Դϴ�.");
		}else{
			System.out.println("���� ���ڶ��ϴ�.");}
	} else if(no ==2){
		if(money>=2000){
		System.out.println("�����ֽ��Դϴ�. �ܵ��� "+(money-2000)+"�Դϴ�."); }
		else{
			System.out.println("���� ���ڶ��ϴ�.");
		}
	} else if(no==3){
		if(money>=1000){
		System.out.println("�̿������Դϴ�. �ܵ��� "+(money-1000)+"�Դϴ�.");}
		else{
		System.out.println("���� ���ڶ��ϴ�.");
		}}
	else{
		System.out.println("�ش������ �����ϴ�.");
	}
}}