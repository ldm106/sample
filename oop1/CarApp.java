public class CarApp{
	public static void main(String[] args){		
		/*
			Car c
				Car��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ���� c
				���赵 ��ü�� Ÿ���̴�.
				Car Ÿ��(Ŭ���� Ÿ��=����Ÿ��)�� ���� c(��������)�� �����.

			new Car();
			Car ���赵�� �ε��ؼ� ��ü�� �����ϰ�,
			������ ��ü�� ������ �� �ִ� �ּҰ��� ��ȯ�ϴ� �ڵ��.
			Car c = new Car();
			Car ���赵�� �ε��ؼ� ��ü�� �����ϰ�, ������ ��ü�� ������ �� �ִ� �ּҰ��� CarŸ���� ���� c�� �����ض�.
		
		*/
		Car c = new Car();
		Car c2 = new Car();
		Car d=c;
		d.speed=10;
		System.out.println(d.speed);

		//������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�
		System.out.println(c.speed);//c�� �����ϴ� ��ü�� speed �Ӽ��� ��ȸ
		c.speed=6;
		System.out.println(c.speed);
		c.speedUp();//c�� �����ϴ� ��ü�� ���Ե� speedUp()��� �����ϱ�
		c.speedDown();
		System.out.println(c);//�ּҰ��� �ƴϴ�. ó���� Ŭ���� �̸��� �����ϰ� �� �ڿ� ��ü�� �ĺ��ϴ� �ؽ��ڵ尡 ���´�.
		System.out.println(c2);//��ǰ�� �ø��� ��ȣ��� �Ѵ�.
	}
}