public class Quizz1{
	public static void main(String[]args){
	int max=0;
	int []array={1,5,3,8,2};
	/*for(int i=0;i<array.length;i++){
			if(array[i]>max){
			max=array[i];
			}
	}*/
	for(int n:array){
		if(n>max){
			max=n;}
	}
	System.out.println("�ִ밪:"+max);
	}
}
