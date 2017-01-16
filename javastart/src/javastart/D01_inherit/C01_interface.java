package javastart.D01_inherit;

abstract interface Flyway{
	// �������̽��� �տ� abstract�� �׻� �پ��ִ�.
	// ��������.
	void fly();
}
//�������̽��� ��� �޴� ���� implements
class CountryFlying implements Flyway{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�츮 ���׸� ������!!");
	}
	
}
class mz{
	private String name;
	private Flyway flyway;
	public mz(){
		name="mz";
	}
	private void attack() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� �����ϴ�.");	
	}
	//���� ������ ���� �� �ִ� �������(interface)����
	public void setFlyway(Flyway flyway){
		this.flyway=flyway;
	}
	public void flying(){
		System.out.println(name+"��");
		//�������̽��� ��ӹ��� ���� ��ü�� �Ҵ��� �Ǹ�
		if(flyway!=null){
			flyway.fly();
		}else{
			System.out.println("���� ���� ����");
		}
		
	}
}
public class C01_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mz mz1 = new mz();
		mz1.flying();
		//flyway ��ӹ��� ���� ��ü�� CountryFlying
		CountryFlying flying = new CountryFlying();
		
		mz1.setFlyway(flying);
		mz1.flying();
	}

}