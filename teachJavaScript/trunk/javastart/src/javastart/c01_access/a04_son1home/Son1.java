package javastart.c01_access.a04_son1home;

import javastart.c01_access.a02_home.A01_WoodCutter;

public class Son1 extends A01_WoodCutter{

	public Son1() {
		// ����߱⿡ ��ü ���� �ʿ� X
//		System.out.println(privMn);
//		default�� ����� �Ǵ��� package������ ��
		// ���ȴ�.
//		System.out.println(savMn);
// 		protected �̻��� ����� ������, ������ �����ϴ�.
		System.out.println(inheritMn);		
		System.out.println(announce);		
//		�̸��� ��ӻ�� ���� Ư�� ��ü ȣ��..has a����
		A01_WoodCutter w = new A01_WoodCutter();
//		System.out.println(w.privMn);
//		System.out.println(w.savMn);
		// �ٸ� package�� �ִ� ��ü�� ȣ���� �Ͱ� ���� ȿ��..
//		System.out.println(w.inheritMn);		
		System.out.println(w.announce);		
	}

}
