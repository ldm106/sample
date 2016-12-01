public abstract class DBAccess{

	public void connect(){
		System.out.println("db와 연결합니다.");
	}
	
	//추상화
	public abstract void createRepository();
	

	public void disconnect(){
		System.out.println("db와 연결을 배제합니다.");
	}
}