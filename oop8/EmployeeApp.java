public class EmployeeApp {
	public static void main(String[] args){
		// 5���� ��������� �����ϱ�
		Employee[] employee = new Employee[3];
		// �������
		Employee emp1 = new Employee();
		emp1.no=23;
		emp1.name="ȫ�浿";
		// ������� ����
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "�̼���";
		emp2.goal = 50;
		emp2.result = 37;
		// ���ߺ� ��� ����
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "������";
		emp3.todo = 10;
		emp3.completed = 4;

		//�迭�� ������� ����
		employee[0] = emp1;
		employee[1] = emp2;
		employee[2] = emp3;

		//�� ����ϱ�
		//employee[0].print();
		//employee[1].print();
		//employee[2].print();
		//for(int i=0;i<employee.length;i++){
		//	employee[i].print();
		//}

		for(Employee emp :employee){
				//emp.print();
				//System.out.println();

				//boolean value = emp instanceof Developer;
				//System.out.println(value);
				if(emp instanceof Sales){
					((Sales) emp).drawGraph();
				} 
		}
	}
}