public class Phone{
	
	//�θ�Ŭ�����κ��� �������� �ʵ�.
	String tellNumber;
	public Phone(){

}
	
	public void call(String to){
		System.out.println("["+tellNumber+"]���� ["+to+"]�� ��ȭ�� �̴ϴ�.");
	}
	
	public void message(String to,String text){
		System.out.println("["+tellNumber+"]���� ["+to+"]�� ["+text+"]�� �����ϴ�.");
	}
	
}