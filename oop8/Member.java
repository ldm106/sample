public class Member{
	// 필드 정의
	private String name;
	private String id;
	private int password;
	private int age;

	// 기본 생성자 정의
	public Member(){

	}
	public Member(String name,String id){
		this.name=name;
		this.id=id;
	}
	//getter/setter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPassword(int password){
		this.password=password;
	}
	public int getPassword(){
		return password;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}