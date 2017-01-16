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
		("-------------1단계----------------- ");
		BookS1 book1 = new BookS1();
		BookS2 book2 = new BookS2();
		Scanner scan = new Scanner(System.in);
		System.out.print("수량을 입력해 주세요: ");
		int val1 = scan.nextInt();
		System.out.println(book1.bookn+"의 가격은= "+book1.buyBook(val1));
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("-------------2단계----------------- ");
		System.out.print("어떤 책을 찾으십니까: ");
		String s = scan.next();
		System.out.println();
		System.out.print("수량을 입력해 주세요: ");
		int val2 = scan.nextInt();
		book2.buyBook(s,val2);
		
		
		
		book2.bs(s,val2);
		// TODO Auto-generated method stub
		/*
		 *확인예제 
		 * 1단계
		 * BookStore 서점
		 * 변수: 도서명, 가격, 갯수
		 * 매서드: 
		 * 	buyBook
		 * 		입력값: 도서명과 가격, 갯수
		 * 		return: 계산된 값
		 * 	showCalcu
		 * 		출력 exp: java입문 단가 25000 2권 총: 50000	
		 * 2단계
		 * 위 buyBook을 통해서 다중의 도서를 구매할 수 있으며
		 * ex)  bs.buyBook("java",25000,2);
		 * 		bs.buyBook("jsp",33000,2);
		 * 		bs.end();//한 단위 구매처리 종료
		 * showCalcu매서드를 통해서 누적된 도서구매 내용을 아래 형식으로 출력
		 * 	도서 구매 내역
		 * 	java 25000 2 50000
		 */
	}
}

