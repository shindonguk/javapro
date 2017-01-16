package javastart.d01_inherit;

// ��ü�� �ٴ� �����.
interface FlyWay{
	// �������̽��� �տ� abstract�� �׻� �پ� �ִ�.
	// ��������.
	void fly();
}
// �������̽��� ��� �޴� ���� implements
class CountryFlying implements FlyWay{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�츮 ���׸� ������!!");
	}
}
class WorldFlying implements FlyWay{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���踦 �����!!");
	}
	
}

class Mz{
	private String name;
	private FlyWay flyway;
	public Mz(){
		name="MZ";
	}
	public void attack(){
		System.out.println(name+"�� �����ϴ�.");
	}
	// ���� ������ ���� �� �ִ� �����(interface) ����
	public void setFlyway(FlyWay flyway) {
		this.flyway = flyway;
	}
	public void flying(){
		System.out.print(name+"�� ");
		// �������̽��� ��ӹ��� ���� ��ü�� �Ҵ��� �Ǹ�..
		if(flyway!=null){
			flyway.fly();
		}else{
			System.out.println("���� �������� �ʾƼ� ...�ٱ⸸ ��.");
		}
	}
}
public class C01_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mz mz01 = new Mz();
		mz01.attack();
		mz01.flying();
		// FlyWay ��ӹ��� ���� ��ü�� CountryFlying()����..
		CountryFlying flying = new CountryFlying();
		// FlyWay flyway= new CountryFlying();
		mz01.setFlyway(flying);
		mz01.flying();
		
		mz01.setFlyway(new WorldFlying());
		mz01.flying();
		
	
				
				
	}

}
