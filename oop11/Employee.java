public class Employee{
String name;
String department;
int salary;
String position;

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setDepartment(String department){
	this.department=department;
}
public String getDepartment(){
	return department;
}
public void setSalary(int salary){
	this.salary=salary;
}
public int getSalary(){

return salary;
}
public void setPosition(String position){

this.position=position;
}
public String getPosition(){
return position;
}
public void info(){

System.out.println("사원 이름:"+getName());
System.out.println("부서:"+getDepartment());
System.out.println("직위:"+getPosition());
System.out.println("급여:"+getSalary());

System.out.println("=====================");



}


}