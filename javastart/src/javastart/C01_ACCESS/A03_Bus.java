package javastart.C01_ACCESS;
import java.util.Scanner;
/*
 1�ܰ� 
 Bus
 	�Ӽ�: ������ȣ, Passenger
 	�޼���:
 		@@@�� ������ �°��� ž���ϼ̽��ϴ�.�°��� @@?���� �����ϼ̽��ϴ�.
 Passenger
 	�Ӽ�: pay
 	�޼���:
 		�°��� @@@���� �����ϼ̽��ϴ�.
 2�ܰ�
 	�Ӽ�: 1�ܰ迡�� �߰�, ���� �°��� �� �ݾ�
 	�޼���:
 		�߰�: ���� �� @@���� ž���Ͽ���,
 			 ���� �� @@@�� ���� ���Աݾ��� �ֽ��ϴ�.
  Passenger
 	�Ӽ�: �߰� ���� �ݾ� ??�ʱ� ������ �ִ� �ݾ��� �����ڸ� ���ؼ�
 		 ���� �Ŷ� ���� ��������� ���� �ݾ� ����
 	�ż���: �����Ǿ� �ݾ� ���� ǥ��
 	�޼���:
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
	void setpass_sum(int SumPass){ //�°���
		this.SumPass=SumPass;
	}

	void print(){
		if(SumPass==0){
			System.out.println(Busnum+"�� ������ �°��� ž���Ͽ����ϴ�. �°��� "
								+pay+"���� �����Ͽ����ϴ�.");
		}else{
			System.out.println("���� �� "+SumPass+"���� ž���Ͽ���,\n ���� �� "
								+sumpay+"�� ���� ���Աݾ��� �ֽ��ϴ�.");
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
		System.out.println("�°��� "+pay+"���� �����Ͽ����ϴ�.");
	}
	void print2(){
		System.out.println("�°��� "+pay+"���� �����Ͽ����ϴ�.");
		System.out.println("��� �� �ݾ�: "+mymoney);	
	}
}

class BIP{
	int SumPass;
	void setSumPass(int SumPass){
		this.SumPass=SumPass;
	}
	void print(){
		//System.out.println("���� �� "+pay+"���� �����Ͽ����ϴ�.");
	}
}
public class A03_Bus {
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		// TODO Auto-generated constructor stub
		Passenger p = new Passenger();
		Bus B = new Bus();
		System.out.println("-------------1�ܰ�-----------------");
		p.setPay(1200);
		B.setBus(300);
		B.setpay(p.pay);
		
		p.print1();
		B.print();
		
		System.out.println("-------------2�ܰ�-----------------");
		B.setpass_sum(3);
		p.setmoney(50000);
		p.print2();
		
}
}
