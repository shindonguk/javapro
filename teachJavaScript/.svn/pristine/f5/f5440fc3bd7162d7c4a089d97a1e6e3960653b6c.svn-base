package javastart.d01_inherit;

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
class NormalDuck extends Duck{
	// 상위 클래스에서 생성자가 default가 아니면 상위 생성자의 param과
	// 동일한 생성자를 구현하여야 한다.	
	public NormalDuck() {
		super("보통오리");
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"는 꽥꽥 거립니다");		
	}
}
class RobotDuck extends Duck{
	// 상위 클래스에서 생성자가 default가 아니면 상위 생성자의 param과
	// 동일한 생성자를 구현하여야 한다.	
	public RobotDuck() {
		super("로봇오리");
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"는 빽빽(전자음) 거립니다");		
	}
}
public class C02_duckWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스 = 실제클래스..(다형성)
		Duck []polyDuck = {new RubberDuck(),new NormalDuck(),new RobotDuck()};
		int ranDuckIdx=(int)(Math.random()*3);
		polyDuck[ ranDuckIdx ].move();
		polyDuck[ ranDuckIdx ].sound();
/*
피자
2단계
	Pizza [] orderedList... // 주문된 피자 list..
	   주문한 피자의 갯수와 가격에 따라..
	   계산서를 출력처리..
	   @@@@맛 피자  25000  3판
	   @@@@맛 피자  33000  2판
	   @@@@맛 피자  21000  1판
	           총  @@@@@ 원
 * */		
		
		
	}

}
