package javastart.a01_hello;

public class A05_inputExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		�Է°��� args�� �޾Ƽ�..
		���� 3���� �޾Ƽ�  ������ ���� ������� ó���Ѵ�.
		args  �������  �ٳ�������  ���ⰹ��

		������ ����
		��� : @@@
		�ٳ��� : @@@
		���� : @@@
		�Ѱ��� : @@@
		
		[5,7,13] ==> args[0]:5, args[1]:7, args[2]:13
		 * */
		int appleCnt=Integer.parseInt(args[0]);
		int bananaCnt=Integer.parseInt(args[1]);
		int strawCnt=Integer.parseInt(args[2]);
		int tot=appleCnt+bananaCnt+strawCnt;
		// ctrl+s :���� ����Ű..
		System.out.println("������ ����");
		System.out.println("��� : "+appleCnt);
		System.out.println("�ٳ��� : "+bananaCnt);
		System.out.println("���� : "+strawCnt);
		System.out.println("�Ѱ��� : "+tot);
		
		
		
	}

}
