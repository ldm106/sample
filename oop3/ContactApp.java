import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;
		

		for (;;) {
			System.out.println("1:등록   2:조회   0:종료");

			System.out.print("메뉴 번호을 입력하세요:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				System.out.print("사용자 번호 입력:");
				  int no=sc.nextInt();
				System.out.print("사용자 이름 입력:");
				 String name=sc.next();
				 System.out.print("사용자 핸드폰번호 입력:");
				 String phone=sc.next();
				 System.out.print("사용자 이메일 입력:");
				 String email=sc.next();

				 //Contact 객체생성하고, 값을 담기
				 Contact contact = new Contact();
				 contact.setNo(no);
				 contact.setName(name);
				 contact.setPhone(phone);				 
				 contact.setEmail(email);
				 //배열에 저장하기
				 contacts[currentPosition]=contact;

				currentPosition++;
				// 배열에 currentPosition이 가르키는 위치에 Contact를 저장하고
				// currentPosition의 값을 1증가시킨다.

			} else if (menuNo == 2) {
				
				for(int i=0;i<currentPosition;i++){
					Contact c = contacts[i];
					System.out.printf("%d %s %s %s\n",c.getNo(),c.getName(),c.getPhone(),c.getEmail());
				//contacts[i].info();
				//System.out.println();

				}
				// 배열에 저장된 모든 연락처 정보 표시하기 
				// <-- enhanced for문 사용하지 말고 구현
				// 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복해서 출력

			} else if (menuNo == 3) {
				break;
			}
		}


	
	} 
}