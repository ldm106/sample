public class MemberApp{
	public static void main(String[] args){

		// ȸ�������� ������� Member ��ü�� �����ϰ�
		// setter�� ����ؼ� �̸�,���̵�,���,���̵��� �����͸� ��ü�� �����ϱ�
		Member m = new Member();
		m.setId("ldm106");
		m.setName("�̵���");
		m.setPassword(3514);
		m.setAge(25);

		System.out.println("��    ��:"+m.getName());
		System.out.println("�� �� ��:"+m.getId());
		System.out.println("��й�ȣ:"+m.getPassword());
		System.out.println("��    ��:"+m.getAge());
		
	}
}