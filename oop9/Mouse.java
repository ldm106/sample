//명세서 정의
//모든 마우스 객체가 반드시 구현해야하는 기능을 정의한것
//인터페이스:명세,구약,표준,스펙,객체생성이 안된다.
public interface Mouse{
	public abstract void Wheel();
	public abstract void click();
	public abstract void move();

	//public abstract를 생략가능
	//mouse라는 설계도가 가져야 하는 기능 그 안에 Wheel기능 click기능 move 기능
}