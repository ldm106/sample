public class PhoneApp{
	public static void main(String[] args){

		SmartPhone p = new SmartPhone();

		p.tellNumber = "010-2475-3514";
		p.call("010-2475-3514");
		p.message("010-2475-3514","���� ���?");
		
		p.ip="210.11.123.152";
		p.email="ldm106@nate.com";

		p.web("http://www.naver.com");
		p.sendEmail("ldm10692@gmail.com","������","�ָ� �����Դϴ�.");

		FeaturePhone f = new FeaturePhone();
		f.tellNumber="010-1234-5678";
		f.call("010-8620-9245");
		f.message("010-8620-9245","7�ÿ� �߾�hta���� ����.");
	}
}