import java.io.*;
public class StudentApp1{
	public static void main(String[] args){
	
	try{
			
			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			//IOException을 던지는 메소드
			String text = reader.readLine();//예외를 발생시켜 던지는 메소드이다.
			String []a=text.split(",");
			Student s=new Student();
			s.setName(a[0]);
			s.setGrade(a[1]);
			s.setKor(Integer.parseInt(a[2]));
			s.setEng(Integer.parseInt(a[3]));
			s.setMath(Integer.parseInt(a[4]));
			s.info();

	}catch(FileNotFoundException e){

	}catch(IOException e){

	}
	

	}
}