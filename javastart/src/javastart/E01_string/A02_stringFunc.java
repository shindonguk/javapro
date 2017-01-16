package javastart.E01_string;

public class A02_stringFunc {
	public static void main(String[] args) {
		String greet = "안녕하세요 하 하하.!!";
		String greetEn = "hello!!!";
		// 문자열 연결: concat("연결할 문자")
		System.out.println(greet.concat("Nice guy!!"));
		// 문자열 치환(바꿈처리) replace('원본문자','바꿀문자')
		System.out.println(greet.replace('!','@'));
		// 부분 추출 substring(index, 순서) 해당 index부터, 순서
		// 까지 문자열 추출
		System.out.println(greet.substring(0,2));
		System.out.println(greet.toUpperCase());
		System.out.println(greet.toLowerCase());
		// endwith: 해당 문자열로 끝나는지 여부 처리
		System.out.println(greetEn.endsWith("!!!"));
		// charAt(index): 특정 index의 문자 추출
		System.out.println(greet.charAt(3));
		// length(): 문자열의 크기 ps) 배열과 크기 length
		System.out.println(greet.length());
		System.out.println(greet.indexOf('하'));
		// trim() 좌우 공백제어
		System.out.println(greet.trim());

	/*
	 * 주민 번호를 통해, 생년월일과 남녀 구분을 처리하세요.
	 */
		
		 String mybrith = "910918-10@@@@@";
		 System.out.print("19"+mybrith.substring(0,2)+"년 "+mybrith.substring(2,4)+"월 "+mybrith.substring(4,6)+"일생 ");
		 //String gender = mybrith.charAt(7)=="1"?"남자":"여자";
		 String gender = mybrith.substring(7,8).equals("1")?"남자":"여자";
		 System.out.println(gender);
	}
}
