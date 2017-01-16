package javastart.c02_static;

/*
static : 변수나 메서드에 주로 쓰이는 키워드로
해당 변수나 메서드를 객체 참조에 범위에 있지 않고,
객체의 공유 메모리 영역으로 처리되어,
객체 간 공유하는 변수나 메서드에서 주로 활용 된다.

예제
아이들이 각자 사과를 먹는 것은(일반변수)
남은 사과량(공유static변)을 처리하는 내용.. 

 * */

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
/*
1단계
Accounts (계좌)
	변수: 계좌명
	      일반 - 현입금액
	      공유 - 계좌전체 금액.
	생성자 : 계좌명ex) 홍길동 계좌      
	메서드 : save - 각 계좌별 입금처리..
	         curTotMoney - 전체계좌 잔액
2단계 :1단계에서 추가내용.
   변수   : 계좌별 잔액..
   생성자 : 1단계에서 추가, 초기 계좌별 입금액 처리.
   메서드 : save( 입금액 ) 계좌별 입금액   ex) @@@  입금 @@@ 원
            outMn( 출금액) 계좌별 출금액.. ex) @@@  출금 @@@ 원
                     
	         
	               
 * 
 * */		
	}

}
