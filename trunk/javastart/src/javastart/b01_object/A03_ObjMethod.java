package javastart.b01_object;

class Man{
	String name;
	int age;
	void printAll(){
		System.out.print("�̸��� "+name);
		System.out.println(", ���̴� "+age+"��!! ");
	}
}
/*
1�ܰ�..
Hope  //���� ���..��ü class
 ����
   ���ڿ�(String) hope01 // ù��° ���
   ���ڿ�(String) hope02 // �ι�° ���
   ���ڿ�(String) hope03 // ����° ���
   ����(int) newYear     //  ���س⵵
   ���ڿ�(String) orgRnd //  ���ض�?
   
�޼���showMyHope()  
	@@@ �⵵ @@@ �� ���ؿ� ���� �������
	1. @@@@
	2. @@@@
	3. @@@@
 * 
 * */
class Hope{
	String hope01;
	String hope02;
	String hope03;
	int newYear;
	String orgRnd;
	void showMyHope(){
		System.out.println(newYear+" �⵵ "+orgRnd+" �� ���ؿ� ���� �������");
		System.out.println("1. "+hope01);
		System.out.println("2. "+hope02);
		System.out.println("3. "+hope03);
	}
	
}

public class A03_ObjMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man();
		m1.name="�̰��";
		m1.age=52;
		m1.printAll();
		Hope p1 = new Hope();
		p1.hope01="���";
		p1.hope02="����";
		p1.hope03="��ǥ";
		p1.newYear=2017;
		p1.orgRnd="��";
		p1.showMyHope();
		
	}

}
