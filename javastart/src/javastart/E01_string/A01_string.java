package javastart.E01_string;

public class A01_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * string은 객체이면 문자열을 할당할 수 있는 기능을 가지고 있다.
 */
		//문자열 객체를 할당하는 형식
		String str = new String("hello");
		String str2 = new String("hello");
		
		//문자열을 할당하는 형식(간략화)
		String str3 = "hihi";
		String str4 = "hihi";
		
		System.out.println("비교 new string:"+(str==str2));
		System.out.println("비교 new 문자열 할당:"+(str3==str4));
		//반드시 문자열을 비교할 때는 equals를 활용하여야 한다.
		System.out.println("비교 new 문자열 할당:"+(str.equals(str2)));
		System.out.println("비교 new 문자열 할당:"+(str3.equals(str4)));
	}

}
