import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;
		

		for (;;) {
			System.out.println("1:���   2:��ȸ   0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				System.out.print("����� ��ȣ �Է�:");
				  int no=sc.nextInt();
				System.out.print("����� �̸� �Է�:");
				 String name=sc.next();
				 System.out.print("����� �ڵ�����ȣ �Է�:");
				 String phone=sc.next();
				 System.out.print("����� �̸��� �Է�:");
				 String email=sc.next();

				 //Contact ��ü�����ϰ�, ���� ���
				 Contact contact = new Contact();
				 contact.setNo(no);
				 contact.setName(name);
				 contact.setPhone(phone);				 
				 contact.setEmail(email);
				 //�迭�� �����ϱ�
				 contacts[currentPosition]=contact;

				currentPosition++;
				// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1������Ų��.

			} else if (menuNo == 2) {
				
				for(int i=0;i<currentPosition;i++){
					Contact c = contacts[i];
					System.out.printf("%d %s %s %s\n",c.getNo(),c.getName(),c.getPhone(),c.getEmail());
				//contacts[i].info();
				//System.out.println();

				}
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� 
				// <-- enhanced for�� ������� ���� ����
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���

			} else if (menuNo == 3) {
				break;
			}
		}


	
	} 
}