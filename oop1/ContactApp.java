public class ContactApp{
	public static void main(String[] args){
		

		Contact c1 = new Contact();
		Contact c2 = new Contact();
		//당연히 c1과 c2에 해당되는 객체가 힙영역에 2개가 생긴다. 각각. 엄연히 다른것이다.

		c1.no=23;
		c1.name="홍길동";
		c1.tel="010-1111-1111";
		c1.email="hong@gmail.com";

		c2.no=25;
		c2.name="김유신";
		c2.tel="010-2222-2222";
		c2.email="kim@gmail.com";

		System.out.println(c1.no);
		c1.call();
		System.out.println(c2.no);
		c2.call();
		c2.sendMessage();
		c2.sendMail();

		int [] c = new int [10];//100개의 연락처를 담을수 있는 배열 선언
		c[0]=c1.no;
		
		System.out.println(c[0]);

	}
}
