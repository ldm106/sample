import java.util.Scanner;
public class Quizz4{
public static void main(String[] args){
	// 아이디를 입력받아서 올바른 아이디인지 검사하기
	// 아이디 작성규칙(길이가 6글자 이상, 영어소문자)
	Scanner sc=new Scanner(System.in);

	System.out.print("아이디를 입력:");
	String userId = sc.next();

	//검사하기

	//아이디가 6글자 이상인지 검사하기
	if(userId.length()<6){
		System.out.println("6글자 이상 입력하세요.");
		return;
	}
	//아이디가 영어 소문자로만 구성되었는지 검사하기<------- boolean
	boolean invalid = false;
	for(int i=0;i<userId.length();i++){
		int value = (int)userId.charAt(i);
		if(value<97||value>122){
			invalid = true;
			break;
		}
	}
	if(invalid){
		System.out.println("소문자만 입력가능");
	}

	}
}