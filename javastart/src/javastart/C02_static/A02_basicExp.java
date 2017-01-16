package javastart.C02_static;

class Account{
	private String name;
	private int deposit;
	private static int totDeposit;
	public Account(String name) {
		this.name = name;
	}
	public void save(){
		deposit+=10;
		System.out.println(name+"계좌에서 10만원 입금하였습니다. 계좌 입금액:"+deposit+"만원");
		totDeposit+=10;
		curTotDeposit();
	}
	private void curTotDeposit(){
		System.out.println("전체 계좌 입금액 "+totDeposit+"만원 입니다.");
	}
	
	
}

public class A02_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account c1 = new Account("홍길동");
		Account c2 = new Account("김길동");
		Account c3 = new Account("신길동");
		c1.save();
		c1.save();
		c2.save();
		c2.save();
		c3.save();
	}

}
