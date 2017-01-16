package javastart.b01_object;

class Bus{
	private String busNumber;
	private Passenger passenger;
	public Bus(String busNumber) {
		super();
		this.busNumber = busNumber;
	}
	public void pickUp(Passenger passenger){
		this.passenger=passenger;
		System.out.println(busNumber+"번 버스에");
		System.out.println("승객이 탑승하였습니다.");		
	}
	public void go(){
		if(passenger!=null){
			passenger.paying();
		}
	}
}
class Passenger{
	private int pay;
	public Passenger(){
		this.pay=1200;
	}	
	public Passenger(int pay){
		this.pay=pay;
	}
	public void paying(){
		System.out.println("승객이 "+pay+"원을 지불하였습니다!");
	}
}

public class C05_Bus_Proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b1 = new Bus("7009");
		b1.pickUp(new Passenger());
		b1.go();
	}

}
/*
확인예제.(1단계)
1. Home
	속성: 주소, Member
	메서드 : setMember
	         show() 우리집은 @@@에 있는데
	                가족 소개합니다.
	                아빠는 @@이고 올해 @@세입니다.
2. Member
	속성:이름, 역할, 나이
	메서드: 소개
	       
확인예제.(2단계)
 *   addMember( 가족추가..
 *       가족 멤버 
 *       엄마 @@@ 43 추가되었습니다.
 * */
