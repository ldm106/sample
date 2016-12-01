import java.text.DecimalFormat;

public class DecimalFormatDemo{
	public static void main(String[] args){
		
		int number = 123456;
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 1112.345;

		String pattern2 = "#.##"; //소수점 2자리까지 표현, 소수점 3자리에서 반올림한다.
		//String pattern2="#,###.####";//빈자리를 채우지 않는다.
		//String pattern2="0,000.0000";
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);
		System.out.println(text2);
	}
}