public class Quizz6{

	public static void main(String[] args){
		/*
		1.	이름, 부서, 직위, 급여를 담을 수 있는 Employee 클래스 정의하기
			(필드 정의, 기본생성자,getter/setter)

		2. ^를 기준으로 문자열 잘라서 배열에 담기
		3/ 배열에 사원 정보를 하나씩 추줄해서 , 로 잘라서 배열에 담기
			4.Employee 객체를 만들어서 사원정보의 각 데이타를 Employee 객체에 저장하기
			5.Employee 객체를 employees 배열에 저장하기
		6.Employee 배열에 저장된 정보를 출력하기
		*/
		
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,200";
		Employee[] employee=new Employee[4];
		text = text.replace(" ","");
		String a[]= text.split("\\^");

	


		for(int i=0;i<a.length;i++){
			employee[i]=new Employee();
			String s[]=a[i].split(",");
				int k=0;
					employee[i].setName(s[k]);
					employee[i].setDepartment(s[k+1]);
					employee[i].setPosition(s[k+2]);
					employee[i].setSalary(Integer.parseInt(s[k+3]));
		}
	
		for(Employee e : employee){

		e.info();
		}


	}
}