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
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		System.out.println("auth:"+auth);
		}else{
			auth=true;
		System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		System.out.println("auth:"+auth);
		}

	}
	
	// ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�

	// ���̵� ���޹޾Ƽ� �α׾ƿ� ����� �����ϴ� �޼ҵ�
}