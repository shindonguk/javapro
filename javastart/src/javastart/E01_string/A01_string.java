package javastart.E01_string;

public class A01_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * string�� ��ü�̸� ���ڿ��� �Ҵ��� �� �ִ� ����� ������ �ִ�.
 */
		//���ڿ� ��ü�� �Ҵ��ϴ� ����
		String str = new String("hello");
		String str2 = new String("hello");
		
		//���ڿ��� �Ҵ��ϴ� ����(����ȭ)
		String str3 = "hihi";
		String str4 = "hihi";
		
		System.out.println("�� new string:"+(str==str2));
		System.out.println("�� new ���ڿ� �Ҵ�:"+(str3==str4));
		//�ݵ�� ���ڿ��� ���� ���� equals�� Ȱ���Ͽ��� �Ѵ�.
		System.out.println("�� new ���ڿ� �Ҵ�:"+(str.equals(str2)));
		System.out.println("�� new ���ڿ� �Ҵ�:"+(str3.equals(str4)));
	}

}