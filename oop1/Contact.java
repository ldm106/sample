public class Contact{
	// �Ӽ� �����ϱ�
	
	// ����
	// �̸�
	// ����ó
	// �̸���
	
	// ��� �����ϱ�
	// ��ȭ�ϱ� call()
	// ���ں����� sendMessage()
	// ���Ϻ����� sendMail()
	// Ŭ�������� ���� �������� �ʴ´�.
	// ���赵�� ù ���ڸ� �빮�ڷ� �Ѵ�.
	int no;
	String name;
	String tel;
	String email;

	public void call(){
	System.out.println(tel+" �� ��ȭ �̴ϴ�.");
	}
	public void sendMessage(){
	System.out.println(tel+" �� ���� �����ϴ�.");
	}
	public void sendMail(){
	System.out.println(email+" �� ���� �����ϴ�.");
	}
}
