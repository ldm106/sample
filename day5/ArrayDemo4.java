public class ArrayDemo4{
	public static void main(String[] args){
		
		/*String[][] groups =new String[2][3];
		//������ �迭�� �� �����ϱ�
		groups[0][0]="�̵���";
		groups[0][1]="�����";
		groups[0][2]="�Ⱦ��";
		groups[1][0]="������";
		groups[1][1]="�Ⱦ��";
		groups[1][2]="��õ��";*/

		String[][]groups = {{"�̵���","�����","�Ⱦ��"},{"������","�Ⱦ��","��õ��"}};
		
		//������ �迭�� �� ǥ���ϱ�
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