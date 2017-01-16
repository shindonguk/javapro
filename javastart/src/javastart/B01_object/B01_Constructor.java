package javastart.B01_object;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import java.util.Scanner;
class Student{
	//매서드 오버로딩(overloading)
	//생성자나 매서드 명이 같더라도 입력값의 type, 겟수, 순서만
	//다르면 다른 매서드로 인식하여 선언이 가능하다.
	//생성자를 여러개 쓰면
	//정의된 같은 변수나 매서드를 활용할 수 있어서,
	//다른 객체를 선언하는 것보다 재사용면에서 효율적이다.
	//일반 생성자는 return 값이 없고, 전역변수의 초기 데이터를 성정할 때 사용된다.
	String name;
	int kor;
	Student(String s, int kor){
		name ="s";
		this.kor =kor;
		System.out.println("입력값 있는 초기생성자 호출");
		System.out.println("name"+name);
		System.out.println("국어점수 : "+kor);
	}
	Student(){
		name = "이름이 입력되지 않았습니다.";
		kor = 59;
		System.out.println("입력값 없는 초기생성자 호출");
		System.out.println("name"+name);
		System.out.println("국어점수 : "+kor);
		
	}
	void print(){
		System.out.println("name : "+name);
		System.out.println("국어점수 : "+kor);
	}
}

class coffee{
	String menu="";
	int pay=0;
	
	coffee(){
		System.out.println("어서오세요");
	}
	coffee(String menu){
		this.menu=menu;
		System.out.print(menu+"\t");
	}
	
	coffee(String menu, int val){
		this.menu=menu;
		System.out.print(menu+"\t"+val+"잔");
	}
	
	coffee(String menu, int val, int a ){
		System.out.println(menu+"\t"+val+"잔\t"+"총 가격: ");
	}
	int Calcu(String menu, int pay){
		this.menu=menu;
		this.pay=pay;
		if(menu == "아메리카노"){ pay = 3000;}
		if(menu == "카푸치노"){pay = 4000;}
		if(menu == "라떼"){pay = 4500;}
		return pay;
	}
	void dis10(int pay){
		//Calcu();
		this.pay=pay;
		
	}
	//int dis20(int pay){}
	//int dis30(int pay){}
	
	
}

public class B01_Constructor {
	public static void main(String[] args) {
		//person	p 		= 	new 		person()
		//클래스	  참조변수	    키워드		 생성자
		
		/*위의 모양은
		 * 
		 * class person(){
		 * 		person(string){} < 같은 이름의 생성자라도	
		 * 		person(int){}	 < 다른 타입(파리터값)이면 동일 명으로 사용 가능
		 * 		person(){}       <---- 불러오는 생성자 
		 * }
		
		 * 생성자는 클래스명과 동일
		 * 기능 매서드
		 *--기능--
		 * 1.입력값(0)
		 * 2.return(X)
 
		 * person p = new person()  두개를 동시에 불러도 절대 같은 것이 아닌 
		 * person p = new person()	다른 초기 데이터가 할당되어 만들어진다.
		 * 							생성자는 1번의 호출만이 가능하다.			
		 * 
		 	
		 *초기에 클래스에 생성자를 선언하지 않으면
		 *내부적으로 default 생성자로 입력값이 없는 생성자가
		 *호출되어 생성된다.
		 *사용자 정의 생성자가 만들어지는 순간,
		 *기존으 default 생성자를 사라진다.
		 *같이 사용할려면, 정의하여야 한다.
		 */
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student("하이",77);
		s2.print();

		System.out.println("-----1단계-----");
		System.out.print("커피 종류: ");
		String sr1 = scan.next();
		System.out.print("수량: ");
		int val = scan.nextInt();
		System.out.print("hot or cold: ");
		String sr2 = scan.next();
		coffee coff1 = new coffee();
		coffee coff2 = new coffee(sr2);
		coffee coff3 = new coffee(sr1,val);
		System.out.println();
		
		
		System.out.println("-----2단계-----");
		//coffee coff4 = new coffee(sr1, val);
		
/*
 * 1단계 생성자 활용하기
 * coffeeShop
 * 내용:
 * 이 커피샵에 가면, 일단, 어서오세요. 주문 내용이 생성자를 통해서 호출되지 않으면,
 * 아메리카노가 default로 한자 호출되어 처리한다.
 * 1. default 생성자로 menu: 아메리카노 한잔
 * 2. 입력값이 한개 있는 생성자 : 해당 메뉴를 입력받아 : ???? 한
 * 3. 입력값이 두개 있는 생성자 : 메뉴와 잔수를 입력받아 : ??? ??잔 출력
 
 * 2단계 할인을 메서드를 통해서 각각의 내용을 계산처리.
 * calcu(): 계산매서드
 * 			아메리카노 3000,
 * 			카푸치노 4000,
 * 			라떼	4500
 * dis10(): 10%할인 및 결과출력	
 * dis20(): 20%할인 및 결과출력	
 * dis30(): 30%할인 및 결과출력	
 * 
 */
		
	}
}
