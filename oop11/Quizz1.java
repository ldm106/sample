import java.util.Scanner;

public class Quizz1{
	public static void main(String[] args){
		//�̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�

		Scanner sc=new Scanner(System.in);

		System.out.print("�̸��� �Է�:");
		String email =sc.next();
		/*
		int location = email.indexOf("@");
		String id = email.substring(0,location);

		System.out.println("���̵�:"+id);
		*/
		String[] arr = email.split("@");
		System.out.println(arr[1]);
	}
}