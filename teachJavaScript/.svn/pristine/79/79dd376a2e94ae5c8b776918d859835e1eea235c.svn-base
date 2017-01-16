package javastart.d01_inherit;

import java.util.Random;

abstract class Larva {
	private String kind;
	
	public Larva() {
		this.kind = "라바";
	}
	public Larva(String kind) {	
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void moving() {
		System.out.println(kind + "가 이동합니다");
	}	
	
	public abstract void attack();
}

class Drone extends Larva {
	public Drone() {
		super("드론");
	}
	@Override
	public void attack() {
		System.out.println(getKind() + "가 공격합니다");
	}
}
class Zerggling01 extends Larva {
	public Zerggling01() {
		super("저글링");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getKind() + "가 근접 공격합니다");		
	}
}


abstract class Robot {
	protected String kind;
	protected int power;
	protected int hp;
	
	public Robot() {
		this.kind = "로보트";
		this.power = 0;
		this.hp = 0;
	}
	public Robot(String kind, int power, int hp) {
		this.kind = kind;
		this.power = power;
		this.hp = hp;
	}
	
	public int attack() {
		if (hp > 0) {
			System.out.println(kind + "가 공격합니다");
			return power;
		} else {
			System.out.println(kind + "가 파괴되어 공격을 할 수 없습니다");
			return 0;
		}
	}
	public void defend(int power) {
		hp -= power;
		if (hp <= 0) {
			hp = 0;
			System.out.println(kind + "가 hp 0이 되어서 파괴되었습니다");
		} else {
			System.out.println(kind + "의 남은 hp는 " + hp + "입니다");
		}
	}
	
	public int getHp() {
		return hp;
	}
	public String getKind() {
		return kind;
	}
	
	public abstract int spAttack();
}

class Atom extends Robot {
	public Atom(String kind, int attackPower, int hp) {
		super(kind, attackPower, hp);
	}
	
	@Override
	public int spAttack() {
		if (hp > 0) {
			System.out.println(kind + "가 겁나 빠른 공격을 합니다");
			return power * 2;
		} else {
			System.out.println(kind + "가 파괴되어 공격을 할 수 없습니다");
			return 0;
		}
	}	
}
class Mechander extends Robot {
	public Mechander(String kind, int attackPower, int hp) {
		super(kind, attackPower, hp);
	}
	
	@Override
	public int spAttack() {
		if (hp > 0) {
			System.out.println(kind + "가 죠스를 날립니다");
			return power * 2;
		} else {
			System.out.println(kind + "가 파괴되어 공격을 할 수 없습니다");
			return 0;
		}
	}	
}

class GameManager {
	private Robot p1;
	private Robot p2;
	
	public GameManager(Robot p1, Robot p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void battle() {
		Random random = new Random();
		
		while (true) {
			if (random.nextBoolean()) {
				p2.defend(p1.spAttack());
			} else {
				p1.defend(p2.spAttack());
			}
			
			if (p1.getHp() == 0 && p2.getHp() == 0) {
				System.out.println("둘 다 파괴되었습니다. 무승부");
				break;
			} else if (p1.getHp() == 0) {
				System.out.println(p2.getKind() + "가 이겼습니다");
				break;				
			} else if (p2.getHp() == 0) {
				System.out.println(p1.getKind() + "가 이겼습니다");
				break;
			}
			
			sleep(2000);
		}
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);;
		} catch (InterruptedException e) {}
	}
}
public class B01_abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot atom = new Atom("아톰", 5, 100);
		Robot mechander = new Mechander("메칸더", 5, 100);
		
		GameManager gm = new GameManager(atom, mechander);
		
		gm.battle();
		
		System.out.println("게임 종료");
		

	}

}
