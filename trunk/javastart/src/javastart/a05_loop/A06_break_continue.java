package javastart.a05_loop;

public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
break : �ݺ������� ���μ����� �ߴ��ϰ��� �� ��, ���ȴ�.
   �Ϲ������� ���ǹ��� �Բ� �Ͽ�, �ش� ���ǿ� �ش��� ��,
  ���μ����� �ߴܽ�Ų��..
 * */
		// 3�ܿ���  3 * 5 = 15 �� �����ϰ��� �Ѵ�..
		System.out.println("break�� ���..");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3 * "++" = "+);
			if(cnt==5){
				break; // �ش� ���μ����� �ߴܽ�Ų��..
			}
			System.out.println( 3 + " * "+ cnt + " = " + (3*cnt));
		}
		/*
		continue : �ݺ������� Ư�� ���μ����� �ߴܽ�Ű��, �� ���� ���μ�����
		 �����ϰ��� �� �� ����..
		 * */		
		System.out.println("continue�� ���..");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3 * "++" = "+);
			if(cnt==5){
				continue; // �ش� ���μ����� �ߴܽ�Ų��..
			}
			System.out.println( 3 + " * "+ cnt + " = " + (3*cnt));
		}	
/*
Ȯ�ο���..
1�ܰ�
	������ Ư�� �������� �ܼ��� �Է¹��� ��,  args 5 7
	ex) int grade = 5; // args[0]������ ����
	�ߴ��ؾ� ��  number 5 * 7 = 25   7 // args[1]������ ����. 
2�ܰ� <���α׷� ���� �ִ� �и�..>
	Scanner s = new Scanner(System.in);
	���� �ܺε�����  s.nextInt() :�����͸� ����..�Է� ����..
	for(;;) ���� ����ó��..
	�޴��� �����ϼ���.
	1. �ѽ�
	2. �Ͻ�
	3. �߽�
	0. ����ó��..	
	1�� �Է����� ��,	�ѽ��ֹ�
	3�� �Է����� ��, �߽��ֹ�
	0�� �Է����� ��, �ֹ��Ϸ�..   ��Ÿ�Է� : �ֹ���ȣ�� �����ϴ�.
	
 * 
 * */		
	}



}
