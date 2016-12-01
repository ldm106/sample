public class DesktopApp{
	public static void main(String[] args){
		
		OpticalMouse m = new OpticalMouse();
		Desktop pc = new Desktop();

		pc.setMouse(m);
		//OpticalMouse 객체 주소를 주었지만 실제로 바라보는건 Mouse의 주소이다.
		pc.running();
		pc.painting();
		pc.cleaning();
	}
}