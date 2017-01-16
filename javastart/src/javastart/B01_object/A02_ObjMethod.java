/*
 * 1단계
 * Hope //새해 희망...객체 class
 * 변수
 * 문자열(String) hope01// 첫번째 희망
 * 문자열(String) hope02// 두번째 희망
 * 문자열(String) hope03// 세번째 희망
 * 문자열(String) hope04// 네번째 희망
 * 숫자(int) newYear	   // 새해년도
 * 문자열(String) orgRnd// 새해띠?

 *매서드 showMyHope()
 *	@@@년도 @@@띠 새해에 나의 희망사항
 *	1. @@@@
 *	2. @@@@
 *	3. @@@@
 */


package javastart.B01_object;
import java.util.Calendar;import java.util.spi.CalendarDataProvider;
import java.lang.invoke.SwitchPoint;
import java.sql.Array;
import java.util.Scanner;

class Man{
	String name;
	int age;
	void  printAll(){
		System.out.print("이름은"+name);
		System.out.print(", 나이는"+name+"살!!");
	}	
}

class showMyHope{
	String hope="";
	String orgRnd = "";
}

public class A02_ObjMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyHope show = new showMyHope();
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		int a = 1;
		int newyear = cal.get(Calendar.YEAR);
		
		for(;;){
			System.out.print("새해에 나의 희망사항을 적어주세요: ");
			show.hope += (a++)+"\t"+scan.nextLine()+"\n";
		
		switch((newyear-1)%12){
		case 0:
			show.orgRnd = "닭";
			break;
		case 1:
			show.orgRnd = "개";
			break;
		case 2:
			show.orgRnd = "돼지";
			break;
		case 3:
			show.orgRnd = "닭";
			break;
		case 4:
			show.orgRnd = "소";
			break;
		case 5:
			show.orgRnd = "호랑이";
			break;
		case 6:
			show.orgRnd = "토끼";
			break;
		case 7:
			show.orgRnd = "용";
			break;
		case 8:
			show.orgRnd = "뱀";
			break;
		case 9:
			show.orgRnd = "말";
			break;
		case 10:
			show.orgRnd = "양";
			break;
		case 11:
			show.orgRnd = "원숭이";
			break;
		}
		System.out.println(newyear+"년도\t"+show.orgRnd+"띠 새해에 나의 희망사항");
		System.out.println(show.hope);

		}
	}

}
