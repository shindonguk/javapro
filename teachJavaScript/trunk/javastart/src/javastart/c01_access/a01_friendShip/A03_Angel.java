package javastart.c01_access.a01_friendShip;

public class A03_Angel {
	public A03_Angel(){
		A01_WoodCutter w = new A01_WoodCutter();
		System.out.println(w.cacheDeer);
		// 접근제어가 불가능하기에 에러발생..
	//	System.out.println(w.cacheClothe);
	}
}
