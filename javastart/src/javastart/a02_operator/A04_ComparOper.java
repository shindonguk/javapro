package javastart.a02_operator;

public class A04_ComparOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �񱳿�����:  ������ ���� �ش� ���μ����� �б��� �� ���δ� �����ڸ� ���Ѵ�.
		 * ����: ==, >, <, <=, >=, !=, ( <> )
		 */ 
		//�ٳ����� ������ ������ ������ ���� ��,  true���� ����ϼ���.
		
		
		int bananaCnt = 5;
		int strawCnt = 5;
		System.out.println("�ٳ����� ���� ������ ������?"+(bananaCnt == strawCnt) );
		//boolean ��: �񱳿����ڳ� Ư�� ������ ������ Ȱ���Ͽ� ����ϰ��� �� �� ���̴� data type
		//�ʱⰪ: false
				boolean isEqual = false;
				isEqual=bananaCnt!=strawCnt;
				System.out.println("���� ����?"+isEqual );
				
	}

}
