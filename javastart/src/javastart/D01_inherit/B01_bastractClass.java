package javastart.D01_inherit;

	abstract class larba01{
		private String kind;
		public larba01() {
			this.kind = "���";
		}
		public larba01(String kind) {
			this.kind=kind;
			
		}
		public String getkind() {
			return kind;
			
		}
		public void moving(){
			System.out.println(kind+"�� �̵��մϴ�.");
		}
		//{}body�� ���� �޼���� �߻�޼���: ������ü����
		//�� �޼��带 �ݵ�� ������ �Ͽ��� ��
		//�߻�޼��尡 �Ѱ��̻� ���Ե� Ŭ������ �߻�Ŭ���� �̸�
		//Ŭ�������� �տ� abstract��� ������ �־�� �Ѵ�.
		public abstract void attack();
	}
	class Dron extends larba01{
		public Dron() {
			super("���");
			// TODO Auto-generated constructor stub
		}
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println(getkind()+"�� �̻��� ������ �մϴ�.");
		}
		
	}
class zerggling01 extends larba01{
	public zerggling01() {
		super("���۸�");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
		
public class B01_bastractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		larba01 l1 = new Dron();
		larba01 l2 = new zerggling01();
		l1.attack();
		l2.attack();

	}
/*
 * Ȯ�ο���
 * 1�ܰ�
 * ����
 * Robot
 * 		����:
 * ����
 * Atom
 * My
 */

}