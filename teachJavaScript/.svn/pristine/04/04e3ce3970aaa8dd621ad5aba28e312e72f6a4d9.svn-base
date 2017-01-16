package javastart.c02_static;
/*
1. final
 1) 변수가 아닌 상수 즉, 데이터를 변경하지 못할
 	메모리를 설정할 때 활용한다.
 	대문자로 선언한다.
 	final int MONY=40;
 2) 메서드에서 앞에서 쓰일 때는 상속관계overriding되지 못하게 처리.
    하위클래스에서 재정의 하지 못하게 처리..
 3) 클래스명 앞에서 쓰일 때는 상속되지 않게 처리.
    public final class Person{}
 * 
 * */
class Memo{
	final String ETERNAL_PROMISE="변치 않는 약속";
	final private String ETERNAL_PROMISE2="변치 않는 약속";
	public void setPromise(String inDate){
		// 내부에서 할당도 상수이기에 불가능
//		this.ETERNAL_PROMISE2=inDate;
	}
}
// 일반적으로 상수나 static 변수는 대문자로 표현하여 일반 변수와 구분한다.
public class A04_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memo m = new Memo();
//		상수는 재할당이 되지 않는다..
//		m.ETERNAL_PROMISE="변하는 약속";

	}

}
