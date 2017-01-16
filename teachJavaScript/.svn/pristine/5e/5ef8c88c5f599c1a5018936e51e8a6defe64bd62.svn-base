package javastart.e01_string;

public class A02_StringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet = "안녕하세요!!";
		String greetEn = "Hello!!!  ";
		// 문자열 연결 : ** concat("열결할 문자")
		System.out.println(greet.concat(" Nice Guy!!"));
		// 문자열 치환(바꿈처리) replace('원본문자','바꿀문자')
		System.out.println(greet.replace('!', '@'));
		// 부분 추출..**substring(index, 순서) 해당 index부터, 순서
		// 까지 문자열 추출..
		System.out.println(greet.substring(0,2));
		System.out.println(greetEn.toUpperCase());
		System.out.println(greetEn.toLowerCase());
		// endsWith : 해당 문자열로 끝나는지 여부 처리..
		System.out.println(greetEn.endsWith("!!!"));
		// charAt(index):특정 index의 문자 추출..
		System.out.println(greetEn.charAt(3));
		// **length() : 문자열의 크기..ps)배열과 크기-.length
		System.out.println(greet.length());
		// indexOf('문자') :해당 문자열의 index 위치 
		System.out.println(greet.indexOf('하'));
		// trim() 좌우공백제어..
		System.out.println(greetEn.trim());
/*
주민번호를 통해, 생년월일과 남녀 구분을 처리하세요..
980411-1802627

1998년 4월 11일생  남자

 * */		
		String civilNum="980411-1802627";
		String birthYear="19".concat(civilNum.substring(0, 2)).concat("년 ").
		                 concat(civilNum.substring(2, 4)).concat("월").
		                 concat(civilNum.substring(4, 6)).concat("일생 ");
		//  char : 문자 한자 할당..
		char c = 'a';
		// charAt(7) return 이 char type이기에..
		//String gender=civilNum.charAt(7)=='1'?"남자":"여자";
		String gender=civilNum.substring(7,8).equals("1")?"남자":"여자";
	    System.out.println(birthYear.concat(gender));
		
	}

}
