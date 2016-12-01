import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address a=new Address();
		

		for(;;){
			System.out.println("1.이름등록 2.전화번호등록 3.주소등록/수정 4.조회 0.종료");
			
			System.out.print("메뉴를 선택하세요:");
			int no = sc.nextInt();
			if(no==1){
				String name;
				System.out.print("이름을 입력하시오:");
				name=sc.next();
				contact.setName(name);
				// 이름을 입력받아서 Contact에 저장합니다.
			} else if(no==2){
				Tel t=new Tel();
				String type;
				System.out.print("지점 입력:");
				type=sc.next();
				t.setType(type);
				System.out.print("전화번호 입력:");
				String number;
				number=sc.next();
				t.setNumber(number);
				contact.addTel(t);
			
				
				// 전화번호 정보를 입력받아서 Contact에 저장합니다.
				// Tel객체 생성 -> 값 입력받아서 채우고 ->Contact의 addTel(Tel tel)에게 Tel객체 전달해서 배열에 담기
			} else if(no==3){
				 
				 String zipcode;
				 System.out.print("번지입력:");
				 zipcode=sc.next();
				 a.setZipcode(zipcode);
				 	 String sido;
				 System.out.print("시입력:");
				 sido=sc.next();
				 a.setSido(sido);
				 	 String gagun;
				 System.out.print("구입력:");
				 gagun=sc.next();
				 a.setGagun(gagun);
				 String detail;
				 System.out.print("상세입력:");
				 detail=sc.next();
				 a.setDetail(detail);
				
				 contact.setAddress(a);
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				// Address객체 생성 -> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
				//기존에 있으면 덮어씌운다.
			} else if(no==4){
	
				contact.info();
				// 연락처 정보를 화면에 표시합니다.

			} else if(no==0){
				// 프로그램을 종료합니다.
				System.out.println("종료합니다.");
				break;

			}
		}

	}
}	

/*
Database를 대상으로 하는 작업
	Create		- 새 데이터 저장
	Retrieve	- 데이터 조회
	Update		- 데이터 수정
	Delete		- 데이터 삭제
*/