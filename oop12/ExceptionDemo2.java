import java.io.*;

public class ExceptionDemo2{

	//reading()은 자신이 사용하는 실행문에서 발생하는 예외를 처리하지 않는다.
	//대신 발생이 예상되는 예외를 다시 던져버린다.
	public static void reading() throws FileNotFoundException,IOException{

			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("내용: " + text);
	}
	// main()메소드는 reading() 메소드가 던지는 예외에 대한 처리를 구현하고 있다.
	// reading()메소드는 자신을 사용하는 main()에게 예외처리 책임을 떠넘긴다.
	public static void main(String[]args){

			try{

				reading();
			}catch(FileNotFoundException a1){
				System.out.println("파일을 찾을 수 없습니다.");

	}catch(IOException a2){
		System.out.println("파일을 읽는 중 오류가 발생했습니다.");

	}


		

	}
}