public class Demo11{
	public static void main(String[] args){
		// ��� ������
		//�׻� �����͸� �����ö� �����̸��� �����´�.
		int a = 10;
		int b = 5;
		
		// ������ �׻� ���ο� ���� �����س���. 
		// �ݵ�� �� ���� ������ ��´�.
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);

		// + �����ڴ� ���ڿ��� ���� ���� ��� �̾���̱�� �����Ѵ�.
		// "���ڿ�" + ���� ----> "���ڿ�����"
		// ���� + "���ڿ�" ----> "���ڿ�"
		// "���ڿ�" + "���ڿ�" ---> "���ڿ����ڿ�"
		String x = "�����ٶ�";
		String y = "hello";
		
		String z = x+y;
		System.out.println(z);

		System.out.println(3+6+"Hello");
		System.out.println("hello"+3+6);
		
		System.out.println("hello"+(3+6));


		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("����:" +(kor + eng + math));
	}
}
