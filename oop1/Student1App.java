	import java.util.Scanner;
		
	public class Student1App{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// �л�����(��ȣ,�̸�,����,����,��������) �Է¹޾Ƽ�
		// Student��ü�� �����ϱ�
		Student1 student=new Student1();
		
		System.out.print("��ȣ�� �Է�:");
		int no =sc.nextInt();
		student.setNo(no);
		
		System.out.print("�̸��� �Է�:");
		
		String name=sc.next();
		student.setName(name);
		
		System.out.print("���� ���� �Է�:");
		int kor=sc.nextInt();
		student.setKor(kor);

		System.out.print("���� ���� �Է�:");
		int eng=sc.nextInt();
		student.setEng(eng);

		System.out.print("���� ���� �Է�:");
		int math=sc.nextInt();
		student.setMath(math);
		
		System.out.println("�л� �̸�:"+student.getName());
		System.out.println("�л� ��ȣ:"+student.getNo());
		System.out.println(student.getName()+"�� ��������:"+student.getKor());
		System.out.println(student.getName()+"�� ��������:"+student.getEng());
		System.out.println(student.getName()+"�� ��������:"+student.getMath());
		System.out.println(student.getName()+"�� ���� ����:"+student.getSum());
		System.out.println(student.getName()+"�� �������:"+student.getAvg());
		System.out.println("�ݿø��Ѱ�:"+student.getAverageForRound());
		
		
		
		
		
		
	}	
}		
