package javastart.A04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch case 
		 * switch로 지정된 데이터가 param값(외부에서 입력)으로 입력될 때,
		 * case에 따라 다른 처리를 할 수 있게 도와주는 분기문
		 * 
		 * 
		 * switch(param값){ // param값은 일반적으로 정수형태, 문자열가 jdk번전에 따라 입력이 가능하다.
		 * 						ex) int cho = 4;
		 * 							switch( cho )
		 * 		case param값이 특정1값으로 올때:
		 * 			처리할 프로세스
		 * 		case param값이 특정2값으로 올때:
		 * 			처리할 프로세스
		 * 		default: 상위에 지정된 값이 없을 때,
		 * 			처리형 프로세스
		 */
		/*
		int choiceBtn = 5; //2번 버튼을 클릭했을 때,
		switch( choiceBtn ){ 
			case 1: 								// 1번 버튼 동작
				System.out.println("1번 구역 점등");  // 처리할 프로세스
				break;								// case1이 종료 됬을 때 빠져나옴
			case 2:									// 2번 버튼 동작
				System.out.println("2번 구역 점등");  // 처리할 프로세스
				break;								// case2가 종료 됬을 때 빠져나옴
			case 3:									// 3번 버튼 동작
				System.out.println("3번 구역 점등");  // 처리할 프로세스
				break;								// case3이 종료 됬을 때 빠져나옴
			case 4:									// 4번 버튼 동작
				System.out.println("4번 구역 점등");  // 처리할 프로세스
				break;								// case4가 종료 됬을 때 빠져나옴
			default:								// switch값이 case값이랑 맞지 않을경우
				System.out.println("빈 버튼");   // 처리할 프로세스
				break;								// default가 종료 됬을 때 빠져나옴	
		}System.out.println("다시 입력핫오");
		
		*
		*/
		int bugernum = Integer.parseInt(args[0]);
		switch( bugernum ){ 
		case 1: 								
			System.out.println("새우버거 4000원"); 
			break;								
		case 2:									
			System.out.println("불고기버거 5000원");  
			break;								
		case 3:									
			System.out.println("치즈버거 4500원");
			break;
		default:									
			System.out.println("다른건 안팔아");
			break;
	}
		
		
		
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]);
		int avr = (kor+eng+mat)/3;
		String gre = "";
		switch( avr/10 ){ 	
			case 10:									
			case 9:									
				gre = "A";
				break;	
			case 8:									
				gre = "B";
				break;
			case 7:									
				gre = "C";
				break;
			case 6:									
				gre = "D";
				break;
			default:								
				gre = "F";
				break;
		}
		
		System.out.println("국어: "+kor+"");
		System.out.println("영어: "+eng+"");
		System.out.println("수학: "+mat+"");
		System.out.println("평균: "+avr+"");
		System.out.println("총 평균 학점: "+gre+" ");
	}		

}
