public class BookApp2{
	public static void main(String[] args){
		
		Book[]bookCart=new Book[2];
		
		Book book1 = new Book();
		book1.setNo(23);
		book1.setTitle("�ϵ� �� �׼�");
		book1.setAuthor("ô ��");
		book1.setPublisher("���ؼ�");
		book1.setPrice(30000);
		book1.setPubdate("2016-11-16");

		System.out.println(book1.getNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPublisher());
		System.out.println(book1.getPrice());
		System.out.println(book1.getPubdate());


		Book book2 = new Book();
		book2.setNo(25);
		book2.setTitle("�� �� �׼�");
		book2.setAuthor("ô ��");
		book2.setPublisher("���ؼ�");
		book2.setPrice(310000);
		book2.setPubdate("2011-11-16");

		System.out.println(book2.getNo());
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPublisher());
		System.out.println(book2.getPrice());
		System.out.println(book2.getPubdate());
		
		bookCart[0]=book1;
		bookCart[1]=book2;

		for(Book book:bookCart){
			System.out.printf("%s %s %d\n",book.getTitle(),book.getPublisher(),book.getPrice());
		}
	
	}
}
