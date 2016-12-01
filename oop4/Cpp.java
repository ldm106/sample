public class Cpp{
public static void main(String[] args) throws Exception {
	
	Class.forName("C"); //-------->초기화블록이 실행
	//C는 클래스이름.
	//해당클래스를 메모리에 로딩시켜주는 명령어
	//Class.forName("전체 클래스이름")
	//해당클래스를 찾아서 메모리에 로딩한다.
	//Static블록은 한번만 실행이 된다. 
	//C c1=new C();
	//C c2=new C();
	//C c3=new C();
	
	
	System.out.println(C.y);
	System.out.println(C.y);
	System.out.println(C.y);
	
}

}