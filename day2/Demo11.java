public class Demo11{
	public static void main(String[] args){
		// 산술 연산자
		//항상 데이터를 가져올때 변수이름을 가져온다.
		int a = 10;
		int b = 5;
		
		// 연산은 항상 새로운 값을 생성해낸다. 
		// 반드시 그 값을 변수에 담는다.
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);

		// + 연산자는 문자열과 관련 있을 경우 이어붙이기로 동작한다.
		// "문자열" + 숫자 ----> "문자열숫자"
		// 숫자 + "문자열" ----> "문자열"
		// "문자열" + "문자열" ---> "문자열문자열"
		String x = "가나다라";
		String y = "hello";
		
		String z = x+y;
		System.out.println(z);

		System.out.println(3+6+"Hello");
		System.out.println("hello"+3+6);
		
		System.out.println("hello"+(3+6));


		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("총점:" +(kor + eng + math));
	}
}
