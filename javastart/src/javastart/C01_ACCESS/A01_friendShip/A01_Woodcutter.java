package javastart.C01_ACCESS.A01_friendShip;
// 패키지명,*: 해당 package에 소속된 하위클래스를 사용하겠습니다.
// 패키지는 계층구조의 내용이 아니기에, 계층구조의 하위패키지는 적용되지 않는다.
import javastart.C01_ACCESS.A01_friendShip.A03_angel;
import javastart.C01_ACCESS.A01_Hunter;


public class A01_Woodcutter{
	//나무꾼이 숨긴 사슴이 있는 곳
	//if(gel)
	void call(){
		A03_angel gel = new A03_angel();
		//if(gel.s ==0)
		//int aa = 5000;
		//A02가 같은 package에 있고,
		//class옆 접근 제어자가 public 가능
		//같은 package에 있는 패키지명에 대한 선언 생략
		javastart.C01_ACCESS.A01_friendShip.A02_deer de;
		A02_deer d;
		//다른 package에 있을 때는 패키지명까지 호출해야 한다.
		javastart.C01_ACCESS.A01_Hunter h1;
		//다른 package라도 접근 제어자가 public이고, 
		//import로 해당 클래스를 상위에 선언하면 package명을 생략이 가능하다.
		A01_Hunter h2 = null ;
		//기본 생성자도 접근제어자가 public이기에 가능하다.
		h2 = new A01_Hunter();
	
	}
		
	}
