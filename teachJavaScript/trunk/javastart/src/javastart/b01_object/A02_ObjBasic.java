package javastart.b01_object;

import java.util.Scanner;

class Prod{
	String name;
	int price;
	int cnt;
	int tot;
}
public class A02_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1�ܰ�
		 * ���� 3���� �����͸� �Ҵ��ϰ�,
		 * �Ʒ� �������� ����ϼ���.
		 *    ����� ����Ʈ
		 NO  ���Ǹ�  �ܰ�  ����  ��
		 1   @@@@    3000    2   6000
		 2   @@@     4000    3  12000
		 3   @@@@    5000    1   5000
		 */
		Prod p1 = new Prod();
		Prod p2 = new Prod();
		Prod p3 = new Prod();
		p1.name="���";	p1.price=3000; p1.cnt=3;
		p2.name="������";	p2.price=5000; p2.cnt=2;
		p3.name="����";	p3.price=8000; p3.cnt=1;
		int cnt=1;
		System.out.println("����� ����Ʈ");
		System.out.println("NO\t���Ǹ�\t�ܰ�\t����\t��");
		System.out.println((cnt++)+"\t"+p1.name+"\t"+p1.price+"\t"+p1.cnt+"\t"+(p1.price*p1.cnt));
		System.out.println((cnt++)+"\t"+p2.name+"\t"+p2.price+"\t"+p2.cnt+"\t"+(p2.price*p2.cnt));
		System.out.println((cnt++)+"\t"+p3.name+"\t"+p3.price+"\t"+p3.cnt+"\t"+(p3.price*p3.cnt));
		
/*
		2�ܰ�
		Scanner ��ü�� �̿��Ͽ�..
		���� �Ļ縦 �ֹ��ϰ�, �ֹ��� ������ ����ó���ϴ� ���� 

		## ��³���..
		@@@ �Ĵ翡 ���Ű��� ȯ���մϴ�.
		�޴�
		1. ¥��� - 4500
		2. «��   - 6000
		3. ������ - 12000
		0. ����

		�ֹ� ��ȣ �Է�:
		�ֹ� ���� �Է�:

		0.�� ������ ��..
		���� �ֹ� ������ list�ϰ�..
		�� ��� ���ó��..*/
		System.out.println("�ູ���� ���Ű��� ȯ���մϴ�.");
		Scanner s = new Scanner(System.in);
		int chnum=0; // ������ �ֹ���ȣ
		int price=0; // ����
		int count=0; // ����
		int no=1;    // numbering
		int totall=0; // ��ü�Ѱ�
		Prod p=null; // ��ü �ʱ� ����..
		String chMenu="";
		String show="NO\tMENU\t�ܰ�\t����\t��\n";  // ȭ�鿡 ��ü������ ����ϱ� ����.
		while(true){
			p=new Prod();  // ��ü�� �Ҵ�.. �Ѹ޸𸮿� ��ü�� �Ҵ��ϱ� ����..
			System.out.println("�޴�");
			System.out.println("1. ¥��� - 4500");
			System.out.println("2. «��   - 6000");
			System.out.println("3. ������ - 12000");
			System.out.println("0. ����");
			System.out.print("�ֹ� ��ȣ �Է�:");
			chnum=s.nextInt();

			if(chnum==1) {price=4500; chMenu="¥���";}
			if(chnum==2) {price=6000; chMenu="«��";}
			if(chnum==3) {price=12000; chMenu="������";}
			if(chnum==0) break;
			p.name=chMenu;
			p.price=price;
			
			System.out.print("�ֹ�����:");
			count=s.nextInt();
			p.cnt=count;
			p.tot=p.price*p.cnt;  //  ���� ��
			totall+=p.tot;    // �Ѱ� ����ó��..
			// �ֹ������� show���ڿ��� ����ó��..
			show+=(no++)+"\t"+p.name+"\t"+p.price+"\t"+p.cnt+"\t"+p.tot+"\n";
		}
		System.out.println("=== ��꼭 ===");
		System.out.println(show);
		System.out.println("�� ��:"+totall);
		
		
	}

}
