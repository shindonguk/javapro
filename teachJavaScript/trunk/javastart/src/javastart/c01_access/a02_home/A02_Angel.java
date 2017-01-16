package javastart.c01_access.a02_home;

public class A02_Angel {
	A02_Angel(){
		A01_WoodCutter w = new A01_WoodCutter();
		// private 외에 접근이 가능..
//		System.out.println(w.privMn);
		System.out.println(w.savMn);
		System.out.println(w.inheritMn);		
		System.out.println(w.announce);
		
	}
}
