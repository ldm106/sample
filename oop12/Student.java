public class Student{
private String name;
private String grade;
private int kor;
private int eng;
private int math;

	//score.txt.������ �о ���������� �о ȭ�鿡 ���
	//1.�л������� ��� StudentŬ���� �����ϱ�
	//2.StudentApp �����ϱ�
	//		-FileReader�� BufferedReader�� ����ؼ� ������ ���� �о����
	//		-�о�� ������,�� �������� �ڸ���
	//		-�߶� ������ Student��ü�� �����ؼ� �����ϱ� (������ ���ڷ� ��ȯ�ϱ�:int Integer.parseInt
	//		Student ��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
	

	public Student(){

	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;	
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return grade;
	}
	public void setKor(int kor){
		this.kor=kor;
	}
	public int getKor(){
		return kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public int getEng(){
		return eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getMath(){
		return math;
	}
	public void info(){
		System.out.println("�̸�:"+getName());
		System.out.println("�г�:"+getGrade());
		System.out.println("����:"+getKor());
		System.out.println("����:"+getEng());
		System.out.println("����:"+getMath());
		

	}

}