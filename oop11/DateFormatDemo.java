import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatDemo{

	public static void main(String[] args){

		Date now = new Date();

		//String pattern= "yy�� M�� D�� E����";
		String pattern = "a H�� m�� s��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text=sdf.format(now);
		System.out.println(text);
			
		//
	}
}