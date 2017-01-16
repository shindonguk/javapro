package javastart.c01_access.a01_friendShip;
// javastart.c01_access.a01_friendShip.A02_Deer
public class A02_Deer {
	//
	A02_Deer(){
		A01_WoodCutter d = new A01_WoodCutter();
		// cacheDeer가 default접근제어자이기 때문에 호출이 가능..
		System.out.println(d.cacheDeer);
		// 같은 package라도 접근제어자가 private인 경우에는
		// 다른 어떤 클래스도 접근이 불가능하다..
		// 일반적으로 class명 하위에 선언한 전역변수는 접근제어자가
		// private 이다.
		// System.out.println(d.cacheClothe);
		
		
	}
}
