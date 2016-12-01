public class MemberApp{
	public static void main(String[] args){

		// 회원정보를 담기위한 Member 객체를 생성하고
		// setter를 사용해서 이름,아이디,비번,나이등의 데이터를 객체에 저장하기
		Member m = new Member();
		m.setId("ldm106");
		m.setName("이동민");
		m.setPassword(3514);
		m.setAge(25);

		System.out.println("이    름:"+m.getName());
		System.out.println("아 이 디:"+m.getId());
		System.out.println("비밀번호:"+m.getPassword());
		System.out.println("나    이:"+m.getAge());
		
	}
}