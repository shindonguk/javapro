package javastart.d01_inherit;


/*
Ȯ�ο���
1�ܰ�
����
Robot 
	����:kind, attPt
	�Ϲݸ޼���:attack()
	�߻�޼���:spAttack()
����
Atom
Mv
2�ܰ�
	����:heaPt(��ü��)
	�Ϲݸ޼���:  attack()  return������ ����  
	      defend(���ݹ��� ������)
	     ���ݹ��� ��ŭ ü�� ����..
����
Mz �߰�.
������ 2�� �κ��� ���� ������ ����..
ü���� ���� �ٴڳ��� �ش� �κ� ��..

 * */
abstract class Robot{
	private String kind;
	private int attPt;
	public Robot(String kind, int attPt){
		this.kind = kind;
		this.attPt = attPt;
	}
	public void attack(){
		System.out.println(kind+"�� "+attPt+"�� �����Ѵ�!");
	}
	public abstract void spAttack();
}
class Mv extends Robot{
	public Mv() {
		super("������V", 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@Ư������@@");
		super.attack();
		System.out.println("��� ������ �ϴ�!\n============");
	}
}
class Atom extends Robot{
	public Atom() {
		super("����", 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println("@@Ư������@@");
		super.attack();
		System.out.println("���� ü���� ��ø�� ������ �ϴ�!");
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