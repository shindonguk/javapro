package javastart.a02_operator;

public class A05_alloOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		* ���Կ�����: �����͸� �Ҵ��� ��, ���̴� �����ڸ� ���Ѵ�.
		 * �⺻ int  age = 24;
		 * 
		 * �⺻�����Ϳ� �ٽ� �����͸� �����Ͽ� �Ҵ� �Ҷ�,
		 * age += 10;
		 *cf) -=, *=, /=, %=
		 *
		 *����������: �����͸� 1������ ������Ű�� �����ڸ� ���Ѵ�.
		 *cnt++: ���������͸� 1������ ������Ų��. ��, ������ �������ο� ������ �ȴ�.
		 *++cnt: ���������͸� 1������ ������Ų��. ��, �������ο� �����ȴ�.
		 *cf) cnt--, --cnt
		 *
		 * ���� ����� �������� 3ȸ 10���� ������Ų �� ������ ����ϼ���.
		 */
		
			int appleCnt = 25;
			appleCnt+= 10;
			System.out.println("1ȸ ��, �� �������:" +appleCnt);
			appleCnt+= 10;
			System.out.println("2ȸ ��, �� �������:" +appleCnt);
			appleCnt+= 10;
			System.out.println("3ȸ ��, �� �������:" +appleCnt);
			/*
			 *  ������ 3�������� ���� ������ 3, 5, 6���� ó���� ���� �־���.
			 *  3ȸ 7���� �������� ��, ������ 3������ ������ �ִ� �� ������ ������ ����ϴ� ���α׷��� ����� ������.
			 *  
			 *  ==============
			 *  			������ 1		������ 2 		������ 3		��
			 *  1				??				??				??			??
			 *  2
			 *  3
			 */
			
			int gom1 = 3;
			int gom2 = 5;
			int gom3 = 6;
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			int sum = gom1+ gom2+ gom3;
			System.out.println("Ƚ��\t������1\t������2\t������3\t��");
			System.out.println("1ȸ\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			sum = gom1+ gom2+ gom3;
			System.out.println("2ȸ\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			sum = gom1+ gom2+ gom3;
			System.out.println("3ȸ\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
		
			
			int fruitCnt1=1;
			int fruitCnt2=1;
			System.out.println("������ ���� ���� ���μ��� ����:"+(fruitCnt1++));
			System.out.println("������ ���� ���� ���μ��� ����:"+(++fruitCnt2));
			
	}

}
