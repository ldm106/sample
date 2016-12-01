public class SmartPhone extends Phone{
String ip;
String email;

	public void web(String url){
		System.out.println("["+url+"] 웹 페이지를 표시합니다.");
	}
	public void sendEmail(String to,String title,String text){
		System.out.println("["+email+"]에서 ["+to+"]로 ["+title+"] ["+text+"]를 보냅니다.");
	}
}