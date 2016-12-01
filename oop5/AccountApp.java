	import java.util.Scanner;
	public class AccountApp{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Account a=new Account();

	for(;;){
	System.out.println("1.등록 2.조회 3.비번변경 4.입금 5.출금 6.종료\n");
	System.out.print("메뉴 선택:");
	int menuNo=sc.nextInt();
	if(menuNo==1){
			System.out.println("이름과 비밀번호 입금액을 입력하시오:");
			System.out.print("이름 입력:");
			String name=sc.next();
			a.setName(name);
			System.out.print("비밀번호 입력:");
			int password=sc.nextInt();
			a.setPassword(password);
			System.out.print("최초입금액입력:");
			int balance=sc.nextInt();
			a.setBalance(balance);

			a.setAccount("110-315-992989");
	}else if(menuNo==2){
			System.out.println("이름:"+a.getName()+" 계좌번호:"+a.getAccount()+" 잔액:"+a.getBalance());


	}else if(menuNo==3){
			System.out.print("비밀번호를 바꾸시려면 예전 비밀번호를 입력하시오:");
			int password1=sc.nextInt();
			if(password1==a.getPassword()){
					System.out.print("예전 비밀번호가 맞으므로 새 비밀번호를 입력하시오:");
					int password2=sc.nextInt();
					a.setPassword(password2);
					System.out.println("비밀번호가 성공적으로 변경되었습니다.");
					System.out.println("새 비밀번호:"+a.getPassword());
			}else{
				System.out.println("예전 비밀번호가 일치하지 않습니다. 처음부터 다시시작하십시오.");
			}

	}else if(menuNo==4){
		System.out.print("입금할 금액을 입력하시오:");
		int plusmoney=sc.nextInt();
		
		a.setBalance(a.getBalance() + plusmoney);
		System.out.println("잔액은"+a.getBalance()+"입니다.");


	}else if(menuNo==5){
		System.out.print("비밀번호 입력하시오:");
		int confirm=sc.nextInt();
		if(confirm == a.getPassword()){
			System.out.print("출금액을 입력하시오:");
			int minusmoney=sc.nextInt();
			a.setBalance(a.getBalance() - minusmoney);
			System.out.println("잔액은"+a.getBalance()+"입니다.");
		}else{
		System.out.println("비밀번호가 일치하지 않습니다.");
		}

	}else if(menuNo==6){
		System.out.println("종료합니다.");
		break;
	}



	}
	
	


	}
}