package javastart.A05_loop;
import java.util.Scanner;
public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break: �ݺ������� ���μ����� �ߴ��ϰ��� �� ��, ���ȴ�.
		 * �Ϲ������� ���ǹ��� �Բ� �Ͽ�, �ش� ���ǿ� �ش��� ��,
		 * ���μ����� �ߴܽ�Ų��.
		 * 
		 */ //3�ܿ��� 3*5 =15�� �����ϰ��� �Ѵ�.
		System.out.println("break�ϋ�");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3+"+cnt+"="+(3*cnt));
			if(cnt==5){
					break;
		}
			System.out.println("3+"+cnt+"="+(3*cnt));
		}
		
		System.out.println("break�ϋ�");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3+"+cnt+"="+(3*cnt));
			if(cnt==5){
					continue;
		}
			System.out.println("3+"+cnt+"="+(3*cnt));
		}
		System.out.println();System.out.println();System.out.println();
		
		
		//---------------------����1------------------------------------
		
		int grade = Integer.parseInt(args[0]);
		int number = Integer.parseInt(args[1]);
		int a = 0;
		int b = 0;
		String food = "";
		System.out.println("break�ϋ�");
		for(a=1;a<=9;a++){
				if(number == a){continue;}
				System.out.println(grade+"*"+a+"="+(grade*a)+"\t");
			}
		System.out.println();System.out.println();System.out.println();
		//---------------------����2------------------------------------
		
		for(a=1;a<=100;a++){
			if(a==50){continue;}
			b+=a;
			System.out.print(a+((a!=100)?"+":"="));
			if(a%10==9){System.out.println();}
		}System.out.println("�ջ���: "+b);
		
		System.out.println();System.out.println();System.out.println();
		//---------------------����3------------------------------------
		Scanner s = new Scanner(System.in);
		for(;;){
		a = s.nextInt();
		 switch(a){
		case 0:
			 if(food==""){ 
			 System.out.println("�ֹ��� �������ּ���");continue;
			 }else System.out.println(""+food+"�� �����ϼ̽��ϴ�.");
			 break;
		case 1:
			 System.out.println("�ѽ��� ���̽��ϴ�.");
			 food = "�ѽ�";
			 break;
		case 2:
			 System.out.println("�Ͻ��� ���̽��ϴ�.");
			 food = "�Ͻ�";
			 break;
		case 3:
			 System.out.println("�߽��� ���̽��ϴ�.");
			 food = "�߽�";
			 break;	 
		default:
			 System.out.println("�ֹ���ȣ�� Ʋ�Ƚ��ϴ�.");
		 }
		 if(a==0){break;}else
		 if(a!=0){continue;}	 
	}
}
}
/*
 * continue: �ݺ����� Ư�� ���μ����� �ߴܽ�Ű��, �� ���� ���μ����� �����ϰ��� �� �� ����
 * 
 * Ȯ�ο���
 * 1�ܰ�
 * 1)������ Ư�� �������� �ܼ��� �Է¹��� ��
 * ex> int grade = 5; // args[0]������ ����
 * �ߴ��ؾ� �� number 5*7=25 7//args[1]������ ����.
 * 
 * 2)1~100���� �ջ��� �ϴµ�, 50�� ���� �ջ������� ���.
 * ���: 1~100���� �ջ� (50����):??
 * 
 * 
 * 2�ܰ�
 * 	Scanner s = new Scanner(system.in);
 * 	���� �ܺε����� s.nextInt=(): �����͸� ���� �Է����� ����
 * 	for(;;)���� ����ó��
 * 	�޴��� �����ϼ���.
 * 	1.�ѽ�
 * 	2.�Ͻ�
 * 	3.�߽�
 * 	0.����ó��
 * 
 * 	1,2,3�� �Է� �� ��������
 *  0�� �Է½� �ֹ��Ϸ�
 */
