package javastart.c02_static;

abstract class robot {
	private String kind;
	private int atk;
	protected int hp;

	public robot() {
		this.kind = "�κ�";
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
		System.out.println(getKind() + "(��)�� ������ ���մϴ�.");
	}

	public abstract int sattack();

	public abstract void defend(int a);
}

class atom extends robot {
	public atom() {
		super("����", 10, 1000);
	}

	@Override
	public int sattack() {
		System.out.println(getKind() + "(��)�� ������ �����մϴ�.");
		return getAtk();
	}

	public void defend(int a) {
		hp -= a;
		if (hp <= 0) {
			System.out.println(getKind() + "�� ü���� �����մϴ�.");
			System.out.println(getKind() + "�� �й��Ͽ����ϴ�.\n");
		} else {
			System.out.println(getKind() + "(��)�� ���� �޾ҽ��ϴ�.");

			System.out.println(getKind() + "���� ü����" + hp + "��ŭ ���ҽ��ϴ�\n");
		}
	}
}

class m_v extends robot {
	public m_v() {
		super("��ĭ��", 100, 50);
	}

	public int sattack() {
		System.out.println(getKind() + "(��)�� �� �߻��մϴ�.");
		return getAtk();
	}

	public void defend(int a) {
		hp -= a;
		if (hp <= 0) {
			System.out.println(getKind() + "�� ü���� �����մϴ�.");

			System.out.println(getKind() + "�� �й��Ͽ����ϴ�.\n");
		} else {
			System.out.println(getKind() + "(��)�� ���� �޾ҽ��ϴ�.");

			System.out.println(getKind() + "���� ü����" + hp + "��ŭ ���ҽ��ϴ�\n");
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
