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
class Vehicle{
	private String kind;
	private String mainFunc;
	private int maxPassenger;
	public Vehicle(String kind, String mainFunc, int maxPassenger){
		this.kind=kind;
		this.mainFunc=mainFunc;
		this.maxPassenger=maxPassenger;
	}
	public void working(){
		System.out.println(kind+"�� �ַ� "+mainFunc+"�� �Ѵ�. �ִ� ž���ο� "+maxPassenger+" ��");
	}
}
class Car extends Vehicle{
	public Car() {
		super("�ڵ���", "5�� �̳� �ο� ������ �̵�", 5);
	}
	// ������..
	public void working(){
		super.working();
		System.out.println("��ſ� �ָ� ����̹�..");
	}	
}
class Bus extends Vehicle{
	public Bus() {
		super("����", "�ټ� �ο� �̵�", 40);
	}
}
class Truck extends Vehicle{
	public Truck() {
		super("Ʈ��", "ȭ�� �̵�", 3);
	}
}



public class A05_vehicleWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car v1= new Car();
		v1.working();
		Bus v2= new Bus();
		v2.working();
		Truck v3= new Truck();
		v3.working();
	}

}
