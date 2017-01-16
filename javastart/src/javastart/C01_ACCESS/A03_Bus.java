package javastart.C01_ACCESS;
import java.util.Scanner;
/*
 1단계 
 Bus
 	속성: 버스번호, Passenger
 	메서드:
 		@@@번 버스에 승객이 탑승하셨습니다.승객이 @@?원을 지불하셨습니다.
 Passenger
 	속성: pay
 	메서드:
 		승객이 @@@원을 지불하셨습니다.
 2단계
 	속성: 1단계에서 추가, 누적 승객수 와 금액
 	메서드:
 		추가: 현제 총 @@명이 탑승하였고,
 			 현제 총 @@@원 누적 수입금액이 있습니다.
  Passenger
 	속성: 추가 현재 금액 ??초기 가지고 있는 금액은 생성자를 통해서
 		 차를 탤때 마다 비용지불을 통해 금액 차감
 	매서드: 차감되어 금액 내용 표시
 	메서드:
  * */
class Bus{
	Passenger p = new Passenger();
	private int Busnum;
	int pay;
	int sumpay;
	int SumPass;
	int x;
	
	void setBus(int Busnum){
		this.Busnum=Busnum;
	}
	void setpay(int pay){
		this.pay=pay;
	}
	void getpay(){
		setpay(pay);
	}
	void setpass_sum(int SumPass){ //승객수
		this.SumPass=SumPass;
	}

	void print(){
		if(SumPass==0){
			System.out.println(Busnum+"번 버스에 승객이 탑승하였습니다. 승객이 "
								+pay+"원을 지불하였습니다.");
		}else{
			System.out.println("현재 총 "+SumPass+"명이 탑승하였고,\n 현재 총 "
								+sumpay+"원 누적 수입금액이 있습니다.");
		}
	}
}

class Passenger{
	int pay;
	int mymoney;
	void setPay(int pay){
		this.pay=pay;
	}
	void setmoney(int mymoney){
		this.mymoney=mymoney;
	}
	void print1(){
		System.out.println("승객이 "+pay+"원을 지불하였습니다.");
	}
	void print2(){
		System.out.println("승객이 "+pay+"원을 지불하였습니다.");
		System.out.println("사용 전 금액: "+mymoney);	
	}
}

class BIP{
	int SumPass;
	void setSumPass(int SumPass){
		this.SumPass=SumPass;
	}
	void print(){
		//System.out.println("현재 총 "+pay+"원을 지불하였습니다.");
	}
}
public class A03_Bus {
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		// TODO Auto-generated constructor stub
		Passenger p = new Passenger();
		Bus B = new Bus();
		System.out.println("-------------1단계-----------------");
		p.setPay(1200);
		B.setBus(300);
		B.setpay(p.pay);
		
		p.print1();
		B.print();
		
		System.out.println("-------------2단계-----------------");
		B.setpass_sum(3);
		p.setmoney(50000);
		p.print2();
		
}
}
