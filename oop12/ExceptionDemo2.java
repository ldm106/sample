import java.io.*;

public class ExceptionDemo2{

	//reading()�� �ڽ��� ����ϴ� ���๮���� �߻��ϴ� ���ܸ� ó������ �ʴ´�.
	//��� �߻��� ����Ǵ� ���ܸ� �ٽ� ����������.
	public static void reading() throws FileNotFoundException,IOException{

			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("����: " + text);
	}
	// main()�޼ҵ�� reading() �޼ҵ尡 ������ ���ܿ� ���� ó���� �����ϰ� �ִ�.
	// reading()�޼ҵ�� �ڽ��� ����ϴ� main()���� ����ó�� å���� ���ѱ��.
	public static void main(String[]args){

			try{

				reading();
			}catch(FileNotFoundException a1){
				System.out.println("������ ã�� �� �����ϴ�.");

	}catch(IOException a2){
		System.out.println("������ �д� �� ������ �߻��߽��ϴ�.");

	}


		

	}
}