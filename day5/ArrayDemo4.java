public class ArrayDemo4{
	public static void main(String[] args){
		
		/*String[][] groups =new String[2][3];
		//다차원 배열에 값 저장하기
		groups[0][0]="이동민";
		groups[0][1]="서울시";
		groups[0][2]="안양시";
		groups[1][0]="수원시";
		groups[1][1]="안양시";
		groups[1][2]="부천시";*/

		String[][]groups = {{"이동민","서울시","안양시"},{"수원시","안양시","부천시"}};
		
		//다차원 배열의 값 표시하기
		/*for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("("+i+","+j+") => "+groups[i][j]+"\t");
			}
			System.out.println();
		}*/

		for(String[] group:groups){
			for(String name:group){
				System.out.print(name+"\t");
			}
			System.out.println();
	}
}
}