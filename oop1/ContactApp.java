public class ContactApp{
	public static void main(String[] args){
		

		Contact c1 = new Contact();
		Contact c2 = new Contact();
		//�翬�� c1�� c2�� �ش�Ǵ� ��ü�� �������� 2���� �����. ����. ������ �ٸ����̴�.

		c1.no=23;
		c1.name="ȫ�浿";
		c1.tel="010-1111-1111";
		c1.email="hong@gmail.com";

		c2.no=25;
		c2.name="������";
		c2.tel="010-2222-2222";
		c2.email="kim@gmail.com";

		System.out.println(c1.no);
		c1.call();
		System.out.println(c2.no);
		c2.call();
		c2.sendMessage();
		c2.sendMail();

		int [] c = new int [10];//100���� ����ó�� ������ �ִ� �迭 ����
		c[0]=c1.no;
		
		System.out.println(c[0]);

	}
}
