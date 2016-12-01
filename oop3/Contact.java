public class Contact
{
	private int no;
	private String name;
	private String phone;
	private String email;

	//기본생성자
	public Contact(){

	}
	public void setNo(int no){
		this.no=no;
	}
	public int getNo(){
		return no;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void info(){
		System.out.println("사용자 번호:"+no);
		System.out.println("사용자 이름:"+name);
		System.out.println("사용자 전화번호:"+phone);
		System.out.println("사용자 이메일:"+email);


	}
	//gettet/setter 메소드

}
