package javastart.C02_static;
class Child{
	private String name;
	private int eatCnt; // 객체가 사과를 먹은 갯수..
	private static int restCnt;// 객체간의 공유하는 남은 사과 갯수
	// 생성자를 통해 이름 할당
	public Child(String name){
		this.name =name;
	}
	// 초기, 사과량을 설정하는 메서드..
	public void restoreApple(int addApple){
		restCnt+=addApple;
		System.out.println(name+"가 사과를 테이블 위에"
				+addApple+" 개를 추가 하였습니다.");
		restCnt();
	}
	public void eatApple(){
		// 개별적으로 사과를 먹는 량..
		eatCnt++;
		// 공유 남은 사과량..
		restCnt--;
		System.out.println(name+"사과를 현재"+eatCnt+"개 먹었습니다.");
		restCnt();
	}
	private void restCnt(){
		System.out.println("현재 남은 사과는 "+restCnt+"개 입니다.");
	}	
}
public class A01_basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child("김고은");
		Child c2 = new Child("황주영");
		Child c3 = new Child("최현욱");
		c3.restoreApple(20);
		c1.eatApple();
		c1.eatApple();
		c1.eatApple();
		c2.eatApple();
		c2.eatApple();
		c3.eatApple();
	}
}

