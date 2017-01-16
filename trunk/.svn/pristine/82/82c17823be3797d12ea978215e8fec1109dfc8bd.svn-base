package javastart.b01_object;

class Woman1 implements Cloneable{
	String name;
	int age;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class Man1{
	String name;
	// 객체 안에 객체 선언, 메모리만 설정
	Woman1 woman;
	Man1(){
		woman = new Woman1();
		
	}

}
public class C01_ObjVsObjBasic {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Woman1 w01 = new Woman1();
		w01.name="김고은";
		w01.age=27;
		Woman1 w02 = (Woman1)w01.clone();
		
		Man1 m01 = new Man1();
		m01.name="김재진";
		// 생성된 객체 안에 있는 Woman1객체에 
		// 생성된 실제 객체를 할당
		m01.woman=w01;	
		System.out.println("재진의 그녀:"+m01.woman.name);
/*
확인예제..  
Baby 속성값 :  이름, 생일
Mother 속성값 : Baby, 이름.

아기이름 :@@@
생일 : @@@
아기엄마 이름:@@@
엄마의 아기 생일: @@@
*/		
		
	}

}
