package javastart.b01_object;

class Baby{
	String name;
	String birth;
}
class Mother{
	Baby ba;
	String name;
}
public class C02_ObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby b = new Baby();
		b.name="아기01";
		b.birth="20170101";
		Mother m = new Mother();
		m.name="엄마01";
		m.ba=b;
		System.out.println("아기엄마이름:"+m.name);
		System.out.println("엄마의 아기생일:"+m.ba.birth);
	}

}
