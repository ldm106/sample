import java.util.Scanner;

public class Quizz2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Scanner sa= new Scanner(System.in);
		//���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		//1.�л� ���� �Է¹ޱ�
		//2.�л��� ��ŭ�� ũ�⸦ ���� �迭�����
		//3.�л��� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		//4.�迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�
		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���:");
		int size = sc.nextInt();
		
		int[] score = new int[size];
		int total = 0;
		double avg =0;

		for(int a=0;a<score.length;a++){
			System.out.print((a+1)+"��° �л� ���� ���� �Է�:");
			score[a]=sa.nextInt();
			total+=score[a];
		}
		avg=total/score.length;
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		
	}
}
