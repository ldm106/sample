public class StudentApp
{
	public static void main(String[] args){
		Student s=new Student(2,"�̵���",90,80,70);
		Student s1=new Student();
		int total=s.kor+s.eng+s.math;
		
		System.out.println(s.name+"�� ����:"+s.total());
		System.out.println(s.name+"�� ���:"+s.avg());
		s.info();

	}
}
