package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���������: +, -, *,  /,  %
//%: ������ ������: �ش� �������� ���� ������ ������ �κ� ó��
		
	System.out.println("20%7="+(20%7));
	/*
	 * ��� 50���� 3������ ������ �ֱ�� �߽��ϴ�. 
	 * 1���� ��� ������ �ְ�, ������ ??���� ���� ���� ���α׷� �ҷ��� �Ѵ�.
	 * �̶�, ���� ������ �Ѱ��� �׸��� ������ ����� ������� args�� �޾Ƽ� ���������� ó���ϴ� ���α׷��� ����ÿ�.
	
	 */
	 String kfruit  = args[0];
	 int cfruit  = Integer.parseInt(args[1]);
	 int sharep =  Integer.parseInt(args[2]);
	 //sysout+ctrl+space : ����⸦ �ܿ�� ���� Ǯ�ڵ� �ϱ�
	 
	 
	System.out.println("���� ���� ="+kfruit);
	System.out.println("���� ���� ="+cfruit);
	System.out.println("�������� �ο� ="+sharep);
	System.out.println("1���� ������ �� ���� ���� ="+(cfruit/sharep));
	System.out.println("������ ���� ="+(cfruit%sharep));
	

	
	
	
	
	
	
	}

}