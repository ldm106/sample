import java.util.Random;
import java.util.Scanner;
public class ForDemo15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		//�� �ֻ����� ���� 6�� �Ǹ� ���ε�.
		//���ε��� ���� ��� ���� ���� ������ ���� ���ε����� Ż��
		//���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
		//���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�.
		boolean island = false; //0�̸� ���� 1�̸� ���ε�.
		int count = 3;
		int distance=0;
		
		for(;;){
		System.out.println("------------------------------------");
		System.out.println("1.�ֻ��� ������  0.����");
		System.out.println("------------------------------------");
		System.out.print("�����ϼ���:");
		int sel=sc.nextInt();
		if(sel==1){


		int first=random.nextInt(5)+1;
		int second=random.nextInt(5)+1;
		
		if(!island){ //���ε��� �������� �ʴ� ���
		if(first+second == 7){//�� �ֻ����� ���� 7�ΰ��
				island=true; //���ε���
				count =3;	//Ż����� 3ȸ����.
				System.out.println("@@@���ε��� ����@@@");
		}else{				//�� �ֻ����� ���� 7�� �ƴѰ��
			distance += (first +second); //�̵��Ÿ� ����
			if(distance >100){			 // �̵��Ÿ��� 100�� ������ ������ ����.
				System.out.println("### ������ ���� ###");
				break;
			}

		}

		}else{//���ε��� �����ִ°��
			if(first == second){ //�ֻ��� ���ڰ� ���� ���
					island = false ; //���ε� Ż��
					System.out.println("###���ε� Ż��###");
			}else{				 //�ֻ��� ���ڰ� �ٸ� ���
					count --;		//���� Ƚ���� 1���ҽ�Ų��.
					if(count == 0){ //���� Ƚ���� 0�̸�
						island = false; //���ε� Ż��
						System.out.println("###3ȸ�� ��� ���ε� Ż�� ###");
					}else{
					System.out.println("Ż����� ["+count+"]ȸ ���ҽ��ϴ�.");
					}
			}

		}
		}
		else if(sel==0){
			System.out.println("���α׷� ����");
			break;
		}
	}
}}
