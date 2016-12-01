import java.util.Scanner;
public class IfDemo4
{
	public static void main(String[] aggs)
		{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("1: 커피(1500원) 2:과일주스(2000원) 3:이온음료(1000원)");
	
	System.out.print("금액을 입력:");
	int money = sc.nextInt();
	System.out.print("음료를 고르세요");
	int no = sc.nextInt();

	if( no == 1){
		if(money>=1500){
			System.out.println("커피입니다. 잔돈은 "+(money-1500)+"입니다.");
		}else{
			System.out.println("돈이 모자랍니다.");}
	} else if(no ==2){
		if(money>=2000){
		System.out.println("과일주스입니다. 잔돈은 "+(money-2000)+"입니다."); }
		else{
			System.out.println("돈이 모자랍니다.");
		}
	} else if(no==3){
		if(money>=1000){
		System.out.println("이온음료입니다. 잔돈은 "+(money-1000)+"입니다.");}
		else{
		System.out.println("돈이 모자랍니다.");
		}}
	else{
		System.out.println("해당음료는 없습니다.");
	}
}}