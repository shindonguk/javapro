package javastart.B01_object;

import java.util.Scanner;

//person �̶�� Ʋ�� �����.
class person{
	String name;
	int age;
}
class product{	
	String name = "��ġ";	
	int price;//������ �ܰ�
	int pcnt;//������ ����
	int sum;//������ ��	
}

class list{
	int no;
	String menew;
	int pay;
	int val;
}
/*
 * -------1�ܰ�---------
 * ���� 3���� �����͸� �Ҵ��ϰ�, 
 * �Ʒ��� �������� ����ϼ���.
 * 	 ������ ����Ʈ
 * no	���Ǹ�	�ܰ�		����		��
 * 
 * -------2�ܰ�---------
 * 
 * scanner�� ���� �޾�
 * ���ɽĻ縦 �ֹ��ϰ�, �ֹ��� ������ ����ó���ϴ� ����
 * 		
 * �޴�
 * 1.¥��� - 4500
 * 2.«�� - 4000
 * 3.������ - 15000
 * 
 * �ֹ� ��ȣ �Է�:
 * �ֹ� ���� �Է�:
 * 
 * 0�� �������� ���� �ֹ� ������ list�ϰ� �� ��� ���ó��
 * 
 */
//ex> product ���Ǹ� �����͸� ������ �Ŀ� main���� ȣ���ϼ���.
public class A01_objbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������� Ʋ���� person���� �޸𸮿� �ø��� ó��
		 */
		/*person p1 = new person();
		p1.name = "ȫ�浿";
		person p2 = new person();
		p2.name = "����ȫ";
		p1.age = 26;
		p2.age = p1.age;
		product pr1 = new product(); */
/*		System.out.println("�̸�1: "+p1.name);
		System.out.println("�̸�2: "+p2.name);
		System.out.println("����1: "+p1.age);
		System.out.println("����2: "+p2.age);
		System.out.println("����: "+pr1.name);*/
	
		product pr1 = new product();
		int a = 1;
		pr1.pcnt = 4;
		pr1.price = 5000;
		pr1.sum = pr1.pcnt * pr1.price;
		System.out.println("--------����1---------");
		System.out.println("no\t���Ǹ�\t�ܰ�\t����\t��");
				System.out.print((a++)+"\t");
				System.out.print(pr1.name+"\t");
				System.out.print(pr1.pcnt+"\t");
				System.out.print(pr1.price+"\t");
				System.out.print(pr1.sum+"\t");
				
			
		System.out.println();
		System.out.println("--------����2---------");
				list l = new list();
				Scanner n = new Scanner(System.in);	
				l.pay = 0;
				l.menew = "";
				int num = 0;
				int val = 0;
				l.no = 1;
				String show = "";
				//String menew = "";	
				for(;;){
					 System.out.print("�޴��� �������ּ���:");
					 num = n.nextInt();
					 if(num!=0 && num<4){System.out.print("������ ���ּ��� :");
					 val = n.nextInt();}
					 
					 
					 switch(num){
					case 0:
						System.out.println(show);
						break;
					case 1:
						 System.out.println("¥����� �����̽��ϴ�.");
						 l.menew = "¥���";
						 l.pay = 4000;
						 break;
					case 2:
						 System.out.println("«���� �����̽��ϴ�.");
						 l.menew = "«��";
						 l.pay = 4500;
						 break;
					case 3:
						 System.out.println("�������� �����̽��ϴ�.");
						 l.menew = "������";
						 l.pay = 18000;
						 break;	 
					default:
						 System.out.println("�ֹ���ȣ�� Ʋ�Ƚ��ϴ�.");
						 break;	
					 }
					 
						if(l.menew!="" && l.pay != 0 && num<4 && num!=0){
							show += (l.no)+"\t"+l.menew+"\t"+(l.pay*val)+"\n";
							System.out.println("��ȣ\t�޴��̸�\t����");
							System.out.println(show);
							l.no++;
						}
					 
				}	
	}
}
