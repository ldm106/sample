public class ArrayDemo3{
	public static void main(String[] args){

		int[]numbers=new int[3];//numbers라는 빈그릇에 담는다. 

		//배열의 지정된 위치에 값을 저장하기.
		//numbers[인덱스]=값
		numbers[0]=12;
		numbers[1]=23;
		numbers[2]=56;
		//numbers[3]=100; 배열의 범위를 벗어났다는 exception이라는 메세지가 나오게된다.
		
		for(int a:numbers){
			System.out.println(a);
		}
	}
}
