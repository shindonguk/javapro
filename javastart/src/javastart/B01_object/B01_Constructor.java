package javastart.B01_object;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import java.util.Scanner;
class Student{
	//�ż��� �����ε�(overloading)
	//�����ڳ� �ż��� ���� ������ �Է°��� type, �ټ�, ������
	//�ٸ��� �ٸ� �ż���� �ν��Ͽ� ������ �����ϴ�.
	//�����ڸ� ������ ����
	//���ǵ� ���� ������ �ż��带 Ȱ���� �� �־,
	//�ٸ� ��ü�� �����ϴ� �ͺ��� ����鿡�� ȿ�����̴�.
	//�Ϲ� �����ڴ� return ���� ����, ���������� �ʱ� �����͸� ������ �� ���ȴ�.
	String name;
	int kor;
	Student(String s, int kor){
		name ="s";
		this.kor =kor;
		System.out.println("�Է°� �ִ� �ʱ������ ȣ��");
		System.out.println("name"+name);
		System.out.println("�������� : "+kor);
	}
	Student(){
		name = "�̸��� �Էµ��� �ʾҽ��ϴ�.";
		kor = 59;
		System.out.println("�Է°� ���� �ʱ������ ȣ��");
		System.out.println("name"+name);
		System.out.println("�������� : "+kor);
		
	}
	void print(){
		System.out.println("name : "+name);
		System.out.println("�������� : "+kor);
	}
}

class coffee{
	String menu="";
	int pay=0;
	
	coffee(){
		System.out.println("�������");
	}
	coffee(String menu){
		this.menu=menu;
		System.out.print(menu+"\t");
	}
	
	coffee(String menu, int val){
		this.menu=menu;
		System.out.print(menu+"\t"+val+"��");
	}
	
	coffee(String menu, int val, int a ){
		System.out.println(menu+"\t"+val+"��\t"+"�� ����: ");
	}
	int Calcu(String menu, int pay){
		this.menu=menu;
		this.pay=pay;
		if(menu == "�Ƹ޸�ī��"){ pay = 3000;}
		if(menu == "īǪġ��"){pay = 4000;}
		if(menu == "��"){pay = 4500;}
		return pay;
	}
	void dis10(int pay){
		//Calcu();
		this.pay=pay;
		
	}
	//int dis20(int pay){}
	//int dis30(int pay){}
	
	
}

public class B01_Constructor {
	public static void main(String[] args) {
		//person	p 		= 	new 		person()
		//Ŭ����	  ��������	    Ű����		 ������
		
		/*���� �����
		 * 
		 * class person(){
		 * 		person(string){} < ���� �̸��� �����ڶ�	
		 * 		person(int){}	 < �ٸ� Ÿ��(�ĸ��Ͱ�)�̸� ���� ������ ��� ����
		 * 		person(){}       <---- �ҷ����� ������ 
		 * }
		
		 * �����ڴ� Ŭ������� ����
		 * ��� �ż���
		 *--���--
		 * 1.�Է°�(0)
		 * 2.return(X)
 
		 * person p = new person()  �ΰ��� ���ÿ� �ҷ��� ���� ���� ���� �ƴ� 
		 * person p = new person()	�ٸ� �ʱ� �����Ͱ� �Ҵ�Ǿ� ���������.
		 * 							�����ڴ� 1���� ȣ�⸸�� �����ϴ�.			
		 * 
		 	
		 *�ʱ⿡ Ŭ������ �����ڸ� �������� ������
		 *���������� default �����ڷ� �Է°��� ���� �����ڰ�
		 *ȣ��Ǿ� �����ȴ�.
		 *����� ���� �����ڰ� ��������� ����,
		 *������ default �����ڸ� �������.
		 *���� ����ҷ���, �����Ͽ��� �Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student("����",77);
		s2.print();

		System.out.println("-----1�ܰ�-----");
		System.out.print("Ŀ�� ����: ");
		String sr1 = scan.next();
		System.out.print("����: ");
		int val = scan.nextInt();
		System.out.print("hot or cold: ");
		String sr2 = scan.next();
		coffee coff1 = new coffee();
		coffee coff2 = new coffee(sr2);
		coffee coff3 = new coffee(sr1,val);
		System.out.println();
		
		
		System.out.println("-----2�ܰ�-----");
		//coffee coff4 = new coffee(sr1, val);
		
/*
 * 1�ܰ� ������ Ȱ���ϱ�
 * coffeeShop
 * ����:
 * �� Ŀ�Ǽ��� ����, �ϴ�, �������. �ֹ� ������ �����ڸ� ���ؼ� ȣ����� ������,
 * �Ƹ޸�ī�밡 default�� ���� ȣ��Ǿ� ó���Ѵ�.
 * 1. default �����ڷ� menu: �Ƹ޸�ī�� ����
 * 2. �Է°��� �Ѱ� �ִ� ������ : �ش� �޴��� �Է¹޾� : ???? ��
 * 3. �Է°��� �ΰ� �ִ� ������ : �޴��� �ܼ��� �Է¹޾� : ??? ??�� ���
 
 * 2�ܰ� ������ �޼��带 ���ؼ� ������ ������ ���ó��.
 * calcu(): ���ż���
 * 			�Ƹ޸�ī�� 3000,
 * 			īǪġ�� 4000,
 * 			��	4500
 * dis10(): 10%���� �� ������	
 * dis20(): 20%���� �� ������	
 * dis30(): 30%���� �� ������	
 * 
 */
		
	}
}
