package javastart.D01_inherit;

/*
추상클래스
overriding 처리..
Duck
	sound();
1) RubberDuck
    sound()에 소리가 없음..
2) NormalDuck
	sound() 꽥꽥!!!
3) RobotDuck
	sound() 전자음     
 * */
abstract class Duck{
	private String kind;
	// 접근제어자가 private 이기에 하위 클래스에서 접근할 수 있는
	// 메서드를 구현하여야 한다.
	public Duck(String kind){
		this.kind=kind;
	}
	public String getKind() {
		return kind;
	}
	public void move(){
		System.out.println(kind+" 가 지나간다!!");
	}
	// 재정의할 메서드 sound()
	abstract void sound();
}
class RubberDuck extends Duck{
	// 상위 클래스에서 생성자가 default가 아니면 상위 생성자의 param과
	// 동일한 생성자를 구현하여야 한다.	
	public RubberDuck() {
		super("고무오리");
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"는 소리가 없습니다.~~둥둥(의태어)");		
	}
}
/*
2) NormalDuck
	sound() 꽥꽥!!!
3) RobotDuck
	sound() 전자음    
 * */

public class C02_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스 = 실제클래스..(다형성)
		Duck d1 = new RubberDuck();
		d1.move();
		d1.sound();
		
	}

}

