public class Contact
{
	private int no;
	private String name;
	private String phone;
	private String email;

	//�⺻������
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
		System.out.println("����� ��ȣ:"+no);
		System.out.println("����� �̸�:"+name);
		System.out.println("����� ��ȭ��ȣ:"+phone);
		System.out.println("����� �̸���:"+email);


	}
	//gettet/setter �޼ҵ�

}
