package javastart.a01_hello;

public class A04_inputdata {
																//�ܺ� �����͸� �ޱ� ����, �����ϱ� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num01 = args[0];
		String num02 = args[1];
		System.out.println(num01+"+"+num02);
		System.out.println("��:"+num01+num02);
		// Integer.parseInt: �������¹��ڿ��� ���ڷ� ��ȯ
		int num01Int = Integer.parseInt(num01);
		int num02Int = Integer.parseInt(num02);
		int sum = num01Int + num02Int;
		System.out.println("��:" +sum);
		
		/*
		 * �Է°��� args�� �޾Ƽ� ���� 3���� �޾Ƽ� ������ ���� ������� ó���Ѵ�.
		 * args 	��� ����		�ٳ�������	  ���ⰹ��
		 * 
		 * ������ ����:
		 * ���: 
		 * �ٳ���:
		 * ����:
		 * �Ѱ���:
		 */
		String apple = args[0];
		String banana= args[1];
		String strawberry = args[2];
		// Integer.parseInt: �������¹��ڿ��� ���ڷ� ��ȯ
		int appleInt = Integer.parseInt(apple);
		int bananaInt = Integer.parseInt(banana);
		int strawberryInt = Integer.parseInt(strawberry);
		int allsum = appleInt + bananaInt + strawberryInt;
		//�� �Լ� ���ٿ� ����
		//int appleInt = Integer.parseInt(args[0]);
		//int banana = Integer.parseInt(args[1);
		//int strawberry = Integer.parseInt(args[2]);
		
		
		System.out.println("����: " +apple);
		System.out.println("�ٳ���: " +banana);
		System.out.println("����: " +strawberry);
		System.out.println("�Ѱ���: " +allsum);
	}

}
