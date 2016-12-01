import java.io.*;
public class ExceptionDemo4{
	public static void writing(){
		try{
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";
			writer.write(text);
			writer.flush();
		} catch(FileNotFoundException e){
			throw new L2Exception();
		} catch(IOException e){
			throw new L2Exception();
		}
	}

	public static void reading() {

		try{
		BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
		String text = reader.readLine();
		System.out.println("����:"+text);
	
		}catch(FileNotFoundException e){
			//FileNotFoundException�� �߻��� ���� ����ä��,��� HtaException�� �����ؼ� ������
			throw new L2Exception(); //���ܸ� �����ؼ� �߻�
		}catch(IOException e){
			
			throw new L2Exception(); //���ܸ� �����ؼ� �߻�
		}
	}


	public static void main(String[] args){
		
			reading();
			writing();
		

	}

}