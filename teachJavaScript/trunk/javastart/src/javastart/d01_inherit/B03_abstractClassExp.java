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
abstract class Robot01{
	private String kind;
	private int attPt;
	private int curHp;
	public Robot01(String kind, int attPt, int curHp){
		this.kind = kind;
		this.attPt = attPt;
		this.curHp = curHp;
	}
	
	public String getKind() {
		return kind;
	}

	public int attack(){
		System.out.println(kind+" 공격력 "+attPt+"pt로 공격한다!");
		return attPt;
	}
	// param으로 상대방의 공력이 들어옴
	// if( r2.defend(r1.attack())<= 0){
	public int defend(int attack){
		System.out.println(kind+" 공격 받아 체력이 "+attPt+"hp만큼 감소되다!");
		// 체력 차감..
		curHp-=attack;
		curHp();
		// 현재 공격을 받아 남은 체력을 return
		return curHp;
	}	
	
	public abstract int spAttack();
	public void curHp(){
		System.out.println(kind+"의 현재 체력 "+curHp+"hp ");
	}
}
class Mv01 extends Robot01{
	public Mv01() {
		super("메컨더V", 10, 30);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@특수공격@@");
		System.out.println("상어 공격을 하다!\n============");
		return super.attack()+20;
	}
}
class Atom01 extends Robot01{
	public Atom01() {
		super("아톰",  10, 50);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@특수공격@@");
		
		System.out.println("작은 체구로 민첩한 공격을 하다!");
		return super.attack()+10;
	}
}
public class B03_abstractClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot01 r1 = new Mv01();
		Robot01 r2 = new Atom01();
		while(true){
			// defend() : 현재 객체의 체력을 return
			if( r2.defend(r1.attack())<=0){
				System.out.println(r1.getKind()+"승!!");
				break;
			}
			if( r1.defend(r2.attack())<=0){
				System.out.println(r2.getKind()+"승!!");
				break;			
			}
		}

	}

}
