public class Account{
	//�̸�,���¹�ȣ,��й�ȣ,�ܾ�
	private String name;
	private String account="110-315-992989";
	private int password;
	private int balance;
	
	public Account(){

	}
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return name;
	}
	public void setAccount(String account){
	this.account=account;
	}
	public String getAccount(){
	return account;
	}
	public void setPassword(int password){
	this.password=password;
	}
	public int getPassword(){
	return password;
	}
	public void setBalance(int balance){
	this.balance=balance;
	}
	public int getBalance(){
	return balance;
	}
	


}