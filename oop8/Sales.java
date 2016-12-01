public class Sales extends Employee{

	int result;
	int goal;

	//영업에 맞게 print() 메소드 재정의하기
	public void print(){
		System.out.println("사원번호:" + no);
		System.out.println("이    름:" + name);
		System.out.println("목 표 액:" + goal);
		System.out.println("실    적:" + result);
		System.out.println("달 성 률:" + result/(double)goal);
		System.out.println();
	}

	public void drawGraph(){
		System.out.print("목 표 액:");
		int length = goal/10000;
		for(int i=0 ; i<length; i++){
			System.out.print("=");
		}
		System.out.println();

		System.out.print("실    적:");
		length = result/1000;
		for(int i=0; i<length; i++){
			System.out.print("=");
		}
		System.out.println();
	}
}