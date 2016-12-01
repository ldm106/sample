public class Phone/*extends Object*///안적어면 Object을 상속한다. 모든객체는 Object의 자손이다.
{

	private String tel;
	private String company;

	public Phone(){
		System.out.println("Phone() is running");
	}


	public Phone(String tel, String company){
		super();
		System.out.println("Phone(String,String)is running");
		this.tel=tel;
		this.company=company;
	}

	public String getTel(){
		return tel;
	}
	public String getCompany(){
		return company;
	}
}