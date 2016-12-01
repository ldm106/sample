public class PhoneApp{
	public static void main(String[] args){

		SmartPhone p = new SmartPhone();

		p.tellNumber = "010-2475-3514";
		p.call("010-2475-3514");
		p.message("010-2475-3514","오늘 몇시?");
		
		p.ip="210.11.123.152";
		p.email="ldm106@nate.com";

		p.web("http://www.naver.com");
		p.sendEmail("ldm10692@gmail.com","과제물","주말 과제입니다.");

		FeaturePhone f = new FeaturePhone();
		f.tellNumber="010-1234-5678";
		f.call("010-8620-9245");
		f.message("010-8620-9245","7시에 중앙hta에서 만나.");
	}
}