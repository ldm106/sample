public class Fileupload{
	
	long maxFileSize;
	int maxFileAmount;

	public Fileupload(){
		maxFileSize = 1024*1024*10;
		maxFileAmount = 10;
	}
	public Fileupload(long size){
		maxFileSize = size;
		maxFileAmount=0;
	}
	public Fileupload(int amount){
		maxFileAmount = amount;
	}
	public Fileupload(long size, int amount){
		maxFileSize = size;
		maxFileAmount = amount;
	}
	public void upload(){
		System.out.println("파일 업로드 실행중....");
		System.out.println("최대 파일사이즈:"+maxFileSize);
		System.out.println("최대 파일갯수:"+maxFileAmount);
	}
	
}
