package javastart.a02_operator;

public class A07_tripOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 3�׿�����: ����ó���� ������� �Ѷ��ο��� true, false���� ���� 
			 * �ٷ� ó���ϰ��� �� ��, ���̴� ������
			 * 
			 *  (����/��������)? true �϶� ó�������: false�϶� ó�������
			 *  ex) pt >=? "�հ�", "���հ�";
			 *  ���� �Ҵ絵 �����ϴ�
			 *  	string isPass = pt >=70? "�հ�": "���հ�";
			 */
				
			/*
			 * Ȯ�ο���
			 * 3�׿����ڸ� Ȱ���Ͽ�,
			 * ���� �򰡸� �ϼ���.
			 * ������ �Է¹޾� �Ʒ��� ���� ���ǿ��� ����� ����ϼ���.
			 * 90�̻� A, 80~89 B, 70~79 C, 60~69 D, 60�̸� F
			 * 	=======
			 *  ȹ������
			 *  �������
			 */
		
		int point = 70;
		String dis = (point > 90)? "A":
					 (point>=80 && point<90)? "B":
				     (point>=70 && point<80)? "C":
				     (point>=60 && point<70)? "D":"F";	 
		System.out.println("ȹ������:\t"+point+"\n�������:\t"+dis);
	}

}
