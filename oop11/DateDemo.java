import java.util.*;

public class DateDemo{

	public static void main(String[] args){
		// 시스템의 현재 날짜/시간 정보를 가지는 Date 객체만드리
		Date now = new Date();
		System.out.println(now);
		// 객체가 만들어질때의 시간정보가 들어가잇음

		long time = now.getTime();
		System.out.println(time);
	}
}