package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��������: �񱳿�����(!=, ==)�� ������� 2���̻� �����Ͽ� ����ó���� ��, ����Ѵ�.
		 * &&(and): �ΰ��� ������ �� ������ų ��
		 * ||(or): �ΰ��� ������ 1���� ������ų ��
		 * !(not): ������ �ݴ� ó��
		 * 
		 * ���ɿ� ���� �������� �����ϰ��� �Ѵ�.
		 * 8~18: �������� 20%�� �ϸ�
		 * 4�̸�, 65�̻�: ������ 100%(����)�� �ϴ� ó���� �� �����ڸ� ���Ͽ� ó���Ͽ���.
		 */
		
		int age=3; // arg���� �Է� ����
		boolean dis20 = (age>=8 && age<=18);
		System.out.println("������ 20%�����(8~18)?"+dis20);
		//8�� �̻��̰�, 18�� ������ �� 20%������ ���� ����
		boolean disNopay = (age< 4 || age>=65);
		System.out.println("������ 100%�����?"+disNopay);
		//4�� �̸��̰�, 65�� �̻��� �� 100%������ ���� ����
		
		
		/*
		 * Ȯ�ο���
		 * �ش������ ��������� 70�� �̻��̰�, �������� 40�� �̸� ������ ���� ��
		 * �հ�ó���� �Ѵٰ� �Ѵ�. �̻� �ش��ϴ� ���α׷��� �Ʒ��� �������� ����Ͻÿ�.
		 * 
		 * ��������
		 * ����: ??
		 * ����: ??
		 * ����: ??
		 * ���: ??
		 * �հ� ����: ??
		 */
		

		int kor=50;
		int eng=90;
		int mat=90;
		int avr = (kor+eng+mat)/3;
		boolean okcheck = (avr>=70 && kor>40 && mat>40 && eng>40);
		System.out.println("��������:\t"+kor);
		System.out.println("��������:\t"+eng);
		System.out.println("��������:\t"+mat);
		System.out.println("�������:\t"+avr);
		System.out.println("�հݿ���:\t"+okcheck);

		
		
	}

}
