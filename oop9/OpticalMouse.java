public class OpticalMouse implements Mouse,Lightable,Cleanable{
	
	//Mouse�������̽��� ���ǵ� �߻�޼ҵ� ����
	public void Wheel(){
			System.out.println("���� ��½�̸� ����.. ����..");
	}
	public void click(){
			System.out.println("���� ��½�̸� Ŭ��.. Ŭ��..");
	}
	public void move(){
			System.out.println("���� ��½�̸� ����.. ����..");
	}

	// Lightable�������̽��� ���ǵ� �߻�޼ҵ� ����
	public void light(){
			System.out.println("��¦~��¦~");
	}

	//Cleanable�������̽��� ���ǵ� �߻�޼ҵ� ����
	public void clean(){
			System.out.println("LED �߽ź� û�� �Ϸ�");
	}
}