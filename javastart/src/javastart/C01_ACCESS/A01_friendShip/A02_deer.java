package javastart.C01_ACCESS.A01_friendShip;

public class A02_deer {
	//같은 패키지에서는 default여도 접근이 가능하다.
	A02_deer() { 
		A01_Woodcutter d = new A01_Woodcutter();
		//cachedeer가 default접근제어자이기 때문에 호출이 가능
		System.out.println();
		//같은 패키지라도 접근제어자가 private인 경우에는
		//일반적으로 class명 하위에 선언한 전역변수는 접근제어자가
		//private이다.
		//System.out.println(d.cacheClothe);
		// TODO Auto-generated constructor stub
	}
}
