public class Product{
	private int no;
	private String name;
	private String maker;
	private String category;
	private int price;
	private double discountRate;
	private boolean isFree;

//�⺻ ������ <------this()�� ���� �������� Ŭ���� ���ο��� ����Ҽ��մ�.
public Product(){}

public Product(int no,String name,String maker,int price){
	this(no,name,maker,"�� ��ǰ",price,0.0,false);
}

//this(int,String,String,String,int)�� ���� �������� Ŭ���� ���ο��� ��밡��
public Product(int no,String name,String maker,String category,int price){
			//this.no=no;
			//this.name=name;
			//this.maker=maker;
			//this.category=category;
			//this.price=price;
			this(no,name,maker,category,price,0.1,false);
			System.out.println("this(int,String,String,String,int,doucle,boolean) ������ ȣ��");
	}
//this(int,String,String,String,int,double,boolean)
public Product(int no,String name,String maker,String category,
		int price,double discountRate,boolean isFree){
			this.no = no;
			this.name = name;
			this.maker = maker;
			this.category = category;
			this.price = price;
			this.discountRate = discountRate;
			this.isFree = isFree;
			System.out.println("this(int,String,String,String,int,doucle,boolean) ������ ȣ��");
	}
public void displayInfo(){
	System.out.println("��    ȣ:"+no);
	System.out.println("��    ��:"+name);
	System.out.println("�� �� ��:"+maker);
	System.out.println("��    ��:"+category);
	System.out.println("��    ��:"+price);
	System.out.println("�� �� ��:"+discountRate);
	System.out.println("���Ῡ��:"+isFree);

}
}