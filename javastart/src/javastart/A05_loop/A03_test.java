package javastart.A05_loop;

public class A03_test {
	public static void main(String[] args) {
		/*
		 * 1. �ܰ�
		 * ������ args�� �Ʒ��� ���� �����Ͱ� �ִ�. 
		 * �޿� 300,000 0 ��Ʈ 0 100,000 �ʱ��� 0 50,000
		 * �˹� 100,000 0
		 * 1)����/���� �׸��� ����Ͻÿ�
		 * 2)�Ѽ��Ծ�
		 * 
		 * 
		 * 2. �ܰ�
		 * �� �����͸� �Ʒ��� ������ ����ϼ���.
		 * �����
		 * no	�׸�	  �����   ���ܾ�
		 * 1     �޿�	     0	 300,000	
		 * 
		 * 		for(int leng=0;leng< args.length;leng++){
			System.out.print(args[leng]+"\t");
			System.out.print("�Ѽ��Ծ�: "+args[leng]+"\t");
		 * 3. �ܰ�
		 * �޿�    300,000  ����  ��Ʈ  100,000  ����  �ʱ���  50,000 ����
		 */
		System.out.println("------1�ܰ�------");
		int num=0;
		String label = ""; 
		int x = 0;
		int y = 0;
		int z = 0; 
		System.out.println("����\t����");
		for(int a=0;a<args.length;a++){ 

			if(a%3==1){
				x += Integer.parseInt(args[a]);
			System.out.print(args[a]+"\t");
			}else if(a%3==2){
				y += Integer.parseInt(args[a]);
				System.out.print(args[a]+"\t");
				}else {System.out.println();
				}
		}
		System.out.println();
		System.out.println("�Ѽ��Ծ�: "+(x-y));
		System.out.println();
		System.out.println();
		System.out.println("------2�ܰ�------");
		System.out.println("no\t�׸�\t����\t�����ܾ�");
		for(int a=0;a<args.length;a++){ 
			if(a%3==0){
			++num;
			
			System.out.print(num+"\t");	
			System.out.print(args[a]+"\t");
			}else if(a%3==1){
				x = Integer.parseInt(args[a]);
				z+=x;
			}
			else {
				y = Integer.parseInt(args[a]);
				System.out.print(args[a]+"\t");		
				System.out.print((z-y));
				System.out.println();}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("------3�ܰ�------");
		for(int a=0;a<args.length;a++){ 
			if(a%3==0){
			System.out.print(args[a]+"\t");
			}else if(a%3==1){
				x = Integer.parseInt(args[a]);
				if(x==0){}else{System.out.print(args[a]+"\t");}
			}
			else {y = Integer.parseInt(args[a]);
				if(y==0){}else{System.out.print(args[a]+"\t");}
				if(x==0){System.out.print("����\t");}else
				if(y==0){System.out.print("����\t");}		
				}
				}
			}
		}
