import java.util.Scanner;

public class Quizz3{
	public static void main(String args[]){
		//������ ���ڸ� �Է¹޾Ƽ� �� ���� ¦������ Ȧ������
		// ���� �����ڸ� �̿��ؼ� ����� ǥ���ϱ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = sc.nextInt();

		String k = (num%2==0)? "¦��":"Ȧ��";

		System.out.println("�� ���ڴ� " + k+"�Դϴ�.");
	}
}