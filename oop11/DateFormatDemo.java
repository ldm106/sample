import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatDemo{

	public static void main(String[] args){

		Date now = new Date();

		//String pattern= "yy년 M월 D일 E요일";
		String pattern = "a H시 m분 s초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text=sdf.format(now);
		System.out.println(text);
			
		//
	}
}