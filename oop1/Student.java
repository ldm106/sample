public class Student{
	
	int no;//�й�
	String name;
	int kor;
	int eng;
	int math;
	
	// �⺻ ������
	public Student(){

	}
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int a,String b,int c,int d, int e){
	no=a;
	name=b;
	kor=c;
	eng=d;
	math=e;
	}
	// ������ ��ȯ�ϴ� ��� -> �޼ҵ�� total
	public int total(){
	int total=kor+eng+math;
	return total;
	}

	// ����� ��ȯ�ϴ� ��� -> �޼ҵ�� avg
	public double avg(){
	double avg=(kor+eng+math)/3.0;
	return avg;
	}
	// �л� ������ ����ϴ� ���(������ ��յ� ����) -> �޼ҵ��
	public void info(){
	System.out.println("�л� ��ȣ:"+no);
	System.out.println("�л� �̸�:"+name);
	System.out.println(name+"�� ���� ����:"+kor);
	System.out.println(name+"�� ���� ����:"+eng);
	System.out.println(name+"�� ���� ����:"+math);


	}
}