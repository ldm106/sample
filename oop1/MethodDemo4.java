public class MethodDemo4{
	
	// �̵�ﰢ���� ���̸� ����ϴ� �޼ҵ�
	public static double area(double width,double height) {
	double result = (width*height)/2;
	return result;
	}
	
	
	public static void main(String[] args){

		double a1 = area(7.0,3.0);
		System.out.println(a1);
	}
}
