package javastart.C01_ACCESS.A02_home;

class private1{
	
	private private1(){
		A01_WoodCutter w = new A01_WoodCutter();
		int cash = 0;
		cash += w.aa;
		System.out.println("������ ���ڱ�: "+cash);
	}

}
public class A01_WoodCutter {
		
	
		int aa = 5000;
}
