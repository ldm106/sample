public abstract class DBAccess{

	public void connect(){
		System.out.println("db�� �����մϴ�.");
	}
	
	//�߻�ȭ
	public abstract void createRepository();
	

	public void disconnect(){
		System.out.println("db�� ������ �����մϴ�.");
	}
}