package javastart.d01_inherit;

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
class Vehicle2{
	private String kind;
	private String mainFunc;
	private int maxPassenger;
	private int curVelocity; // ����ӵ� ǥ��..
	private int maxVelocity;
	private int velStep;
	public Vehicle2(String kind, String mainFunc, 
					int maxPassenger, int maxVelocity,
					int velStep){
		this.kind=kind;
		this.mainFunc=mainFunc;
		this.maxPassenger=maxPassenger;
		this.maxVelocity=maxVelocity;
		this.velStep=velStep;
	}
	public void working(){
		System.out.println(kind+"�� �ַ� "+mainFunc+"�� �Ѵ�. �ִ� ž���ο� "+maxPassenger+" ��");
	}
	public void speedUp(){
		if(curVelocity<=maxVelocity){
			curVelocity+=velStep;
			System.out.println(kind+"�� �ӵ��� �ø��ϴ�!");
		}else{
			System.out.println("���� �ְ� �ӵ� �Դϴ�.");
		}
		curVelocity();
	}
	private void curVelocity(){
		System.out.println("���� �ӵ� �ü� "+curVelocity+"km/h");
	}
	public void speedDown(){
		
		// �ӵ�step�� ���� �ӵ� ó�� ���� �߰� �ʿ�..
		if(curVelocity>0){
			curVelocity-=velStep;
			System.out.println(kind+"�� �ӵ��� �����ϴ�!");
		}else{
			System.out.println("���� ���� ���� �Դϴ�.");
		}
		curVelocity();
	}	
}
class Car2 extends Vehicle2{
	public Car2() {
		super("�ڵ���", "5�� �̳� �ο� ������ �̵�", 5,220,12);
	}
	public void working(){
		super.working();
		System.out.println("����ī�� �Բ��ϴ� ��ſ� ����̹�!!");
	}	
}
class Bus2 extends Vehicle2{
	public Bus2() {
		super("����", "�ټ� �ο� �̵�", 40,150,7);
	}
	public void working(){
		super.working();
		System.out.println("�츮�� ģ����� �Բ� �ϴ� ���� ���п���! ");
	}		
}
class Truck2 extends Vehicle2{
	public Truck2() {
		super("Ʈ��", "ȭ�� �̵�", 3,160,8);
	}

	public void working(){
		super.working();
		System.out.println("������ �����̳� �ڽ� �̵��մϴ�. ");
	}			
}



public class A06_vehicleWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2[] vel = {new Car2(), new Bus2(), new Truck2()};
		for(Vehicle2 v:vel){
			v.working();
			v.speedUp();
			v.speedUp();
			v.speedUp();
			v.speedDown();
			v.speedDown();
			v.speedDown();
		}
	}

}
