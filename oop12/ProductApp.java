import java.io.*;
public class ProductApp{

//상품정보 텍스트 한줄을 전달받아서
//잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseDate(String text){
	
		Product p=new Product();

		String change[]=text.split(",");
			p.setName(change[0]);
			p.setCompany(change[1]);
			p.setMuch(Integer.parseInt(change[2]));
			p.setDiscount(Double.parseDouble(change[3]));
		return p;
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
			Product[] products=new Product[4];
			String text = reader.readLine();
			products[0]=parseDate(text);
			String text1=reader.readLine();
			products[1]=parseDate(text1);
			String text2=reader.readLine();
			products[2]=parseDate(text2);
			String text3=reader.readLine();
			products[3]=parseDate(text3);
		
		for(Product pp:products){
			System.out.println("제품명:"+pp.getName());
			System.out.println("제조사:"+pp.getCompany());
			System.out.println("가격:"+pp.getMuch());
			System.out.println("할인율:"+pp.getDiscount());
			System.out.println("==============================");

		}
		

	}





}