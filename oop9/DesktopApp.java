public class DesktopApp{
	public static void main(String[] args){
		
		OpticalMouse m = new OpticalMouse();
		Desktop pc = new Desktop();

		pc.setMouse(m);
		//OpticalMouse ��ü �ּҸ� �־����� ������ �ٶ󺸴°� Mouse�� �ּ��̴�.
		pc.running();
		pc.painting();
		pc.cleaning();
	}
}