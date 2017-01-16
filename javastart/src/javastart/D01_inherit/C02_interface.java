package javastart.D01_inherit;

/*
�߻�Ŭ����
overriding ó��..
Duck
	sound();
1) RubberDuck
    sound()�� �Ҹ��� ����..
2) NormalDuck
	sound() �в�!!!
3) RobotDuck
	sound() ������     
 * */
abstract class Duck{
	private String kind;
	// ���������ڰ� private �̱⿡ ���� Ŭ�������� ������ �� �ִ�
	// �޼��带 �����Ͽ��� �Ѵ�.
	public Duck(String kind){
		this.kind=kind;
	}
	public String getKind() {
		return kind;
	}
	public void move(){
		System.out.println(kind+" �� ��������!!");
	}
	// �������� �޼��� sound()
	abstract void sound();
}
class RubberDuck extends Duck{
	// ���� Ŭ�������� �����ڰ� default�� �ƴϸ� ���� �������� param��
	// ������ �����ڸ� �����Ͽ��� �Ѵ�.	
	public RubberDuck() {
		super("��������");
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"�� �Ҹ��� �����ϴ�.~~�յ�(���¾�)");		
	}
}
/*
2) NormalDuck
	sound() �в�!!!
3) RobotDuck
	sound() ������    
 * */

public class C02_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻�Ŭ���� = ����Ŭ����..(������)
		Duck d1 = new RubberDuck();
		d1.move();
		d1.sound();
		
	}

}
