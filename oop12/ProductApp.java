import java.io.*;
public class ProductApp{

//��ǰ���� �ؽ�Ʈ ������ ���޹޾Ƽ�
//�� �߶� Product�� ��Ƽ� ��ȯ�ϴ� �޼ҵ�
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
			System.out.println("��ǰ��:"+pp.getName());
			System.out.println("������:"+pp.getCompany());
			System.out.println("����:"+pp.getMuch());
			System.out.println("������:"+pp.getDiscount());
			System.out.println("==============================");

		}
		

	}





}