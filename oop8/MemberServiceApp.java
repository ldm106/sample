public class MemberServiceApp{
	
	public static void main(String[] args){
	Member user=new Member();
	user.setName("이동민");
	user.setId("ldm106");
	user.setAge(25);
	user.setPassword(3514);
	Member user1=user;

	MemberService ms=new MemberService(user1);

	boolean result=ms.login("ldm106",3514);
	if(result){
		System.out.println("로그인 가능");
	}else{
		System.out.println("로그인 실패");
	}

	ms.logout("ldm16");


		/*
			이름:		홍길동
			아이디:		hong
			비밀번호:	1234
			나이:       25
			정보를 가진 Member객체를 담고 있는 MemberService 객체 생성
		*/
	}
}