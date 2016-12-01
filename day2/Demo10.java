public class Demo10{
	public static void main(String[] args){
		// 연산식에서의 형변환
		int a = 4;
		int b = 5;
		int c = a/b;
		System.out.println(c);
	
		double d = a/(double)b; //4/5.0 -> 4.0/5.0 -> 0.8
		System.out.println(d);
	}
}