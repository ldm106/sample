public class Quizz6{

	public static void main(String[] args){
		/*
		1.	�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
			(�ʵ� ����, �⺻������,getter/setter)

		2. ^�� �������� ���ڿ� �߶� �迭�� ���
		3/ �迭�� ��� ������ �ϳ��� �����ؼ� , �� �߶� �迭�� ���
			4.Employee ��ü�� ���� ��������� �� ����Ÿ�� Employee ��ü�� �����ϱ�
			5.Employee ��ü�� employees �迭�� �����ϱ�
		6.Employee �迭�� ����� ������ ����ϱ�
		*/
		
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,200";
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