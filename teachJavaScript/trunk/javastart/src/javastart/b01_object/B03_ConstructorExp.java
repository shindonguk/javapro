package javastart.b01_object;

class CoffeeShop2{
	String menu;
	int cnt;
	int price;
	int tot;
	int discnt;
	CoffeeShop2(){
		menu="�Ƹ޸�ī��";
		cnt=1;
		System.out.println("�������~~");

	}
	CoffeeShop2(String menu){
		this();// Ŭ������� ���� ������ ��, �Է°��� ���� ������ ȣ��.
		this.menu=menu;
	}	
	CoffeeShop2(String menu, int cnt){
		this(menu);// Ŭ������� ���� ������ ��, �Է°��� �ϳ� �ִ� ������ ȣ��.
		this.cnt=cnt;
	}
	int calcu(){
		if(menu.equals("�Ƹ޸�ī��")){
			price=3000;
		}else if(menu.equals("īǪġ��")){
			price=4000;
		}else if(menu.equals("��")){
			price=4500;
		}
			
		tot=price*cnt;
		return tot;
	}
	void dis10(){
		calcu();
		tot=tot-(int)(tot*0.1);
		discnt=10;
		prn();
		
	}
	void dis20(){
		calcu();
		tot=tot-(int)(tot*0.2);
		discnt=20;
		prn();
	}
	void dis30(){
		calcu();
		discnt=30;
		tot=tot-(int)(tot*0.3);
		prn();
	}
	void prn(){
		System.out.println(menu+", "+price+", "+ cnt+"��" + " ���� "+discnt+"% ���ݾ�:"+tot+"��"); 
				
	}
}
public class B03_ConstructorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeShop2 c1 = new CoffeeShop2();
		c1.dis10();
		CoffeeShop2 c2 = new CoffeeShop2("īǪġ��");
		c2.dis20();
		CoffeeShop2 c3 = new CoffeeShop2("��",3);
		c3.dis30();		
	}

}
