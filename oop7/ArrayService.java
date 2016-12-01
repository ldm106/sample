public class ArrayService{
	int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
	int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
	int[] arr3 ={1,2,3,4,5,6,7,8,9,10};

	//배열 이동시키기
	//arr1배열에서 지정된 번호를 찾아서 맨뒤로 보내기  
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

	//배열 복사하기
	//arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
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
	//배열 잘라내기
	//arr2배열을 지정된 위치부터 지정된 위치까지 복사한 배열을 반환하기
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