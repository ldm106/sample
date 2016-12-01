public class App{
public static void main(String[] args){
	//System.out.println(A.y);// static int y는 객체생성이 안되도 컴파일 된다.
	// 정적변수 y에 값 할당하기
	// A클래스를 사용해서 만든 모든 객체는
	// 정적변수 y값을 경우하낟.
	//A.y=100;
	//멤버 변수x는 생성된 객체마다 개별적으로 값가짐
	//각각의 객체는 객체마다 ㅁ다른 x값을 가질 수 있다.

	// x는 새로 생기므로 값은 변동이 없으나 y는 새로 생성이 되지않고 그대로 있어 기존값이 있으므로 플러스 1이 증가된다.
	A a1=new A();
	//a1.x=10;
	System.out.println("x:"+a1.x);
	System.out.println("y:"+A.y); //y값이 출력되기는 하지만, y값을 멤버변수로 오해하기 쉽다.

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