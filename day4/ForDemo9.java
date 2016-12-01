public class ForDemo9{
	public static void main(String[] args){

		// 1~100까지의 합을 계산하기
		// 단,합계가 3000을 넘어가는 순간의 숫자를 알아내기
		int sum=0;
		for(int a=1;a<=100;a++){
			sum+=a;
		
		if(sum>3000){
			
		System.out.println("3000 넘어가는 첫 숫자는 "+sum+"이다."+a+"이다.");
		break;
		}
		}
	}

}
