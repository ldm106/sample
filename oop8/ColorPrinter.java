public class ColorPrinter extends Printer{
int dpi;

// �θ�Ŭ����(Printer)�� print() �޼ҵ� ������
	public void print(String text){
		System.out.println("["+text+"]�� �÷��� �μ�");
	}
	
	// ColorPrinter�� ������ �������
	public void changeInk(){
		System.out.println("��ũ�� �����մϴ�.");
	}
}