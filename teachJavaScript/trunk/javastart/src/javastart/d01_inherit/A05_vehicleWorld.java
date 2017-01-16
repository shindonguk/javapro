package javastart.d01_inherit;

/*
1단계
(상위) Vehicle (탈것)
		속성:종류, 주기능, 최대탑승인원
		메서드: working()  ex) @@@인 주로 @@@를 한다. 최대 탑승인원@@@
(하위) Car
	   Bus
	   Truck
2단계 : 다형성 배열처리 포함. 
	추가변수: 최대속도, 속도step
	추가메서드 : speedUp(), speedDown()  최대속도 및 최소속도 제한처리

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
		System.out.println(kind+"는 주로 "+mainFunc+"를 한다. 최대 탑승인원 "+maxPassenger+" 명");
	}
}
class Car extends Vehicle{
	public Car() {
		super("자동차", "5명 이내 인원 간편한 이동", 5);
	}
	// 재정의..
	public void working(){
		super.working();
		System.out.println("즐거운 주말 드라이버..");
	}	
}
class Bus extends Vehicle{
	public Bus() {
		super("버스", "다수 인원 이동", 40);
	}
}
class Truck extends Vehicle{
	public Truck() {
		super("트럭", "화물 이동", 3);
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
