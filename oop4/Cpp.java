public class Cpp{
public static void main(String[] args) throws Exception {
	
	Class.forName("C"); //-------->�ʱ�ȭ����� ����
	//C�� Ŭ�����̸�.
	//�ش�Ŭ������ �޸𸮿� �ε������ִ� ��ɾ�
	//Class.forName("��ü Ŭ�����̸�")
	//�ش�Ŭ������ ã�Ƽ� �޸𸮿� �ε��Ѵ�.
	//Static����� �ѹ��� ������ �ȴ�. 
	//C c1=new C();
	//C c2=new C();
	//C c3=new C();
	
	
	System.out.println(C.y);
	System.out.println(C.y);
	System.out.println(C.y);
	
}

}