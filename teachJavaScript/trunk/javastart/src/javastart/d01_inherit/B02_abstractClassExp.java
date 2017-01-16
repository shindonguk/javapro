package javastart.d01_inherit;


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
abstract class Robot{
	private String kind;
	private int attPt;
	public Robot(String kind, int attPt){
		this.kind = kind;
		this.attPt = attPt;
	}
	public void attack(){
		System.out.println(kind+"가 "+attPt+"로 공격한다!");
	}
	public abstract void spAttack();
}
class Mv extends Robot{
	public Mv() {
		super("메컨더V", 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@특수공격@@");
		super.attack();
		System.out.println("상어 공격을 하다!\n============");
	}
}
class Atom extends Robot{
	public Atom() {
		super("아톰", 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@특수공격@@");
		super.attack();
		System.out.println("작은 체구로 민첩한 공격을 하다!");
	}
}
public class B02_abstractClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Mv();
		r1.attack();
		r1.spAttack();
		Robot r2 = new Atom();
		r2.attack();
		r2.spAttack();
	}

}
