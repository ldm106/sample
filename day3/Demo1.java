public class Demo1{
	public static void main(String[] args){
		// �� ������.

	int x=  10;
	int y = 10;
	//&&�� �º��� false�� ������ false�̴�.
	boolean result1 = false && x++>10;
	//&�� �º��� false�̸� �캯�� ���Ǿ�� �Ѵ�.
	boolean result2 = false & y++>10;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println("x:"+x);
	System.out.println("y:"+y);

	}
}