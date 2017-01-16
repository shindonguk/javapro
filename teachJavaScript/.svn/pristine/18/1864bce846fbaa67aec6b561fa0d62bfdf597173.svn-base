package javastart.d01_inherit;
// ctrl+shift+f :소스정리.
/*
상속 : is a(is a kind of) 관계로 상위에 있는 클래스를 하위에 있는
클래스가 접근제어자 범위 안에서 재활용하게 한다.
cf)접근제어자 범위가 벗어나면 쓸 수 없게 된다.
   has a 관계 : 클래스내에서 다른 클래스 호출하여 포함 관계를 의미한다.
*/
class Father {
	private String name;
	int age;

	public void setDate(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("아버지 클래스");
		System.out.println("이름:" + name + ", 나이:" + age);
	}
}
// class 객체 extends 상속할 상위 클래스
class Son extends Father{
	// 추가적인 변수
	String location;
	public void setLocation(String loc){
		location = loc;
		// name과 age가 선언되어 있지 않지만 활용할 수 있다.
		// (접근제어자범위 안에서)
//		System.out.println(name);
		System.out.println(age); //상위에 있는 변수를 쓸 수 있다.
		age=25;
		show(); // 상위에 있는 메서드는 활용할 수 있다.
		System.out.println("사는 곳은"+location+"입니다.");
	}
}
public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		// 상속 관계에 있기 때문에 상위에서 선언한 메서드를 활용할 수 있다.
		s1.setDate("홍길동", 26);
		s1.show();
		// 상속관계에 있는 현재클래스는 접근제어자가 package간에 접근이
		// 가능 하기에 age변수는 활용할 수 있다.
		System.out.println(s1.age);
		// 상속관계에 있지만, name의 접근제어자는 private이기에 바로 쓸
		// 수는 없다..
		//System.out.println(s1.name);
		s1.setLocation("서울 강남");
	}
/*
확인예제..
1단계
상위 : 
	Job 변수: 이름
	    메서드 : working()
	    		@@@가 일을 하다..
	PoliceMan
		변수: kind="경찰"
		메서드 : spWorking()
				경찰인 @@@가 도둑을 잡다.
2단계
	위 1단계 내용을 변수와 메서드를 정리
	상위에 필요한 공통변수 설정, 하위에 working()으로 통일해서 처리(재정의)
    추가 클래스
    FireMan, Developer



 * */
}
