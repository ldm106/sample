import java.util.Scanner;
public class Quizz5{
	public static void main(String[] args){
//����, ����, ���� ������ �Է¹޾Ƽ�
//����,���,������ ����ϱ�
//������ 90�̻�:A, 80�̻�:B,70�̻�:C,60�̻�:D,�׿�:F
Scanner sc = new Scanner(System.in);
System.out.print("�������� �Է�:");
int kor = sc.nextInt();
System.out.print("�������� �Է�:");
int math = sc.nextInt();
System.out.print("�������� �Է�:");
int eng = sc.nextInt();
String score;
int sum = kor+math+eng;
double avg = (double)sum/3;

if(avg>=90){
score="A����";}
else if( avg>=80){
	score="B����";}
else if(avg>=70){
	score="C����";}
else if(avg>=60){
	score="D����";}
else{
	score="F����";}

System.out.println("�����"+avg+"�̰� ����� ������"+score+"�Դϴ�.");
	}
}