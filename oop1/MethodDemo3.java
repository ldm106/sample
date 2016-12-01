import java.util.Random;
import java.util.Date;

public class MethodDemo3{


	// 난수를 발생시키는 메소드 만들기
	// 반환값이 있기에 int를 적는다.
	// 반환값이 없으면 void라 적는다.
	// 메소드실행시 반환값을 얻는다.
	public static String getCurrentDate(){
		Date now = new Date();
		String str = now.toString();

		return str;
	}

	public static int random(){
		Random r = new Random();
		int number = r.nextInt(101);
		//void가 아닌경우 반드시 반환값 작성. void일 경우엔 필요없다.
		//return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		//return 반환값도 반드시 int와 일치되어야한다.
		return number;
	}

	public static void main(String[] args){
			int x = random();
			System.out.println(x);
			String a = getCurrentDate();
			System.out.println(a);
	}
}
