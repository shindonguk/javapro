package javastart.B01_object;

class woman1{
	String name;
	int age;
}

class man1{
	String name;
	//��ü�ȿ� ��ü ����, �޸𸮸� ����
	woman1 woman;
	int age;
}
class baby1{
	String name;
	String birt;
}

class mom1{
	String name;
	String birt;
	baby1 baby;
}


public class C01_ObVsObBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		woman1 w01 = new woman1();
		w01.name="������";
		w01.age=27;
		man1 m01 = new man1();
		m01.name="�ŵ���";
		//������ ��ü �ȿ� �ִ� woman1 ��ü��
		//������ ���� ��ü�� �Ҵ�
		m01.woman=w01;
		w01.name="jungunzi";
		System.out.println(m01.woman.name);		
		
		System.out.println("--------------------����--------------------------");
		
		mom1 m = new mom1();
		baby1 b = new baby1();
		m.name="����";
		m.birt="1990/2/2";
		b.name="��ŸŸ";
		b.birt="2000/1/2";
		m.baby=b;
		System.out.println("�Ʊ���� �̸�: "+m.name+"\t ���� �Ʊ��� ����: "+ (m.baby.birt));
/*
 * Ȯ�ο���
 * Baby �Ӽ���: �̸�, ����
 * Mother �Ӽ���: Baby, �̸�
 * �Ʊ��̸�:
 * ����
 * 
 * �Ʊ���� �̸�
 * ������ �Ʊ� ����
 */
	}

}
