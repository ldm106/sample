public class Score{
	String name;
	int kor;
	int eng;
	int math;


	//public Score(String n ,int k, int e, int m){
	//	name=n;
	//	kor=k;
	//	eng=e;
	//	math=m;
//
	
	//}
	public int total(){
		return kor+eng+math;
	}

	public double average(){
		return total()/3.0;
	}
}
