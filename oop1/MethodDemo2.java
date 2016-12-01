public class MethodDemo2{
	public static void a(){

	}
	public static void displayGugudan(int dan){
	System.out.println(dan+"´Ü");
	for(int i=1;i<=9;i++){
	System.out.println(dan+"*"+i+"="+(dan*i));
	}
	System.out.println();

	}
	public static void main(String[] args){
		displayGugudan(8);
		displayGugudan(186);
					
		}
}
