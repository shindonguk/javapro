package javastart.b01_object;

class BookStore02{
	private String bsname;
	private Book02 book; // 메모리(빈공간)
	// 이름설정
	public void setBsname(String bsname) {
		this.bsname = bsname;
	}
	// Book02 객체 저장
	public void setBook(Book02 book) {
		// 외부에서 만들어진 객체가 할당..(메모리에 객체가 할당)
		this.book = book;
	}
	public void goBookStore(){
		System.out.println(bsname+"서점에 가서, ");
		// 만일에..setBook 통해서 객체가 할당되지 않으면..
		// buy() 호출시, 에러발생..
		// 객체가 할당 될 때만 메서드 호출, 그외에는 예외사항 처리..
		if( book != null ){
			book.buy();
		}else{
			System.out.println("책이 서점에 들어오지 않았습니다.");
		}
	}
	
}
class Book02{
	private String bname;
	private int price;
	private int cnt;
	// 생성자 데이터값 할당은 객체생성과 동일하게 1번만..
	public Book02(String bname, int price, int cnt) {
		super();
		this.bname = bname;
		this.price = price;
		this.cnt = cnt;
	}
	
	public void setBookDate(String bname, int price, int cnt) {
		this.bname = bname;
		this.price = price;
		this.cnt = cnt;
	}
	public void buy(){
		System.out.println(bname+"을(를) 권당 "+price+"원으로 "+ cnt+"권 구매하였다.");
	}
	
}

public class C04_Obj_SendObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore02 bs = new BookStore02();
		bs.setBsname("에이콘문고");
		// Book02 book =  new Book02("그림으로배우는 자바",25000,2);
		// 해당 객체가 할당할 수 있는 type(객체)이어야 한다.
		// (X) String book = new Book02("그림으로배우는 자바",25000,2);
		bs.setBook( new Book02("그림으로배우는 자바",25000,2) );
		bs.goBookStore();
		
		
	}

}
