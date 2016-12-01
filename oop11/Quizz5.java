public class Quizz5{
	public static void main(String[] args){
		
		String[] words = {"새끼","놈","ㅅㅂ","ㅂㅅ"};
		
		String text="새끼야야야야 ";



		//위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;

		for(String w : words){
			boolean value = text.contains(w);
			if(value){
				isContains = true;
		}
		
		if(isContains){
			System.out.println("욕설을 삼가하시오.");
		}


	}
}}