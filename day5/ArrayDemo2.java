public class ArrayDemo2
{
	public static void main(String[] args){
		//�迭 �����ϱ�
		//int[] arr={1,2,4,5,6}; <---���� ������ �ִ� �迭 ����
		//int[] arr = new int[3];<--- �� 3���� ���� �� �ִ� �迭 ����, �̶��� 3�� ��� 0,0,0�� ����մ�.�Ǽ� Ÿ���̸� 0.0�� ����ְ� ���� Ÿ���̸� ���� null�̴�.
		//                       <---������ �迭�� �⺻��0���� ä�����ִ�.
		//������ 0,�Ǽ��� 0.0, �������� \u0000,boolean���� false(�⺻��),�������� null
		//stack���������� �ʱ�ȭ�� ���־�� �Ѵ�. int a= 0; String b= null;
		boolean [] numbers = new boolean[3];
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers); //�ּҰ� �ƴϴ�. ��ü�� �ĺ��ϱ� ���� �ڵ�(�ؽ��ڵ�) 
		
		String[] names = new String[2];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names);	//�ּҰ� �ƴϴ�.
	}
}
