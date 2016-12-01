public class Quizz2{
	public static void main(String[] args){
		String text = "<ldm106@nate.com>,<kim@hanmail.net>,<kang@naver.com>,<yushin@daum.net>";

		String [] arr = text.split(",");
	
		for(String s:arr){
			System.out.print(s.substring(1,s.length()-1));
			System.out.println();

		}

		
	}
}