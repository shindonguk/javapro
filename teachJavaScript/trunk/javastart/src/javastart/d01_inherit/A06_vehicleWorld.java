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
class Vehicle2{
	private String kind;
	private String mainFunc;
	private int maxPassenger;
	private int curVelocity; // 현재속도 표시..
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
		System.out.println(kind+"는 주로 "+mainFunc+"를 한다. 최대 탑승인원 "+maxPassenger+" 명");
	}
	public void speedUp(){
		if(curVelocity<=maxVelocity){
			curVelocity+=velStep;
			System.out.println(kind+"가 속도를 올립니다!");
		}else{
			System.out.println("현재 최고 속도 입니다.");
		}
		curVelocity();
	}
	private void curVelocity(){
		System.out.println("현재 속도 시속 "+curVelocity+"km/h");
	}
	public void speedDown(){
		
		// 속도step과 최저 속도 처리 로직 추가 필요..
		if(curVelocity>0){
			curVelocity-=velStep;
			System.out.println(kind+"가 속도를 내립니다!");
		}else{
			System.out.println("현재 정차 상태 입니다.");
		}
		curVelocity();
	}	
}
class Car2 extends Vehicle2{
	public Car2() {
		super("자동차", "5명 이내 인원 간편한 이동", 5,220,12);
	}
	public void working(){
		super.working();
		System.out.println("마이카와 함께하는 즐거운 드라이버!!");
	}	
}
class Bus2 extends Vehicle2{
	public Bus2() {
		super("버스", "다수 인원 이동", 40,150,7);
	}
	public void working(){
		super.working();
		System.out.println("우리반 친구들과 함께 하는 버스 수학여행! ");
	}		
}
class Truck2 extends Vehicle2{
	public Truck2() {
		super("트럭", "화물 이동", 3,160,8);
	}

	public void working(){
		super.working();
		System.out.println("오늘은 컨테이너 박스 이동합니다. ");
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
