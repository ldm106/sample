public class BookApp{
	public static void main(String[] args){
		//책번호(no),제목(title),저자(author),출판사(publisher),가격(price),출판일(pubdate 2001-01-23)
	Book[] bookCart = new Book[5];
	bookCart[0]=new Book(1,"이것이 자바다","이동민","중앙hta",35000,"2016-11-16");
	bookCart[1]=new Book(2,"ㅇㅇ","홍길동","한빛미디어",45000,"2016-11-16");
	bookCart[2]=new Book(3,"자바 인 액션","김유신","오라클",56000,"2016-11-7");
	bookCart[3]=new Book(4,"으준","강감찬","이클립스",506060,"2016-11-10");
	bookCart[4]=new Book(5,"으즌","권율","안드로이드",9000,"2016-11-1");
	int sum=0;
	String title=null;

	int max=0;
	for(Book b:bookCart){
		System.out.println("책제목들:"+b.getTitle());
	}
	for(Book a:bookCart){
	sum+=a.getPrice();
	}
	System.out.println("가격 총합:"+sum);

	for(Book d:bookCart)//참조 변수 d가 bookCart[0]~bookCart[4]를 for문을 돌면서 각각 참조하게 된다.
		{
	if(d.getPrice()>max){
		max=d.getPrice();
		}
	}
	for(int i=0;i<bookCart.length;i++){
		if(max==bookCart[i].getPrice()){
		System.out.println("가장 큰가격:"+bookCart[i].getPrice()+" 책 제목:"+bookCart[i].getTitle());
	}
	}

	

	}
}
