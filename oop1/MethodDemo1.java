public class MethodDemo1{
	//메소드 정의(구현)
	public static void a(){
		System.out.println("사용자가 정의한 a 메소드입니다.");
	}
	
	//매개변수를 가지고 있는 메소드 정의
	//매개변수는 메소드 실행에 필요한 값을 전달받아서 담는다.
	public static void b(int x){
		System.out.println("b메소드가 실행되었습니다.");
		System.out.println("b메소드 실행시 전달받은 값:"+x);
	}
	public static void c(String str){
		// 메소드를 호출(실행)
		a();
		//매개변수가 있는 메소드 호출
		b(100);
		int k = 20;
		b(k);
	}
	public static void d(int x,int y){
		System.out.println("d메소드가 실행되었습니다.");
		System.out.println("d메소드 실행시 전달받은 값:"+x+","+y);
	}
	public static void e(String name,String email,int age){
		System.out.println("e메소드가 실행되었습니다.");
		System.out.println("e메소드 실행시 전달받은 값:"+name);
		System.out.println("e메소드 실행시 전달받은 값:"+email);
		System.out.println("e메소드 실행시 전달받은 값:"+age);
	}
	public static void main(String[] args){
	//public: 접근제한자  void:리턴타입 main:메소드 이름
	//메소드를 호출(실행)
	a();
	c("이동민");
	// b(); // 컴파일 오류. b메소드를 실행하기 위해서는 반드시 정수값 하나가 전달되어야 한다.
	}
}
