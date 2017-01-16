package javastart.B01_object;

class woman1{
	String name;
	int age;
}

class man1{
	String name;
	//객체안에 객체 선언, 메모리만 설정
	woman1 woman;
	int age;
}
class baby1{
	String name;
	String birt;
}

class mom1{
	String name;
	String birt;
	baby1 baby;
}


public class C01_ObVsObBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		woman1 w01 = new woman1();
		w01.name="정은지";
		w01.age=27;
		man1 m01 = new man1();
		m01.name="신동욱";
		//생성된 객체 안에 있는 woman1 객체에
		//생성된 실제 객체를 할당
		m01.woman=w01;
		w01.name="jungunzi";
		System.out.println(m01.woman.name);		
		
		System.out.println("--------------------예제--------------------------");
		
		mom1 m = new mom1();
		baby1 b = new baby1();
		m.name="하쿠나";
		m.birt="1990/2/2";
		b.name="마타타";
		b.birt="2000/1/2";
		m.baby=b;
		System.out.println("아기엄마 이름: "+m.name+"\t 엄마 아기의 생일: "+ (m.baby.birt));
/*
 * 확인예제
 * Baby 속성값: 이름, 생일
 * Mother 속성값: Baby, 이름
 * 아기이름:
 * 생일
 * 
 * 아기엄마 이름
 * 엄마의 아기 생일
 */
	}

}
