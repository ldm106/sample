public class ScoreApp3{
	public static void main(String[] args){
		
		Score s = new Score("������",40,50,60);

		int result1 = s.total();
		System.out.println("����:"+result1);
		
		double result2 = s.average();
		System.out.println("���:"+result2);
	}
}
