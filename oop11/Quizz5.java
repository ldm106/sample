public class Quizz5{
	public static void main(String[] args){
		
		String[] words = {"����","��","����","����"};
		
		String text="�����߾߾߾� ";



		//������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;

		for(String w : words){
			boolean value = text.contains(w);
			if(value){
				isContains = true;
		}
		
		if(isContains){
			System.out.println("�弳�� �ﰡ�Ͻÿ�.");
		}


	}
}}