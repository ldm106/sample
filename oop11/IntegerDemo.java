public class IntegerDemo{

	public static void main(String[] args){
		//���� 23�� ������ �ִ� Integer ��ü�� �����ϴ� a
		Integer a = new Integer("12345");//<==�ڽ�
		// ���� 23�� �����ϰ� �ִ� b
		//Integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ�:int intValue()
		int x = a.intValue();//<========��ڽ�
		double y = a.doubleValue();
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
		int b = 23;
	}
}