package javastart.c02_static;

class Account2{
	private String name;
	private int deposit;
	private static int totDeposit;
	public Account2(String name, int deposit) {
		this.name = name;
		this.deposit=deposit;
		totDeposit+=deposit;
		System.out.println(name+" 계좌 초기 금액 "+deposit+" 만원");
		curTotDeposit();
	}
	public void save(int deposit){
		this.deposit+=deposit;
		System.out.println(name+"계좌에서 "+deposit+"만원 입금하였습니다. 계좌 입금액:"+this.deposit+"만원");
		totDeposit+=deposit;
		curTotDeposit();
	}
	public void withdraw(int withdrawMn){
		deposit-=withdrawMn;
		System.out.println(name+"계좌에서 "+withdrawMn+"만원 출금하였습니다. 계좌 입금액:"+deposit+"만원");
		totDeposit-=withdrawMn;
		curTotDeposit();
	}	
	private void curTotDeposit(){
		System.out.println("전체 계좌 입금액 "+totDeposit+"원 입니다.");
	}
	
	
}

public class A03_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 []accounts = {
				new Account2("홍길동",300),
				new Account2("김길동",1000),
				new Account2("신길동",2000),		
		};
		for(Account2 account:accounts){
			account.save((int)(Math.random()*100+1));
			account.withdraw((int)(Math.random()*10+1));
		}
		
		
	}

}
