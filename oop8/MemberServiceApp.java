public class MemberServiceApp{
	
	public static void main(String[] args){
	Member user=new Member();
	user.setName("�̵���");
	user.setId("ldm106");
	user.setAge(25);
	user.setPassword(3514);
	Member user1=user;

	MemberService ms=new MemberService(user1);

	boolean result=ms.login("ldm106",3514);
	if(result){
		System.out.println("�α��� ����");
	}else{
		System.out.println("�α��� ����");
	}

	ms.logout("ldm16");


		/*
			�̸�:		ȫ�浿
			���̵�:		hong
			��й�ȣ:	1234
			����:       25
			������ ���� Member��ü�� ��� �ִ� MemberService ��ü ����
		*/
	}
}