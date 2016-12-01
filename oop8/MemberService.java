public class MemberService{

	private Member member;
	private boolean auth = false;
	public MemberService(Member member){
		this.member = member;
	}
	public boolean isAuth(){
		return auth;
	}
	public boolean login(String id,int password){
		if((member.getId()).equals(id)&& member.getPassword()==password){
			auth=true;
		}else{
			auth=false;
		}
		return auth;

	}
	public void logout(String id){
		if((member.getId()).equals(id)){
			auth=false;
		System.out.println("로그아웃되었습니다.");
		System.out.println("auth:"+auth);
		}else{
			auth=true;
		System.out.println("아이디가 일치하지 않습니다.");
		System.out.println("auth:"+auth);
		}

	}
	
	// 아이디와 비밀번호를 전달받아서 로그인가능 여부를 반환하는 메소드

	// 아이디를 전달받아서 로그아웃 기능을 수행하는 메소드
}