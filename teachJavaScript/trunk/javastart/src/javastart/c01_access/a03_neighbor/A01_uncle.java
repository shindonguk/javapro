package javastart.c01_access.a03_neighbor;

import javastart.c01_access.a02_home.A01_WoodCutter;

public class A01_uncle {
	A01_uncle(){
		A01_WoodCutter w = new A01_WoodCutter();
		// private �ܿ� ���� �ȵ�..
		// System.out.println(w.privMn);
		// default�� ���� �ȵ�. ���� package�� �ƴϱ⿡..
		// System.out.println(w.savMn);
		// �ٸ� package�̸� ��Ӱ��谡 ���⿡ ���� �Ұ�..
		//System.out.println(w.inheritMn);		
		System.out.println(w.announce);		
	}
}
