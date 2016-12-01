public class WrapperDemo2{
	public static void main(String[] args){

	//Integer의 정적메소드

	//문자열을 int값으로 변환하는 메소드: int parseInt(String text)
	int num1 = Integer.parseInt("123");
	
	//11을 2진수로 알려주는 것이다.
	int num2 = Integer.parseInt("1",2);
	System.out.println("num2: " +num2);

	int num3 = Integer.parseInt("a",16);
	System.out.println("num3:"+num3);
	
	//정수 12를 2진수문자열로 변환해서 사용한다.
	String str1 = Integer.toBinaryString(12);
	System.out.println("str1:"+str1);
	
	//정수 12345를 17진수 문자열로 변환해서 반환한다.
	String str2 = Integer.toHexString(12345);
	System.out.println("str2:"+str2);

	double num4 = Double.parseDouble("3.14");
	System.out.println(num4*2);
	}
}