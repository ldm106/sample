public class Address{

	private String zipcode;
	private String sido;
	private String gagun;
	private String detail;

	public Address(){}
	public Address(String zipcode,String sido,String gugun,String detail){
		this.zipcode=zipcode;
		this.sido=sido;
		this.gagun=gagun;
		this.detail=detail;
	}
	public String getZipcode(){
		return zipcode;
	}
	public void setZipcode(String zipcode){
		this.zipcode=zipcode;
	}
	public String getSido(){
		return sido;
	}
	public void setSido(String sido){
		this.sido=sido;
	}
	public String getGagun(){
		return gagun;
	}
	public void setGagun(String gagun){
		this.gagun=gagun;
	}
	public String getDetail(){
		return detail;
	}
	public void setDetail(String detail){
		this.detail=detail;
	}

	
}