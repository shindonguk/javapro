package javastart.b01_object;

// Person�̶�� Ʋ�� �����.
class Person{
	String name;
	int age; //����..
	
}
// ex) Product ���Ǹ� �����͸� ������ �Ŀ� main���� ȣ���ϼ���.
class Product{
	String pname;
	int pcnt;//������ ����
	int pprice;//������ �ܰ�
	int sum; //������ ��(����*�ܰ�)
}
/*
 * ���� 3���� �����͸� �Ҵ��ϰ�,
 * �Ʒ� �������� ����ϼ���.
 *    ����� ����Ʈ
 NO  ���Ǹ�  �ܰ�  ����  ��
 1   @@@@    3000    2   6000
 2   @@@     4000    3  12000
 3   @@@@    5000    1   5000
 * */
public class A01_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������� Ʋ���� Person ���� �޸𸮿� �ø��� ó��..	
		Person p1 = new Person();
		p1.name="ȫ�浿";
		p1.age=20;
		Person p2 = new Person();
		p2.name="��浿";
		p2.age=27;
		System.out.println("�̸�1"+p1.name+":"+p1.age+"��");
		System.out.println("�̸�2"+p2.name+":"+p2.age+"��");
		Product prod1 = new Product();
		prod1.pname="���";
		Product prod2 = new Product();
		prod2.pname="�ٳ���";
		System.out.println("����1:"+prod1.pname);
		System.out.println("����2:"+prod2.pname);
	}

}
