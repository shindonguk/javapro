package javastart.e01_string;

public class A01_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
String�� ��ü�̸� ���ڿ��� �Ҵ��� �� �ִ� ����� ������ �ִ�.
 * */
		// ���ڿ� ��ü�� �Ҵ��ϴ� ����..
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		// ���ڿ��� �Ҵ��ϴ� ����(����ȭ)
		String str3="Hello";
		String str4="Hello";
		
		
		System.out.println("�� new String:"+(str == str2));
		System.out.println("�� ���ڿ��Ҵ�"+(str3 == str4));
		// �ݵ�� ���ڿ��� ���� ���� equals�� Ȱ���Ͽ��� �Ѵ�.
		System.out.println("��(equals) new String:"+(str.equals(str2)) );
		System.out.println("��(equals) ���ڿ��Ҵ�:"+(str3.equals(str4)));
		
		
		
		
	}

}
