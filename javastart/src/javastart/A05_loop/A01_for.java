package javastart.A05_loop;

import java.util.Scanner;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(�ʱⰪ;�Ѱ谪;����){
		 * 		�ݺ�ó���� ����
		 * }
		 */
		for(int a=1;a<10;a++){
			String b = "*";
			for(int c=1;c<a;c++){
				System.out.print(b);
			}System.out.println();
		}
		/*
		 * ������ ó��
		 * 2*1 =2
		 * 
		 */
		/*int a = Integer.parseInt(args[0]);
		for(int b=1;b<10;b++){
			System.out.println("a*b = "+(a*b));
		}*/
		/*
		 * 1�ܰ�
		 * 1> 5~20���� 1������ �������� ����ϼ���
		 * 2> 30~ 100���� 5������ �������� ����ϼ���
		 * 3> 1000~ 90���� ���ҽ��� 2������ ����ϼ���
		 * 
		 * 2�ܰ�: if��, \n, \t Ȱ��
		 * 1> ������ ��ü�� ������ ���� �������� ����ϼ���
		 * 	2��		3��		4��		5��		6��
		 * 2*1=2   3*1=2   4*1=2   5*1=2   6*1=2		 
		 * 
		 * */
		System.out.println();
		System.out.println();
		System.out.println("------------------------------1�ܰ�------------------------------------");
		System.out.println("1��");
		for(int a=5;a<=20;a++){
			System.out.print(""+a+"\t");
		}System.out.println();
		System.out.println();
		System.out.println("2��");
		for(int a=30;a<=100;a+=5){
			System.out.print(""+a+"\t");
		}System.out.println();
		System.out.println();
		System.out.println("3��");
		for(int a=1000;a>=900;a-=2){
			System.out.print(""+a+"\t");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------2�ܰ�------------------------------------");
		System.out.println("������");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(a=2;a<=9;a++){
			System.out.print(""+a+"��\t");
		}
		for(int b=1;b<=9;b++){
			System.out.println();
			for(a=2;a<=9;a++){
				System.out.print(""+a+"*"+b+"="+(a*b)+"\t");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int b = 0;
				for(b=2;b<=9;b++){
				System.out.print(""+a+"*"+b+"="+(a*b)+"\t");
			}
			
		}
	
 
	}
