import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1{

	public static void main(String[] args){
		try{
			//FileNotFoundException�� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));

			//IOException�� ������ �޼ҵ�
			String text = reader.readLine();//���ܸ� �߻����� ������ �޼ҵ��̴�.
			System.out.println("���� ����:"+text);
		} catch(FileNotFoundException fnfe){
			System.out.println("���ܹ߻�");
			System.out.println("���ܰ�ü:"+fnfe);
			fnfe.printStackTrace(); // ������ ������ �� �ִ� ������ ȭ�鿡 ����ϴ� �޼ҵ�

			// ���� ó�� �ڵ� �ۼ�
			// 1. ����� ģȭ���� ����� ģȭ���� �����޼���
			System.out.println("������ ã���� �����ϴ�. ��� �� ���ϸ��� Ȯ���ϼ���.");
		} catch(IOException io){
			System.out.println("������ �о���� ���� ������ �߻�. ���ӻ��� Ȯ��");

		}

	

		
	}
}
