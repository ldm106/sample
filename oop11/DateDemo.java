import java.util.*;

public class DateDemo{

	public static void main(String[] args){
		// �ý����� ���� ��¥/�ð� ������ ������ Date ��ü���帮
		Date now = new Date();
		System.out.println(now);
		// ��ü�� ����������� �ð������� ������

		long time = now.getTime();
		System.out.println(time);
	}
}