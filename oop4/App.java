public class App{
public static void main(String[] args){
	//System.out.println(A.y);// static int y�� ��ü������ �ȵǵ� ������ �ȴ�.
	// �������� y�� �� �Ҵ��ϱ�
	// AŬ������ ����ؼ� ���� ��� ��ü��
	// �������� y���� ����ϳ�.
	//A.y=100;
	//��� ����x�� ������ ��ü���� ���������� ������
	//������ ��ü�� ��ü���� ���ٸ� x���� ���� �� �ִ�.

	// x�� ���� ����Ƿ� ���� ������ ������ y�� ���� ������ �����ʰ� �״�� �־� �������� �����Ƿ� �÷��� 1�� �����ȴ�.
	A a1=new A();
	//a1.x=10;
	System.out.println("x:"+a1.x);
	System.out.println("y:"+A.y); //y���� ��µǱ�� ������, y���� ��������� �����ϱ� ����.

	A a2=new A();
	//a2.x=20;
	System.out.println("x:"+a2.x);
	System.out.println("y:"+A.y);

	A a3=new A();
	//a3.x=30;
	System.out.println("x:"+a3.x);
	System.out.println("y:"+A.y);
}
}