public class MethodDemo1{
	//�޼ҵ� ����(����)
	public static void a(){
		System.out.println("����ڰ� ������ a �޼ҵ��Դϴ�.");
	}
	
	//�Ű������� ������ �ִ� �޼ҵ� ����
	//�Ű������� �޼ҵ� ���࿡ �ʿ��� ���� ���޹޾Ƽ� ��´�.
	public static void b(int x){
		System.out.println("b�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("b�޼ҵ� ����� ���޹��� ��:"+x);
	}
	public static void c(String str){
		// �޼ҵ带 ȣ��(����)
		a();
		//�Ű������� �ִ� �޼ҵ� ȣ��
		b(100);
		int k = 20;
		b(k);
	}
	public static void d(int x,int y){
		System.out.println("d�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("d�޼ҵ� ����� ���޹��� ��:"+x+","+y);
	}
	public static void e(String name,String email,int age){
		System.out.println("e�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("e�޼ҵ� ����� ���޹��� ��:"+name);
		System.out.println("e�޼ҵ� ����� ���޹��� ��:"+email);
		System.out.println("e�޼ҵ� ����� ���޹��� ��:"+age);
	}
	public static void main(String[] args){
	//public: ����������  void:����Ÿ�� main:�޼ҵ� �̸�
	//�޼ҵ带 ȣ��(����)
	a();
	c("�̵���");
	// b(); // ������ ����. b�޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� ������ �ϳ��� ���޵Ǿ�� �Ѵ�.
	}
}
