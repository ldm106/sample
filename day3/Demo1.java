public class Demo1{
	public static void main(String[] args){
		// 논리 연산자.

	int x=  10;
	int y = 10;
	//&&는 좌변이 false면 무조건 false이다.
	boolean result1 = false && x++>10;
	//&는 좌변이 false이면 우변이 계산되어야 한다.
	boolean result2 = false & y++>10;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println("x:"+x);
	System.out.println("y:"+y);

	}
}