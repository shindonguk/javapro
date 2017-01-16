package javastart.c01_access.a01_friendShip;
// 패키명.* :해당package에 소속된 하위클래스를 사용하겠습니다.
// 패키지는 계층구조의 내용이 아니기에, 계층구조의 하위패키지는 적용되지 않는다.
import javastart.c01_access.*;


// javastart.c01_access.
public class A01_WoodCutter {
	
	// 나뭇꾼이 숨긴 사슴이 있는 곳..
	String cacheDeer="덤불사이";
	// 날개옷을 숨긴 곳
	private String cacheClothe="뒷동산 바위밑";
	
	
	
	
	void call(){
		// A02_Deer가 같은 package에 있고,
		// class옆 접근 제어자가 public 가능..
		// 같은 package에 있는 패키지명에 대한 선언 생략..
		javastart.c01_access.a01_friendShip.A02_Deer d2;
		A02_Deer d;
		d = new A02_Deer();
		// 다른 package에 있을 때는 패키지명까지 호출해야 한다.
		javastart.c01_access.A01_Hunter h;
		// 다른 package라도 접근제어자가 public이고,
		// import로 해당 클래스를 상위에 선언하면 package명을 생략이가능하다.
		A01_Hunter h2 = null;
		// 기본 생성자도 접근제어자가 public이기에 가능하다. 
		h2=new A01_Hunter();
		
	}
}
