import java.util.Scanner;

public class Quizz4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("µÎÀÚ¸® ¼ýÀÚ ÀÔ·Â:");
		int num = sc.nextInt();
		String hangul ="";
		int ten = num/10;
		int one = num%10;
		String tenvo=" ";
		String onevo=" ";
		if(ten==1){
			tenvo="ÀÏ";
		}else if(ten==2){
			tenvo="ÀÌ";}
		else if(ten==3){
			tenvo="»ï";}
		else if(ten==4){
			tenvo="»ç";}
		else if(ten==5){
			tenvo="¿À";}
		else if(ten==6){
			tenvo="À°";}
		else if(ten==7){
			tenvo="Ä¥";}
		else if(ten==8){
			tenvo="ÆÈ";}
		else {
			tenvo="±¸";}
		if(one==0){
			onevo="";
		}
		else if(one==1){
			onevo="ÀÏ";}
		else if(one==2){
			onevo="ÀÌ";}
		else if(one==3){
			onevo="»ï";}
		else if(one==4){
			onevo="»ç";}
		else if(one==5){
			onevo="¿À";}
		else if(one==6){
			onevo="À°";}
		else if(one==7){
			onevo="Ä¥";}
		else if(one==8){
			onevo="ÆÈ";}
		else (one==9){
			onevo="±¸";}
		System.out.println(tenvo+"½Ê"+onevo);


		
	}
}