import java.util.Scanner;
public class Quizz4{
public static void main(String[] args){
	// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
	// ���̵� �ۼ���Ģ(���̰� 6���� �̻�, ����ҹ���)
	Scanner sc=new Scanner(System.in);

	System.out.print("���̵� �Է�:");
	String userId = sc.next();

	//�˻��ϱ�

	//���̵� 6���� �̻����� �˻��ϱ�
	if(userId.length()<6){
		System.out.println("6���� �̻� �Է��ϼ���.");
		return;
	}
	//���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ�<------- boolean
	boolean invalid = false;
	for(int i=0;i<userId.length();i++){
		int value = (int)userId.charAt(i);
		if(value<97||value>122){
			invalid = true;
			break;
		}
	}
	if(invalid){
		System.out.println("�ҹ��ڸ� �Է°���");
	}

	}
}