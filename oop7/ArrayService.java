public class ArrayService{
	int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
	int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
	int[] arr3 ={1,2,3,4,5,6,7,8,9,10};

	//�迭 �̵���Ű��
	//arr1�迭���� ������ ��ȣ�� ã�Ƽ� �ǵڷ� ������  
	public int[] move(int no){
		
	for(int i=0;i<arr1.length;i++){
		if(no==arr1[i]){
			for(int j=i;j<arr1.length-1;j++){
				arr1[j]=arr1[j+1];
			}
			arr1[arr1.length-1]=no;
		}
	}	
return arr1;
}
	public int[] shift(int begin, int length){
return null;
	}

	//�迭 �����ϱ�
	//arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin){
		int position=0;
			int temp[]=new int[arr2.length-begin+1];
			for(int i=0;i<arr2.length;i++){
				if(i==(begin-1)){
					for(int j=i;j<arr2.length;j++){
					temp[position]=arr2[j];
					position++;

					}

				}
			}

return temp;
	}	
	//�迭 �߶󳻱�
	//arr2�迭�� ������ ��ġ���� ������ ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] slice(int begin,int end){
		int []temp=new int[(end-begin)+1];
		int position = 0;
		for(int i=0;i<arr3.length;i++){
			if(begin==i){
		for(int j=i;j<=end;j++){
			temp[position]=arr3[j];
				position++;
		}
			}


		}
		return temp;





	}
}