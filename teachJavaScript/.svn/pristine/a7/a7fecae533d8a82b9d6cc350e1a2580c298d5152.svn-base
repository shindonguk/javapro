package javastart.c02_static;

abstract class robot {
	private String kind;
	private int atk;
	protected int hp;

	public robot() {
		this.kind = "로봇";
		this.atk = 0;
		this.hp = 0;
	}

	public robot(String kind, int atk, int hp) {
		this.kind = kind;
		this.atk = atk;
		this.hp = hp;
	}

	public String getKind() {
		return kind;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public void attack() {
		System.out.println(getKind() + "(은)는 공격을 못합니다.");
	}

	public abstract int sattack();

	public abstract void defend(int a);
}

class atom extends robot {
	public atom() {
		super("아톰", 10, 1000);
	}

	@Override
	public int sattack() {
		System.out.println(getKind() + "(이)가 빠르게 공격합니다.");
		return getAtk();
	}

	public void defend(int a) {
		hp -= a;
		if (hp <= 0) {
			System.out.println(getKind() + "는 체력이 부족합니다.");
			System.out.println(getKind() + "가 패배하였습니다.\n");
		} else {
			System.out.println(getKind() + "(이)가 공격 받았습니다.");

			System.out.println(getKind() + "현재 체력이" + hp + "만큼 남았습니다\n");
		}
	}
}

class m_v extends robot {
	public m_v() {
		super("메칸더", 100, 50);
	}

	public int sattack() {
		System.out.println(getKind() + "(이)가 상어를 발사합니다.");
		return getAtk();
	}

	public void defend(int a) {
		hp -= a;
		if (hp <= 0) {
			System.out.println(getKind() + "는 체력이 부족합니다.");

			System.out.println(getKind() + "가 패배하였습니다.\n");
		} else {
			System.out.println(getKind() + "(이)가 공격 받았습니다.");

			System.out.println(getKind() + "현재 체력이" + hp + "만큼 남았습니다\n");
		}

	}

}

public class B01_abstract2_exp {
	public static void main(String[] args) {

		m_v m1 = new m_v();
		atom a1 = new atom();

		a1.defend(m1.sattack());
		m1.defend(a1.sattack());
		a1.defend(m1.sattack());
		a1.defend(m1.sattack());

		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());
		m1.defend(a1.sattack());

	}
}
