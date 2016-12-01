public class Quizz3{
	
	public static void main(String[] args){
		String text = "returns a string representation of the object. in general, the tostring method returns a string that  this object.";
		int []arr=new int[26];
		for(int i=0;i<text.length();i++){
			int value = text.charAt(i)-97;
			if(value>=0){
			arr[value]++;
			}
		}
	for(int i=0;i<arr.length;i++){
		System.out.println((char)(i+97)+":"+arr[i]);
		
	}
}}