import java.util.Scanner;

public class Quizz1{
	public static void main(String[] args){
		//이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기

		Scanner sc=new Scanner(System.in);

		System.out.print("이메일 입력:");
		String email =sc.next();
		/*
		int location = email.indexOf("@");
		String id = email.substring(0,location);

		System.out.println("아이디:"+id);
		*/
		String[] arr = email.split("@");
		System.out.println(arr[1]);
	}
}