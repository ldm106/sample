public class CarApp{
	public static void main(String[] args){		
		/*
			Car c
				Car라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c
				설계도 자체도 타입이다.
				Car 타입(클래스 타입=참조타입)의 변수 c(참조변수)를 만든다.

			new Car();
			Car 설계도를 로드해서 객체를 생성하고,
			생성된 객체를 참조할 수 있는 주소값을 반환하는 코드다.
			Car c = new Car();
			Car 설계도를 로드해서 객체를 생성하고, 생성된 객체를 참조할 수 있는 주소값을 Car타입의 변수 c에 저장해라.
		
		*/
		Car c = new Car();
		Car c2 = new Car();
		Car d=c;
		d.speed=10;
		System.out.println(d.speed);

		//생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
		System.out.println(c.speed);//c가 참조하는 객체의 speed 속성값 조회
		c.speed=6;
		System.out.println(c.speed);
		c.speedUp();//c가 참조하는 객체에 포함된 speedUp()기능 실행하기
		c.speedDown();
		System.out.println(c);//주소값은 아니다. 처음엔 클래스 이름과 동일하고 그 뒤엔 객체를 식별하는 해쉬코드가 나온다.
		System.out.println(c2);//제품의 시리얼 번호라고도 한다.
	}
}