import java.util.Random;
import java.util.Date;

public class MethodDemo3{


	// ������ �߻���Ű�� �޼ҵ� �����
	// ��ȯ���� �ֱ⿡ int�� ���´�.
	// ��ȯ���� ������ void�� ���´�.
	// �޼ҵ����� ��ȯ���� ��´�.
	public static String getCurrentDate(){
		Date now = new Date();
		String str = now.toString();

		return str;
	}

	public static int random(){
		Random r = new Random();
		int number = r.nextInt(101);
		//void�� �ƴѰ�� �ݵ�� ��ȯ�� �ۼ�. void�� ��쿣 �ʿ����.
		//return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		//return ��ȯ���� �ݵ�� int�� ��ġ�Ǿ���Ѵ�.
		return number;
	}

	public static void main(String[] args){
			int x = random();
			System.out.println(x);
			String a = getCurrentDate();
			System.out.println(a);
	}
}
