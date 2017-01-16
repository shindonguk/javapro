package javastart.C02_static;

class Account2{
	private String name;
	private int deposit;
	private static int totDeposit;
	public Account2(String name, int deposit) {
		this.name = name;
		this.deposit=deposit;
		totDeposit+=deposit;
		System.out.println(name+" ���� �ʱ� �ݾ� "+deposit+" ����");
		curTotDeposit();
	}
	public void save(int deposit){
		this.deposit+=deposit;
		System.out.println(name+"���¿��� "+deposit+"���� �Ա��Ͽ����ϴ�. ���� �Աݾ�:"+this.deposit+"����");
		totDeposit+=deposit;
		curTotDeposit();
	}
	public void withdraw(int withdrawMn){
		deposit-=withdrawMn;
		System.out.println(name+"���¿��� "+withdrawMn+"���� ����Ͽ����ϴ�. ���� �Աݾ�:"+deposit+"����");
		totDeposit-=withdrawMn;
		curTotDeposit();
	}	
	private void curTotDeposit(){
		System.out.println("��ü ���� �Աݾ� "+totDeposit+"�� �Դϴ�.");
	}
	
	
}

public class A03_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 []accounts = {
				new Account2("ȫ�浿",300),
				new Account2("��浿",1000),
				new Account2("�ű浿",2000),		
		};
		for(Account2 account:accounts){
			account.save((int)(Math.random()*100+1));
			account.withdraw((int)(Math.random()*10+1));
		}
		
		
	}

}
