package javastart.c01_access.a01_friendShip;
// javastart.c01_access.a01_friendShip.A02_Deer
public class A02_Deer {
	//
	A02_Deer(){
		A01_WoodCutter d = new A01_WoodCutter();
		// cacheDeer�� default�����������̱� ������ ȣ���� ����..
		System.out.println(d.cacheDeer);
		// ���� package�� ���������ڰ� private�� ��쿡��
		// �ٸ� � Ŭ������ ������ �Ұ����ϴ�..
		// �Ϲ������� class�� ������ ������ ���������� ���������ڰ�
		// private �̴�.
		// System.out.println(d.cacheClothe);
		
		
	}
}
