public class SwitchDemo{
	public static void main(String[] args){

	String grade = "Goldss";
		switch(grade){
			 case "Gold":
				System.out.println("당신의 등급은"+grade+"입니다.");
			 break;
			case "Silver":
				System.out.println("당신의 등급은"+grade+"입니다.");
			break;
			case "Bronze":
				System.out.println("당신의 등급은"+grade+"입니다.");
			break;
			default:
				System.out.println("올바른 등급이 아닙니다.");
			
		}
	}
}
