import java.util.StringTokenizer;

public class StringTokenizerDemo{

	public static void main(String[] args){
		
		String text = "오늘은 너무 졸립고 힘들다. 즐겁고 재밋다.";
		/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("단어갯수"+length);
	
		while(st.hasMoreTokens()){
				String token=st.nextToken();
				System.out.println(token);
				System.out.println("남은 토큰 갯수:"+st.countTokens());
		}
		*/

		String[] tokens = text.split("");
		System.out.println("단어 개수: "+tokens.length);

		/*
			StringTokenizer
					- 문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
					- new StringTokenizer(텍스트);			// 구분자를 지정하지 않으면 공백이 구분자가 된다.
					- new StringTokenizer(텍스트,구분자);

					- boolean hasMoreTokens() : 다음번에 꺼낼 토큰이 존재하면 true를 반환한다.
					- String nextToken()      : 토큰(문자열)을 꺼낸다.
		*/
	}
}