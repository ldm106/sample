public class Contact{
	// 속성 정의하기
	
	// 순번
	// 이름
	// 연락처
	// 이메일
	
	// 기능 정의하기
	// 전화하기 call()
	// 문자보내기 sendMessage()
	// 메일보내기 sendMail()
	// 클래스에는 값을 저장하지 않는다.
	// 설계도만 첫 글자만 대문자로 한다.
	int no;
	String name;
	String tel;
	String email;

	public void call(){
	System.out.println(tel+" 로 전화 겁니다.");
	}
	public void sendMessage(){
	System.out.println(tel+" 로 문자 보냅니다.");
	}
	public void sendMail(){
	System.out.println(email+" 로 메일 보냅니다.");
	}
}
