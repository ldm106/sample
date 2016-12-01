import java.util.Scanner;
public class Quizz5{
	public static void main(String[] args){
//국어, 영어, 수학 점수를 입력받아서
//총점,평균,학점을 출력하기
//학점은 90이상:A, 80이상:B,70이상:C,60이상:D,그외:F
Scanner sc = new Scanner(System.in);
System.out.print("국어점수 입력:");
int kor = sc.nextInt();
System.out.print("수학점수 입력:");
int math = sc.nextInt();
System.out.print("영어점수 입력:");
int eng = sc.nextInt();
String score;
int sum = kor+math+eng;
double avg = (double)sum/3;

if(avg>=90){
score="A학점";}
else if( avg>=80){
	score="B학점";}
else if(avg>=70){
	score="C학점";}
else if(avg>=60){
	score="D학점";}
else{
	score="F학점";}

System.out.println("평균은"+avg+"이고 당신의 학점은"+score+"입니다.");
	}
}