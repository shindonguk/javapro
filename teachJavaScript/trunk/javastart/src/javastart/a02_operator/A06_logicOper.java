package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
�� ������ : �񱳿�����(!=,==..)�� ������� 2���̻� �����Ͽ�
 ����ó���� ��, ����Ѵ�.
 &&(and) : �ΰ��� ������ �� ������ų ��
 ||(or) : �ΰ��� ���� ��, �ϳ��� ������ų ��
  !(not) : ������ �ݴ� ó��. false --> true, true --> false

 ���ɿ� ���� �������� �����ϰ��� �Ѵ�.
 8~18 : �������� 20%�� �ϸ�
 4�̸�, 65�̻��� : ������ 100%(����)�� �ϴ� ó���� �� �����ڸ� 
 ���Ͽ� ó���Ͽ���.
 * */
		int age=3; // args���� �Է� ����..
		
		boolean dis20=( age >= 8 && age <= 18 );
		// 8�� �̻��̰�, 18�� ������ �� 20%������ ���� ���� 
		System.out.println("������ 20%�����(8~18)?"+dis20);
		boolean disNopay=( age < 4 || age >= 65);
		// 4�� �̸��̰ų�, 65�� �̻��� ��, 100%������ ���� ����
		System.out.println("���� �����"+disNopay);
/*
Ȯ�� ����..
�ش������ ��������� 70�� �̻��̰�, �������� 40�� �̸� ������ ���� ��,
�հ�ó���� �Ѵٰ� �Ѵ�. �̻� �ش��ϴ� ���α׷��� �Ʒ��� �������� ����ϼ���.
���..
���� ����
���� : @@@
���� : @@
���� : @@
��� : @@
�հ� ���� : @@

 * */		
		int korPt=39;
		int engPt=88;
		int matPt=100;
		int avg=(korPt+engPt+matPt)/3;
		boolean ckMin= korPt<40 || engPt<40 || matPt <40;
		// ckMin2 = korPt>=40 && engPt>=40 && matPt>=40; 
		boolean chAvg = avg>=70;
		System.out.println("���� ����");
		System.out.println("���� : "+korPt);
		System.out.println("���� : "+engPt);
		System.out.println("���� : "+matPt);
		System.out.println("��� : "+avg);
		System.out.println("�հ� ���� : "+ ( !(ckMin) && chAvg ) );
	}

}
