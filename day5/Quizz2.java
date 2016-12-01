import java.util.Scanner;

public class Quizz2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Scanner sa= new Scanner(System.in);
		//숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		//1.학생 수를 입력받기
		//2.학생수 만큼의 크기를 가진 배열만들기
		//3.학생수 만큼 반복하면서 점수를 입력받고 배열에 담기
		//4.배열에 저장된 값으로 합계와 평균을 계산해서 출력하기
		System.out.print("국어 시험을 본 학생들의 수를 입력하세요:");
		int size = sc.nextInt();
		
		int[] score = new int[size];
		int total = 0;
		double avg =0;

		for(int a=0;a<score.length;a++){
			System.out.print((a+1)+"번째 학생 국어 점수 입력:");
			score[a]=sa.nextInt();
			total+=score[a];
		}
		avg=total/score.length;
		System.out.println("총합:"+total);
		System.out.println("평균:"+avg);
		
	}
}
