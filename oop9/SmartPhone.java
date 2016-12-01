public class SmartPhone extends Phone{

		private String ip;
		
		public SmartPhone(){
			//super();
			System.out.println("SmartPhone()is running");
			
		}
		public SmartPhone(String tel,String company,String ip){

			//super();
			//super(tel,company); 둘중 무조건 하나만 실행이 됨.
			this.ip=ip;
			System.out.println("SmartPhone(String,String,String)is running");
		}

		public String getIp(){
			return ip;
		}
		public void setIp(String ip){
			this.ip=ip;
		}

}