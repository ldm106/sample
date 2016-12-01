import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1{

	public static void main(String[] args){
		try{
			//FileNotFoundException을 던지는 생성자
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));

			//IOException을 던지는 메소드
			String text = reader.readLine();//예외를 발생시켜 던지는 메소드이다.
			System.out.println("파일 내용:"+text);
		} catch(FileNotFoundException fnfe){
			System.out.println("예외발생");
			System.out.println("예외객체:"+fnfe);
			fnfe.printStackTrace(); // 오류를 추적할 수 있는 정보를 화면에 출력하는 메소드

			// 예외 처리 코드 작성
			// 1. 사용자 친화적인 사용자 친화적인 에러메세지
			System.out.println("파일을 찾을수 없습니다. 경로 및 파일명을 확인하세요.");
		} catch(IOException io){
			System.out.println("파일을 읽어오는 도중 오류가 발생. 접속상태 확인");

		}

	

		
	}
}
