package javastart.c01_access.a03_neighbor;

import javastart.c01_access.a02_home.A01_WoodCutter;

public class A01_uncle {
	A01_uncle(){
		A01_WoodCutter w = new A01_WoodCutter();
		// private 외에 접근 안됨..
		// System.out.println(w.privMn);
		// default도 접근 안됨. 같은 package가 아니기에..
		// System.out.println(w.savMn);
		// 다른 package이면 상속관계가 없기에 접근 불가..
		//System.out.println(w.inheritMn);		
		System.out.println(w.announce);		
	}
}
