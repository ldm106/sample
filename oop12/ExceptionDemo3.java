import java.io.*;

public class ExceptionDemo3{

/*	public static void writing() throws Hta{
		try{
			FileWriter writer = new FileWriter("mm.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";
			writer.write(text);
			writer.flush();
		} catch(FileNotFoundException e){
			throw new Hta();
		} catch(IOException e){
			throw new Hta();
		}
	}*/

	public static void reading() throws Hta{

		try{
		BufferedReader reader = new BufferedReader(new FileReader("11.txt"));
		String text = reader.readLine();
		System.out.println("내용:"+text);
	
		}catch(FileNotFoundException e){
			//FileNotFoundException이 발생한 것을 가로채고,대신 HtaException을 생성해서 던지기
			//throw new Hta(); //예외를 생성해서 발생
		}catch(IOException e){
			
			//throw new Hta(); //예외를 생성해서 발생
		}
	}
	public static void main(String[] args){
		try{
			reading();
			//writing();
		}
			catch(Hta e){
		System.out.println("예외발생");
		}

	}
}