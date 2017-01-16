package javastart.A05_loop;

public class A07_while {
	public static void main(String[] args) {
		/*
		 * 사과를 10개
		 */
		int apple=0;
		while(apple<=10){
			apple+=1;
			if(apple==5){continue;}
			System.out.println("사과"+apple+"개를 구입하셨습니다.");
		}
		
		
		/*
		 * do{
		 * 		반복할 프로세스나 구문,
		 * 		조건이 맞지 않더라도 1번은 출력되게 처리
		 * }while(조건);
		 */
		int vis=1;
		do{
			System.out.println("홍길동 은행 방문!!"+(vis++)+"회!!");
		}while(vis<=0);
	}
}
