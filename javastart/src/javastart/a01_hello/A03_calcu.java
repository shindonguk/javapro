package javastart.a01_hello;

public class A03_calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.  �������� ��Ģ���� ó��
		 * 		�������� �Ҵ��� �����͸� Ư���� �䱸�� ���� ��Ģ���� ó���� �� �� �ִ�.
		 * 		ex) int sum = num01 + num02;
		 * 		�Է°� 1 	: ???
		 * 		�Է°� 2 	: ???
		 * 		����			: ???
		 * 		����		    : ???
		 * 		����		    : ???
		 * 		������		: ???
		 * 2. ���ڿ� addó��
		 */
		int num01 = 25;
		int num02 = 35;
		int sum = num01 + num02;
		int mun =  num01 - num02;
		int mul = num01 * num02;
		double div =  (double)num01 / num02;
		double no3 = 15.0;
		int msn = (int)no3; // ���� type���� casting �մϴ�.
		// ����/���� => ���� ���� �Ǽ��Ҵ� �ϱ� ������ ���� .0 ���� ��
		// �� �������� ��, �ϳ��̻��� �Ǽ��̾�� �Ǽ����� ���������� ó����
		System.out.println("�Է°� 1 	:	"+num01+"");
		System.out.println(" �Է°� 2 	: 	"+num02+"");
		System.out.println(" ����			: 	"+sum+"");
		System.out.println(" ����		    : 	"+mun+"");
		System.out.println(" ����		    : 	"+mul+"");
		System.out.println(" ������	    :   "+div+"");
		//���ڿ� add ó��
		System.out.println("�ȳ�"+"��");
		String addname = "ȫ";
		addname = addname+"�浿";
		// ���ڿ��� + ��ȣ�� ���ؼ� ���ڿ��� ���ڿ��� �̾��ش�.
		// +��ȣ�� ���ؼ� ���ڿ��� �̾��ִ� ������ ����.
		// ��Ģ���� ó���� ���� �ʴ´�.
		
	}

}
