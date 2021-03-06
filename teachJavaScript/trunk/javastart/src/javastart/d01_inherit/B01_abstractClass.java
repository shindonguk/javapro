package javastart.d01_inherit;

abstract class Larba01{
	private String kind;
	public Larba01(){
		this.kind="라바";
	}
	public Larba01(String kind){
		this.kind=kind;
	}	
	
	public String getKind() {
		return kind;
	}
	public void moving(){
		System.out.println(kind+"가 이동합니다.");
	}
	// {}body가 없는 메서드는 추상메서드 : 하위객체에서 이
	// 메서드를 반드시 재정의 하여야 함..
	// 추상메서드가 한개이상 포함된 클래스는 추상클래스이며
	// 클래스선언 앞에 abstract라고 선언해 주어야 한다.
	public abstract void attack();
}
class Dron01 extends Larba01{	
	public Dron01() {
		super("드론");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"가 약한 미사일 공격을 합니다.");
	}
	
}
class Zerggling01 extends Larba01{

	public Zerggling01() {
		super("저글링");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"가 약하지만 빠른 근접 공격을 합니다.");		
	}
	
}
public class B01_abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larba01 l1 = new Dron01();	
		Larba01 l2 = new Zerggling01();	
		l1.attack();
		l2.attack();
		
		// 추상클래스는 객체생성을 목적으로 하지 않고,
		// 하위클래스의 객체의 메서드 overriding을 위해 
		// 만들어 졌으므로 자체로 객체생성을 하지 못 한다.
//		Larba01 l3 = new Larba01();
	}
/*
확인예제
1단계
상위
Robot 
	변수:kind, attPt
	일반메서드:attack()
	추상메서드:spAttack()
하위
Atom
Mv

2단계
	변수:heaPt(현체력)
	일반메서드:  attack()  return값으로 공격  
	      defend(공격받은 데이터)
	     공격받은 만큼 체력 차감..
하위
Mz 추가.

임의의 2개 로봇을 대전 게임을 시켜..
체력이 먼저 바닥나면 해당 로봇 승..
	             





 * */
}
