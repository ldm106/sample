public class PersonApp{
	public static void main(String[] args){

Person p=new Person();

int a;
p.no=2;
p.name="�̵���";
p.phone="010-2475-3514";
p.department="����Ʈ������";
p.position="���";
p.salary=2800;

	a=p.salarycal();
	System.out.println(a);
	p.information();

	}
}
