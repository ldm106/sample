import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address a=new Address();
		

		for(;;){
			System.out.println("1.�̸���� 2.��ȭ��ȣ��� 3.�ּҵ��/���� 4.��ȸ 0.����");
			
			System.out.print("�޴��� �����ϼ���:");
			int no = sc.nextInt();
			if(no==1){
				String name;
				System.out.print("�̸��� �Է��Ͻÿ�:");
				name=sc.next();
				contact.setName(name);
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
			} else if(no==2){
				Tel t=new Tel();
				String type;
				System.out.print("���� �Է�:");
				type=sc.next();
				t.setType(type);
				System.out.print("��ȭ��ȣ �Է�:");
				String number;
				number=sc.next();
				t.setNumber(number);
				contact.addTel(t);
			
				
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� ->Contact�� addTel(Tel tel)���� Tel��ü �����ؼ� �迭�� ���
			} else if(no==3){
				 
				 String zipcode;
				 System.out.print("�����Է�:");
				 zipcode=sc.next();
				 a.setZipcode(zipcode);
				 	 String sido;
				 System.out.print("���Է�:");
				 sido=sc.next();
				 a.setSido(sido);
				 	 String gagun;
				 System.out.print("���Է�:");
				 gagun=sc.next();
				 a.setGagun(gagun);
				 String detail;
				 System.out.print("���Է�:");
				 detail=sc.next();
				 a.setDetail(detail);
				
				 contact.setAddress(a);
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Address��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� setter �̿��ؼ� ����
				//������ ������ ������.
			} else if(no==4){
	
				contact.info();
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.

			} else if(no==0){
				// ���α׷��� �����մϴ�.
				System.out.println("�����մϴ�.");
				break;

			}
		}

	}
}	

/*
Database�� ������� �ϴ� �۾�
	Create		- �� ������ ����
	Retrieve	- ������ ��ȸ
	Update		- ������ ����
	Delete		- ������ ����
*/