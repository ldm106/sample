public class ForDemo9{
	public static void main(String[] args){

		// 1~100������ ���� ����ϱ�
		// ��,�հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
		int sum=0;
		for(int a=1;a<=100;a++){
			sum+=a;
		
		if(sum>3000){
			
		System.out.println("3000 �Ѿ�� ù ���ڴ� "+sum+"�̴�."+a+"�̴�.");
		break;
		}
		}
	}

}
