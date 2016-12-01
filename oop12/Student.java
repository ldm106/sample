public class Student{
private String name;
private String grade;
private int kor;
private int eng;
private int math;

	//score.txt.파일을 읽어서 성적정보를 읽어서 화면에 출력
	//1.학생정보를 담는 Student클래스 정의하기
	//2.StudentApp 정의하기
	//		-FileReader와 BufferedReader를 사용해서 파일을 내용 읽어오기
	//		-읽어온 내용을,를 기준으로 자르기
	//		-잘라낸 내용을 Student객체를 생성해서 저장하기 (점수는 숫자로 변환하기:int Integer.parseInt
	//		Student 객체에 저장된 내용을 화면에 표시하기
	

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
		System.out.println("이름:"+getName());
		System.out.println("학년:"+getGrade());
		System.out.println("국어:"+getKor());
		System.out.println("영어:"+getEng());
		System.out.println("수학:"+getMath());
		

	}

}