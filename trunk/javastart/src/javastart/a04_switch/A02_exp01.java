package javastart.a04_switch;

public class A02_exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1�ܰ�
switch case���� break ���� Ȯ�ο���..
���� �Է��ϰ�,
�ش� ���� ������ ��¥�� switch case���� Ȱ���Ͽ� ����ϼ���.	
=== �������
�Էµ� �� : @@@
�ش� ���� ��������¥ : ###

2�ܰ�
������ �Է� : @@@
���� ���̿� �츦 ���
���� ���̴� ## �̸�, ��� ### �Դϴ�. �����ι�������̽�������.
 * */
		int inMon=5;
		int days=0;
		switch(inMon){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: days=31; break;
			case 2: days=28; break;
			case 4:
			case 6:
			case 9:
			case 11:days=30; break;
			default : System.out.println("�Է¹���(1~12) �� �Դϴ�.");
		}
		int birthyear=1994; // 30
		int age=2016-birthyear+1; // �ѱ�����
		System.out.println("����:"+age);
		String orgAnim="";
		switch(age%12){  // �����ι������̽�������
			case 1: orgAnim="������(��)"; break;
			case 2: orgAnim="��(��)"; break;
			case 3: orgAnim="��(��)"; break;
			case 4: orgAnim="��(��)"; break;
			case 5: orgAnim="��(��)"; break;
			case 6: orgAnim="�䳢(��)"; break;
			case 7: orgAnim="ȣ����(��)"; break;
			case 8: orgAnim="��(��)"; break;
			case 9: orgAnim="��(��)"; break;
			case 10: orgAnim="����(��)"; break;
			case 11: orgAnim="��(��)"; break;
			case 0: orgAnim="��(��)"; break;
		}
		System.out.println(orgAnim);
		
		
	}

}
