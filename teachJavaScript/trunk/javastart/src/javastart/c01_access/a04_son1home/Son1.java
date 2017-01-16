package javastart.c01_access.a04_son1home;

import javastart.c01_access.a02_home.A01_WoodCutter;

public class Son1 extends A01_WoodCutter{

	public Son1() {
		// 상속했기에 객체 생성 필요 X
//		System.out.println(privMn);
//		default는 상속이 되더라도 package내에서 마
		// 사용된다.
//		System.out.println(savMn);
// 		protected 이상은 상속을 했을때, 접근이 가능하다.
		System.out.println(inheritMn);		
		System.out.println(announce);		
//		이말은 상속상관 없이 특정 객체 호출..has a관계
		A01_WoodCutter w = new A01_WoodCutter();
//		System.out.println(w.privMn);
//		System.out.println(w.savMn);
		// 다른 package에 있는 객체를 호출한 것과 같은 효과..
//		System.out.println(w.inheritMn);		
		System.out.println(w.announce);		
	}

}
