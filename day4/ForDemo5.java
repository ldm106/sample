public class ForDemo5{

	public static void main(String[] args){

		for(int a =1;a<=5;a++){
			System.out.println("����");
		
			for(int b=1;b<=10;b++){
				if((a+b)%3==0){
				System.out.println("a�� ��:"+a+"b�� ��:"+b);
				}
			}
		}
	}
}
