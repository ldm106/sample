public class Phone{
	
	//부모클래스로부터 물려받은 필드.
	String tellNumber;
	public Phone(){

}
	
	public void call(String to){
		System.out.println("["+tellNumber+"]에서 ["+to+"]로 전화를 겁니다.");
	}
	
	public void message(String to,String text){
		System.out.println("["+tellNumber+"]에서 ["+to+"]로 ["+text+"]를 보냅니다.");
	}
	
}