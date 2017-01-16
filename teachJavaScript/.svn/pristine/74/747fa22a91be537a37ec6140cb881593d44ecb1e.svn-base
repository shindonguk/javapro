package javastart.d01_inherit;

// 상위클래스 시작 유닉 클래스
class Larba{
	private String kind;
	private int attackPt;
	private int defPt;
	public Larba() {
		this.kind = "라바";
		this.attackPt=0;
		this.defPt=0;
	}
	public Larba(String kind, int attackPt, int defPt) {
		this.kind = kind;
		this.attackPt=attackPt;
		this.defPt=defPt;
	}	
	public void attack(){
		System.out.println(kind+"가 공격하다. 공격력"+attackPt);
	}
	public void defend(){
		System.out.println(kind+"가 방어를 하다. 방어력"+defPt);
	}		
}
class Dron extends Larba{
	// super : 상위클래스에 있는 생성자, 변수, 메서드를 현재 클래스의
	//         생성자, 변수, 메서드와 구분 하기 위해서 쓰임..
	public Dron(){
		super("드론",5,0); // 직접적으로 변수를 할당하지 못하지만,
		                  // 간접적으로 할당하여 쓰일 수 있다.
	}
	// 메서드 재정의 overriding : 상위에 있는 메서드를 하위클래스에서
	// 재활용하여 재정의 함으로 다형성을 가능하게 한다.
	public void attack(){
		super.attack();
		System.out.println("missile 공격을 하다. 주로 일꾼임..");
	}	
}
class Zerggling extends Larba{
	// super : 상위클래스에 있는 생성자, 변수, 메서드를 현재 클래스의
	//         생성자, 변수, 메서드와 구분 하기 위해서 쓰임..
	public Zerggling(){
		super("저글링",5,0); // 직접적으로 변수를 할당하지 못하지만,
		                     // 간접적으로 할당하여 쓰일 수 있다.
	}
	// 메서드 재정의 overriding : 상위에 있는 메서드를 하위클래스에서
	// 재활용하여 재정의 함으로 다형성을 가능하게 한다.
	public void attack(){
		super.attack();
		System.out.println("빠른 접근 공격을 하다. ");
	}	
}
public class A04_StarWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larba l1 = new Larba();
		l1.attack();
		l1.defend();
		// 상위 = 하위 : 다형성처리..
		Larba l2 = new Dron();
		l2.attack();
		l2.defend();
		Larba l3 = new Zerggling();
		l3.attack();
		l3.defend();	
	}
/*
1단계
(상위) Vehicle (탈것)
		속성:종류, 주기능, 최대탑승인원
		메서드: working()  ex) @@@인 주로 @@@를 한다. 최대 탑승인원@@@
(하위) Car
	   Bus
	   Truck
2단계 : 다형성 배열처리 포함. 
	추가변수: 최대속도, 속도step
	추가메서드 : speedUp(), speedDown()  최대속도 및 최소속도 제한처리

 * */
}
