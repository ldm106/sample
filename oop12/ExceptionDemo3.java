import java.io.*;

public class ExceptionDemo3{

/*	public static void writing() throws Hta{
		try{
			FileWriter writer = new FileWriter("mm.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";
			writer.write(text);
			writer.flush();
		} catch(FileNotFoundException e){
			throw new Hta();
		} catch(IOException e){
			throw new Hta();
		}
	}*/

	public static void reading() throws Hta{

		try{
		BufferedReader reader = new BufferedReader(new FileReader("11.txt"));
		String text = reader.readLine();
		System.out.println("����:"+text);
	
		}catch(FileNotFoundException e){
			//FileNotFoundException�� �߻��� ���� ����ä��,��� HtaException�� �����ؼ� ������
			//throw new Hta(); //���ܸ� �����ؼ� �߻�
		}catch(IOException e){
			
			//throw new Hta(); //���ܸ� �����ؼ� �߻�
		}
	}
	public static void main(String[] args){
		try{
			reading();
			//writing();
		}
			catch(Hta e){
		System.out.println("���ܹ߻�");
		}

	}
}