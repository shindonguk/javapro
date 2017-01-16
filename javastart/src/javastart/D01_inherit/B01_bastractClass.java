package javastart.D01_inherit;

	abstract class larba01{
		private String kind;
		public larba01() {
			this.kind = "라바";
		}
		public larba01(String kind) {
			this.kind=kind;
			
		}
		public String getkind() {
			return kind;
			
		}
		public void moving(){
			System.out.println(kind+"가 이동합니다.");
		}
		//{}body가 없는 메서드는 추상메서드: 하위객체에서
		//이 메서드를 반드시 재정의 하여야 함
		//추상메서드가 한개이상 포함된 클래스는 추상클래스 이며
		//클래스선언 앞에 abstract라고 선언해 주어야 한다.
		public abstract void attack();
	}
	class Dron extends larba01{
		public Dron() {
			super("드론");
			// TODO Auto-generated constructor stub
		}
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println(getkind()+"가 미사일 공격을 합니다.");
		}
		
	}
class zerggling01 extends larba01{
	public zerggling01() {
		super("저글링");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
		
public class B01_bastractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		larba01 l1 = new Dron();
		larba01 l2 = new zerggling01();
		l1.attack();
		l2.attack();

	}
/*
 * 확인예제
 * 1단계
 * 상위
 * Robot
 * 		변수:
 * 하위
 * Atom
 * My
 */

}
