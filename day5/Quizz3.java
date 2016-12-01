
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class Quizz3{
	public static void main(String[] args){
Random r=new Random();
Scanner sc=new Scanner(System.in);

//임의의 숫자
int []numbers=new int[3];
//사용자가 입력한 답을 저장한 배열

int position =0;
for(;;){
	int number=r.nextInt(10);
	boolean isExist =false;
	for(int i =0;i<position;i++){
		if(numbers[i]==number){
			isExist=true;
			}}
			if(!isExist){
				numbers[position]=number;
				position++;
			}
			if(position==3){
				break;
			}
}
System.out.println("랜덤 숫자: ["+numbers[0]+","+numbers[1]+","+numbers[2]+"]");



boolean isSuccess=false;
int answerCount=0;
	
for(int i=0;i<=10;i++){	
	int strike = 0;
int ball = 0;
	int []answer=new int[3];
System.out.println("첫번째 숫자입력:");
answer[0]=sc.nextInt();
System.out.println("두번째 숫자입력:");
answer[1]=sc.nextInt();
System.out.println("세번째 숫자입력:");
answer[2]=sc.nextInt();

for(int a=0;a<3;a++){
for(int b=0;b<3;b++){
	if(numbers[a]==answer[b]){
	if(a==b){
		strike++;}
		else{
			ball++;
		}
	}
}
}
System.out.printf("s:%d b:%d\n",strike,ball);
if(strike==3){
	break;
}
answerCount++;
System.out.println(10-answerCount+"회 남았습니다.");
}
System.out.println("종료");	
	}
}

