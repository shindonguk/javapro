package javastart.B01_object;
import java.util.Scanner;
class BookS1{
	String bookn ="";
	int bookpay=0;
	int booksum=0;
	int buyBook(int val){
		bookpay = 25000;
		booksum = bookpay*val;
		return booksum;
}
}

class BookS2{
	String bookn ="";
	String list ="";
	int bookpay=0;
	int booksum=0;
	int buyBook(String s, int val){
		this.bookn = s;
		if(s=="java"){
			bookpay = 25000;	
		}
		if(s=="jsp"){
			bookpay = 33000;	
		}
		if(s=="javatool"){
			bookpay = 30000;	
		}
		if(s=="javascript"){
			bookpay = 22000;	
		}
		booksum = bookpay*val;
		return booksum;
		
	}
	void bs(String bname, int val){
	}
	
}
class booklist{
	String name; 
}

public class Book {

	public static void main(String[] args) {
		System.out.println
		("-------------1�ܰ�----------------- ");
		BookS1 book1 = new BookS1();
		BookS2 book2 = new BookS2();
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���: ");
		int val1 = scan.nextInt();
		System.out.println(book1.bookn+"�� ������= "+book1.buyBook(val1));
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("-------------2�ܰ�----------------- ");
		System.out.print("� å�� ã���ʴϱ�: ");
		String s = scan.next();
		System.out.println();
		System.out.print("������ �Է��� �ּ���: ");
		int val2 = scan.nextInt();
		book2.buyBook(s,val2);
		
		
		
		book2.bs(s,val2);
		// TODO Auto-generated method stub
		/*
		 *Ȯ�ο��� 
		 * 1�ܰ�
		 * BookStore ����
		 * ����: ������, ����, ����
		 * �ż���: 
		 * 	buyBook
		 * 		�Է°�: ������� ����, ����
		 * 		return: ���� ��
		 * 	showCalcu
		 * 		��� exp: java�Թ� �ܰ� 25000 2�� ��: 50000	
		 * 2�ܰ�
		 * �� buyBook�� ���ؼ� ������ ������ ������ �� ������
		 * ex)  bs.buyBook("java",25000,2);
		 * 		bs.buyBook("jsp",33000,2);
		 * 		bs.end();//�� ���� ����ó�� ����
		 * showCalcu�ż��带 ���ؼ� ������ �������� ������ �Ʒ� �������� ���
		 * 	���� ���� ����
		 * 	java 25000 2 50000
		 */
	}
}

