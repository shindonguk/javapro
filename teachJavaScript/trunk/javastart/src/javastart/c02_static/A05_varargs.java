package javastart.c02_static;
/*
가변인자 처리..
javascript
	function call()
		arguments :배열로 받아서 처리.
java : java 1.4,1.5(X), 1.6부터 가능 
	void call(String ...names)
	    names :배열로 받아서 처리..
 * */
class Greet{
	public void sayHello(String ...names){
		System.out.println("입력받은 데이터 건수:"+names.length);
		for(String name:names){
			System.out.print(name+"님 ");
		}
		System.out.println("환영합니다.");
	}
}
public class A05_varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g = new Greet();
		g.sayHello("홍길동");
		g.sayHello("홍길동","김길동");
		g.sayHello("홍길동","신길동","마길동");
	}

}
