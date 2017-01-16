package javastart.b01_object;

class BookStore02{
	private String bsname;
	private Book02 book; // �޸�(�����)
	// �̸�����
	public void setBsname(String bsname) {
		this.bsname = bsname;
	}
	// Book02 ��ü ����
	public void setBook(Book02 book) {
		// �ܺο��� ������� ��ü�� �Ҵ�..(�޸𸮿� ��ü�� �Ҵ�)
		this.book = book;
	}
	public void goBookStore(){
		System.out.println(bsname+"������ ����, ");
		// ���Ͽ�..setBook ���ؼ� ��ü�� �Ҵ���� ������..
		// buy() ȣ���, �����߻�..
		// ��ü�� �Ҵ� �� ���� �޼��� ȣ��, �׿ܿ��� ���ܻ��� ó��..
		if( book != null ){
			book.buy();
		}else{
			System.out.println("å�� ������ ������ �ʾҽ��ϴ�.");
		}
	}
	
}
class Book02{
	private String bname;
	private int price;
	private int cnt;
	// ������ �����Ͱ� �Ҵ��� ��ü������ �����ϰ� 1����..
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
		System.out.println(bname+"��(��) �Ǵ� "+price+"������ "+ cnt+"�� �����Ͽ���.");
	}
	
}

public class C04_Obj_SendObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore02 bs = new BookStore02();
		bs.setBsname("�����ܹ���");
		// Book02 book =  new Book02("�׸����ι��� �ڹ�",25000,2);
		// �ش� ��ü�� �Ҵ��� �� �ִ� type(��ü)�̾�� �Ѵ�.
		// (X) String book = new Book02("�׸����ι��� �ڹ�",25000,2);
		bs.setBook( new Book02("�׸����ι��� �ڹ�",25000,2) );
		bs.goBookStore();
		
		
	}

}
