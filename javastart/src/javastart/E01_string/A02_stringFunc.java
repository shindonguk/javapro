package javastart.E01_string;

public class A02_stringFunc {
	public static void main(String[] args) {
		String greet = "�ȳ��ϼ��� �� ����.!!";
		String greetEn = "hello!!!";
		// ���ڿ� ����: concat("������ ����")
		System.out.println(greet.concat("Nice guy!!"));
		// ���ڿ� ġȯ(�ٲ�ó��) replace('��������','�ٲܹ���')
		System.out.println(greet.replace('!','@'));
		// �κ� ���� substring(index, ����) �ش� index����, ����
		// ���� ���ڿ� ����
		System.out.println(greet.substring(0,2));
		System.out.println(greet.toUpperCase());
		System.out.println(greet.toLowerCase());
		// endwith: �ش� ���ڿ��� �������� ���� ó��
		System.out.println(greetEn.endsWith("!!!"));
		// charAt(index): Ư�� index�� ���� ����
		System.out.println(greet.charAt(3));
		// length(): ���ڿ��� ũ�� ps) �迭�� ũ�� length
		System.out.println(greet.length());
		System.out.println(greet.indexOf('��'));
		// trim() �¿� ��������
		System.out.println(greet.trim());

	/*
	 * �ֹ� ��ȣ�� ����, ������ϰ� ���� ������ ó���ϼ���.
	 */
		
		 String mybrith = "910918-10@@@@@";
		 System.out.print("19"+mybrith.substring(0,2)+"�� "+mybrith.substring(2,4)+"�� "+mybrith.substring(4,6)+"�ϻ� ");
		 //String gender = mybrith.charAt(7)=="1"?"����":"����";
		 String gender = mybrith.substring(7,8).equals("1")?"����":"����";
		 System.out.println(gender);
	}
}