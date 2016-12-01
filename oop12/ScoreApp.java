import java.io.*;
import java.text.DecimalFormat;
public class ScoreApp{

	public static Score parseDate(String text){
	Score ss=new Score();
	String a[]=text.split(",");
	ss.setName(a[0]);
	ss.setGrade(a[1]);
	ss.setKor(Integer.parseInt(a[2]));
	ss.setEng(Integer.parseInt(a[3]));
	ss.setMath(Integer.parseInt(a[4]));

	return ss;
		
		
	}
	public static void main(String[] args)throws Exception{
	BufferedReader reader = new BufferedReader(new FileReader("Score1.txt"));
	String pattern="#.##";
	DecimalFormat df=new DecimalFormat(pattern);
	Score[] s=new Score[10];
	s[0]=parseDate(reader.readLine());
	s[1]=parseDate(reader.readLine());
	s[2]=parseDate(reader.readLine());
	s[3]=parseDate(reader.readLine());
	s[4]=parseDate(reader.readLine());
	s[5]=parseDate(reader.readLine());
	s[6]=parseDate(reader.readLine());
	s[7]=parseDate(reader.readLine());
	s[8]=parseDate(reader.readLine());
	s[9]=parseDate(reader.readLine());

	System.out.println("이름     학년   국어  영어  수학  총점  평균");
	for(Score sc:s){
		int sum=sc.getKor()+sc.getEng()+sc.getMath();
		double avg=(double)sum/3;
		
	System.out.println(sc.getName()+" "+sc.getGrade()+" "+sc.getKor()+" "+sc.getEng()+" "+sc.getMath()+
		" "+sum+" "+df.format(avg));

	}

	}

}