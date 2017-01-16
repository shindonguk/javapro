package javastart.C01_ACCESS.A02_home;

class private1{
	
	private private1(){
		A01_WoodCutter w = new A01_WoodCutter();
		int cash = 0;
		cash += w.aa;
		System.out.println("나무꾼 비자금: "+cash);
	}

}
public class A01_WoodCutter {
		
	
		int aa = 5000;
}
