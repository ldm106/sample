public class BookApp{
	public static void main(String[] args){
		//å��ȣ(no),����(title),����(author),���ǻ�(publisher),����(price),������(pubdate 2001-01-23)
	Book[] bookCart = new Book[5];
	bookCart[0]=new Book(1,"�̰��� �ڹٴ�","�̵���","�߾�hta",35000,"2016-11-16");
	bookCart[1]=new Book(2,"����","ȫ�浿","�Ѻ��̵��",45000,"2016-11-16");
	bookCart[2]=new Book(3,"�ڹ� �� �׼�","������","����Ŭ",56000,"2016-11-7");
	bookCart[3]=new Book(4,"����","������","��Ŭ����",506060,"2016-11-10");
	bookCart[4]=new Book(5,"����","����","�ȵ���̵�",9000,"2016-11-1");
	int sum=0;
	String title=null;

	int max=0;
	for(Book b:bookCart){
		System.out.println("å�����:"+b.getTitle());
	}
	for(Book a:bookCart){
	sum+=a.getPrice();
	}
	System.out.println("���� ����:"+sum);

	for(Book d:bookCart)//���� ���� d�� bookCart[0]~bookCart[4]�� for���� ���鼭 ���� �����ϰ� �ȴ�.
		{
	if(d.getPrice()>max){
		max=d.getPrice();
		}
	}
	for(int i=0;i<bookCart.length;i++){
		if(max==bookCart[i].getPrice()){
		System.out.println("���� ū����:"+bookCart[i].getPrice()+" å ����:"+bookCart[i].getTitle());
	}
	}

	

	}
}
