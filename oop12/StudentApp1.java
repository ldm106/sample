import java.io.*;
public class StudentApp1{
	public static void main(String[] args){
	
	try{
			
			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			//IOException�� ������ �޼ҵ�
			String text = reader.readLine();//���ܸ� �߻����� ������ �޼ҵ��̴�.
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