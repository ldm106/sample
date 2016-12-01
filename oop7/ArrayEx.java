public class ArrayEx{
	public static void main(String[] args){
	int b[]=new int[10];
	int k[]=new int[10];
	int t[]=new int[10];
	ArrayService a = new ArrayService();
	t=a.move(1);
	for(int i=0;i<t.length;i++){
	System.out.print(t[i]);
	System.out.println();

	}
	
	System.out.println();

	b=a.copy(9);
	for(int i=0;i<b.length;i++){
	System.out.print(b[i]);
	System.out.println();

}
	System.out.println();
	
	
	k=a.slice(0,3);
	for(int i=0;i<k.length;i++){
		System.out.print(k[i]);
		System.out.println();
	}


}
}
	
