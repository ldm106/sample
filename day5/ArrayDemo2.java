public class ArrayDemo2
{
	public static void main(String[] args){
		//배열 생성하기
		//int[] arr={1,2,4,5,6}; <---값을 가지고 있는 배열 생성
		//int[] arr = new int[3];<--- 값 3개를 담을 수 있는 배열 생성, 이때는 3개 모두 0,0,0이 들어잇다.실수 타입이면 0.0이 들어있고 참조 타입이면 전부 null이다.
		//                       <---정수형 배열의 기본값0으로 채워져있다.
		//정수형 0,실수형 0.0, 문자형은 \u0000,boolean형은 false(기본값),참조형은 null
		//stack영역에서는 초기화를 해주어야 한다. int a= 0; String b= null;
		boolean [] numbers = new boolean[3];
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers); //주소값 아니다. 객체를 식별하기 위한 코드(해시코드) 
		
		String[] names = new String[2];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names);	//주소값 아니다.
	}
}
