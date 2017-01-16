package javastart.b01_object;
class Bus2{
	private String busNumber;
	private Passenger2 passenger;
	private int cnt;
	private int totPay;
	public Bus2(String busNumber) {
		super();
		this.busNumber = busNumber;
	}
	public void pickUp(Passenger2 passenger){
		System.out.println("============");
		cnt++;  // 객체의 승객수..
		this.passenger=passenger;
		System.out.println(busNumber+"번 버스에");
		System.out.println("승객이 탑승하였습니다.");		
		go();
		current();

		
	}
	// 내부에서 쓰이는 공통메서드..
	private void current(){
		System.out.println("현재 총 "+cnt+"명이 탑승하였고,");
		System.out.println("현재 총 "+totPay+" 누적 수입금액이 있습니다");
	}
	private void go(){
		if(passenger!=null){
			totPay+=passenger.paying(); // 승객의 지불한 금액을 
			// return해서 받음.. 버스의 총 매출액에 누적처리..
		}
	}
}
class Passenger2{
	private int pay;
	public Passenger2(){
		this.pay=1200;
	}	
	public Passenger2(int pay){
		this.pay=pay;
	}
	// 누적처리..현재지불된 금액 return
	public int paying(){
		System.out.println("승객이 "+pay+"원을 지불하였습니다!");
		return pay;
	}
}

public class C06_Bus_Proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus2 b1 = new Bus2("1111");
		Bus2 b2 = new Bus2("2222");		
		b1.pickUp(new Passenger2(2400));
		b1.pickUp(new Passenger2());
		
		b2.pickUp(new Passenger2());
		b2.pickUp(new Passenger2());
		
		b1.pickUp(new Passenger2());
		b1.pickUp(new Passenger2(2500));

		b2.pickUp(new Passenger2());

		b2.pickUp(new Passenger2());
		
		
		

	}

}
