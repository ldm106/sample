public class DBAccessApp{
	public static void main(String[] args){
		
		//DBAccess Ŭ������ �����ڸ� ����� �� ����.
		//DBAccess db1 = new DBAccess();
		//DBAccess db2 = new DBAccess();
		//DBAccess db3 = new DBAccess();
		//���α׷��� ����Ǵ� ���� ��ü�� �Ѱ��� �����ǵ��� �ϴ°�:�̱��水ü
		DBAccess db1 = DBAccess.getInstance();
		DBAccess db2 = DBAccess.getInstance();
		DBAccess db3 = DBAccess.getInstance();
		db1.insert();
		//�̱��� ó���� Ŭ������ ��ü ȹ���ϱ�
		//�������� db�� ����� #123���� ��ȯ�޴´�.

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
	}
}