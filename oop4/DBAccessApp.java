public class DBAccessApp{
	public static void main(String[] args){
		
		//DBAccess 클래스는 생성자를 사용할 수 없다.
		//DBAccess db1 = new DBAccess();
		//DBAccess db2 = new DBAccess();
		//DBAccess db3 = new DBAccess();
		//프로그램이 실행되는 동안 객체가 한개만 유지되도록 하는것:싱글톤객체
		DBAccess db1 = DBAccess.getInstance();
		DBAccess db2 = DBAccess.getInstance();
		DBAccess db3 = DBAccess.getInstance();
		db1.insert();
		//싱글턴 처리된 클래스의 객체 획득하기
		//정적변수 db에 저장된 #123값을 반환받는다.

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
	}
}