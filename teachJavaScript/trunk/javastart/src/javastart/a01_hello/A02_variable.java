package javastart.a01_hello;

public class A02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
���� : Ư���� �����Ϳ� ���� ������� �ٸ��� ó���� ��,
     ����ϴ� ����������..
     ũ�� ���ڿ��� �����ϴ� ������ : String, char : ��������
       ���ڸ� �����ϴ� ������ : int, double
 * */
/*
���α׷� ����..
�Է��� �̸��� ���̸� �Ʒ� �������� ����ϼ���..
==========
�̸� : @@@@
���� : @@@@
==========
 * 
 * */		
// ������ type���� �� ������ �̸��� ���ϸ�,
// Ư��data�� �Ҵ��Ѵ�.
// type�� �����Ǹ� �Ҵ��� �� �ִ� �����͸� �־�� �ȴ�.
// ������ ������ �����ϰ�, ��Ȱ���� �� �� �ִ�.		
		String name="ȫ�浿";
		int age=24;

		
		System.out.println("==========");
		System.out.println("�̸� : "+name+"");
		System.out.println("���� : "+age);
		System.out.println("==========");
		name="�ű浿";
		System.out.println("�̸� : "+name+"");
/*
Ȯ�ο���..
������ Ȱ���Ͽ�, 
��� ��, �̸�, ���������� �Ʒ� �������� ����ϼ���..

------------
���� ��� ���� @@@@@ �̸�,
�̸��� @@@ �Դϴ�.
�����з� ���������� @@@ �⵵ �Դϴ�.
------------  
 * */
		String address="���� ����";
		// ������ �̸��� ������ ���� ���α׷� ������ �������� ���Ѵ�.
		// String name ==> String name01
		String name01="���浿";
		int graYear=2016;
		System.out.println("------------");
		System.out.println("���� ��� ���� "+address+" �̸�,");
		System.out.println("�̸��� "+name01+" �Դϴ�.");
		System.out.println("�����з� ���������� "+graYear+" �⵵ �Դϴ�.");
		System.out.println("------------");		
	}

}
