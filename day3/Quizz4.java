import java.util.Scanner;

public class Quizz4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� ���� �Է�:");
		int num = sc.nextInt();
		String hangul ="";
		int ten = num/10;
		int one = num%10;
		String tenvo=" ";
		String onevo=" ";
		if(ten==1){
			tenvo="��";
		}else if(ten==2){
			tenvo="��";}
		else if(ten==3){
			tenvo="��";}
		else if(ten==4){
			tenvo="��";}
		else if(ten==5){
			tenvo="��";}
		else if(ten==6){
			tenvo="��";}
		else if(ten==7){
			tenvo="ĥ";}
		else if(ten==8){
			tenvo="��";}
		else {
			tenvo="��";}
		if(one==0){
			onevo="";
		}
		else if(one==1){
			onevo="��";}
		else if(one==2){
			onevo="��";}
		else if(one==3){
			onevo="��";}
		else if(one==4){
			onevo="��";}
		else if(one==5){
			onevo="��";}
		else if(one==6){
			onevo="��";}
		else if(one==7){
			onevo="ĥ";}
		else if(one==8){
			onevo="��";}
		else (one==9){
			onevo="��";}
		System.out.println(tenvo+"��"+onevo);


		
	}
}