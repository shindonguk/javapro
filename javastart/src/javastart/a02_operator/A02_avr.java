package javastart.a02_operator;

public class A02_avr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		/* 
		 * �Ʒ������� ������ args������ �޾Ƽ� ó���ϼ���.
		 * @@@: args������ �޾Ƽ� ó��
		 * ### : ����ó���ؼ� ��Ÿ���� �κ�
		 * 
		 * 			�������� ���α׷�
		 * 					 					��: ??  3 - 4��, ������а�
		 * NO	 �̸�	 ����	 ����	 ����	 ���� ���(�Ǽ�)
		 * ���-------
		 * ���� ����: ??? 
		 * ���� ����: ?? 
		 * �������� �ο�: ???
		 * 1���� ������ �� ���� ����: ??
		 * ������ ����:???
		 */
		 int classnum1  = Integer.parseInt(args[0]);
		 String  name1 = args[1];
		 int kor1  = Integer.parseInt(args[2]);
		 int mat1  = Integer.parseInt(args[3]);
		 int eng1  = Integer.parseInt(args[4]);
		 int sum1 = kor1 + mat1+ eng1;
		 double avg1  = (double)sum1/3;
		 
		 int classnum2  = Integer.parseInt(args[5]);
		 String  name2 = args[6];
		 int kor2  = Integer.parseInt(args[7]);
		 int mat2  = Integer.parseInt(args[8]);
		 int eng2  = Integer.parseInt(args[9]);
		 int sum2 = kor2 + mat2+ eng2;
		 double avg2  = (double)sum2/3;
		 
		 String  myclass = args[10];
		 String  mymajor = args[11];
		 //sysout+ctrl+space : ����⸦ �ܿ�� ���� Ǯ�ڵ� �ϱ�
		 System.out.println(""+myclass+"��, "+mymajor);
		 System.out.println("NO\t�̸�\t����\t����\t����\t����\t���");
		 System.out.println(""+classnum1+"\t"+name1+"\t"+kor1+"\t"+mat1+"\t"+eng1+"\t"+sum1+"\t"+avg1);
		 System.out.println(""+classnum2+"\t"+name2+"\t"+kor2+"\t"+mat2+"\t"+eng2+"\t"+sum2+"\t"+avg2);
		
	}

}