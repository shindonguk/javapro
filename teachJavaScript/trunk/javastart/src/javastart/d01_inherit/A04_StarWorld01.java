package javastart.d01_inherit;

// ����Ŭ���� ���� ���� Ŭ����
class Larba{
	private String kind;
	private int attackPt;
	private int defPt;
	public Larba() {
		this.kind = "���";
		this.attackPt=0;
		this.defPt=0;
	}
	public Larba(String kind, int attackPt, int defPt) {
		this.kind = kind;
		this.attackPt=attackPt;
		this.defPt=defPt;
	}	
	public void attack(){
		System.out.println(kind+"�� �����ϴ�. ���ݷ�"+attackPt);
	}
	public void defend(){
		System.out.println(kind+"�� �� �ϴ�. ����"+defPt);
	}		
}
class Dron extends Larba{
	// super : ����Ŭ������ �ִ� ������, ����, �޼��带 ���� Ŭ������
	//         ������, ����, �޼���� ���� �ϱ� ���ؼ� ����..
	public Dron(){
		super("���",5,0); // ���������� ������ �Ҵ����� ��������,
		                  // ���������� �Ҵ��Ͽ� ���� �� �ִ�.
	}
	// �޼��� ������ overriding : ������ �ִ� �޼��带 ����Ŭ��������
	// ��Ȱ���Ͽ� ������ ������ �������� �����ϰ� �Ѵ�.
	public void attack(){
		super.attack();
		System.out.println("missile ������ �ϴ�. �ַ� �ϲ���..");
	}	
}
class Zerggling extends Larba{
	// super : ����Ŭ������ �ִ� ������, ����, �޼��带 ���� Ŭ������
	//         ������, ����, �޼���� ���� �ϱ� ���ؼ� ����..
	public Zerggling(){
		super("���۸�",5,0); // ���������� ������ �Ҵ����� ��������,
		                     // ���������� �Ҵ��Ͽ� ���� �� �ִ�.
	}
	// �޼��� ������ overriding : ������ �ִ� �޼��带 ����Ŭ��������
	// ��Ȱ���Ͽ� ������ ������ �������� �����ϰ� �Ѵ�.
	public void attack(){
		super.attack();
		System.out.println("���� ���� ������ �ϴ�. ");
	}	
}
public class A04_StarWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Larba l1 = new Larba();
		l1.attack();
		l1.defend();
		// ���� = ���� : ������ó��..
		Larba l2 = new Dron();
		l2.attack();
		l2.defend();
		Larba l3 = new Zerggling();
		l3.attack();
		l3.defend();	
	}
/*
1�ܰ�
(����) Vehicle (Ż��)
		�Ӽ�:����, �ֱ��, �ִ�ž���ο�
		�޼���: working()  ex) @@@�� �ַ� @@@�� �Ѵ�. �ִ� ž���ο�@@@
(����) Car
	   Bus
	   Truck
2�ܰ� : ������ �迭ó�� ����. 
	�߰�����: �ִ�ӵ�, �ӵ�step
	�߰��޼��� : speedUp(), speedDown()  �ִ�ӵ� �� �ּҼӵ� ����ó��

 * */
}
