package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
��������� : +, -, *, /, %
 %:������ ������ : �ش� �������� ���� ������ ������ �κ� ó��
 * */
		//System.out.println("20%7="+(20%7));
/*
��� 50���� 3���� ������ �ֱ�� �߽��ϴ�.
1��� ��� ������ �ְ�, ������ @@���� ���� ���� ���α׷��ҷ��� �Ѵ�.
�� ��, ���� ������ �Ѱ��� ������ ��� �� ��� ���� args�� �޾Ƽ�
���������� ó���ϴ� ���α׷��� ����ٸ�..
 
���� ���� : @@@
���� ���� : @@
�������� �ο� : @@@
1��� ������ �� ���� ���� : @@@ 
������ ���� :@@@ 
 * */	
		String fruitKind=args[0];
		int fruitCnt=Integer.parseInt(args[1]);
		int personCnt=Integer.parseInt(args[2]);
		int cntPerPerson=fruitCnt/personCnt;
		int cntMod=fruitCnt%personCnt;
		// sysout+ctrl+space : ����Ű�� �ܿ������ Ǯ �ڵ� �ϱ�
		System.out.println("���� ���� : "+fruitKind);
		System.out.println("���� ���� : "+fruitCnt);
		System.out.println("�������� �ο� : "+personCnt);
		System.out.println("1��� ������ �� ���� ���� : "+cntPerPerson);
		System.out.println("������ ���� : "+cntMod);
/*
 * 
�Ʒ������� ������ args������ �޾Ƽ� ó���ϼ���.
@@@:args������ �޾Ƽ�ó��
###:����ó���ؼ� ��Ÿ���� �κ�..

          �������� ���α׷�..
  	                   �� : @@@@ ex) 3-4��, ������а�
NO �̸�  ����  ����  ����  ����  ���(�Ǽ�)     	        
## @@@ @@  @@  @@  ##  ###
## @@@ @@  @@  @@  ##  ###
 * */		
	}

}
