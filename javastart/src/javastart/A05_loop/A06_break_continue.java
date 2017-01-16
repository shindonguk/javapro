package javastart.A05_loop;
import java.util.Scanner;
public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break: 반복문에서 프로세스를 중단하고자 할 때, 사용된다.
		 * 일반적으로 조건문과 함께 하여, 해당 조건에 해당할 때,
		 * 프로세스를 중단시킨다.
		 * 
		 */ //3단에서 3*5 =15를 생략하고자 한다.
		System.out.println("break일떄");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3+"+cnt+"="+(3*cnt));
			if(cnt==5){
					break;
		}
			System.out.println("3+"+cnt+"="+(3*cnt));
		}
		
		System.out.println("break일떄");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3+"+cnt+"="+(3*cnt));
			if(cnt==5){
					continue;
		}
			System.out.println("3+"+cnt+"="+(3*cnt));
		}
		System.out.println();System.out.println();System.out.println();
		
		
		//---------------------예제1------------------------------------
		
		int grade = Integer.parseInt(args[0]);
		int number = Integer.parseInt(args[1]);
		int a = 0;
		int b = 0;
		String food = "";
		System.out.println("break일떄");
		for(a=1;a<=9;a++){
				if(number == a){continue;}
				System.out.println(grade+"*"+a+"="+(grade*a)+"\t");
			}
		System.out.println();System.out.println();System.out.println();
		//---------------------예제2------------------------------------
		
		for(a=1;a<=100;a++){
			if(a==50){continue;}
			b+=a;
			System.out.print(a+((a!=100)?"+":"="));
			if(a%10==9){System.out.println();}
		}System.out.println("합산결과: "+b);
		
		System.out.println();System.out.println();System.out.println();
		//---------------------예제3------------------------------------
		Scanner s = new Scanner(System.in);
		for(;;){
		a = s.nextInt();
		 switch(a){
		case 0:
			 if(food==""){ 
			 System.out.println("주문을 선택해주세요");continue;
			 }else System.out.println(""+food+"을 선택하셨습니다.");
			 break;
		case 1:
			 System.out.println("한식을 고르셨습니다.");
			 food = "한식";
			 break;
		case 2:
			 System.out.println("일식을 고르셨습니다.");
			 food = "일식";
			 break;
		case 3:
			 System.out.println("중식을 고르셨습니다.");
			 food = "중식";
			 break;	 
		default:
			 System.out.println("주문번호가 틀렸습니다.");
		 }
		 if(a==0){break;}else
		 if(a!=0){continue;}	 
	}
}
}
/*
 * continue: 반복문엣 특정 프로세스만 중단시키고, 그 다음 프로세스를 진행하고자 할 때 쓰임
 * 
 * 확인예제
 * 1단계
 * 1)변수로 특정 구구단의 단수를 입력받은 후
 * ex> int grade = 5; // args[0]값으로 받음
 * 중단해야 할 number 5*7=25 7//args[1]값으로 받음.
 * 
 * 2)1~100까지 합산을 하는데, 50만 빼고 합산결과물을 출력.
 * 출력: 1~100까지 합산 (50제외):??
 * 
 * 
 * 2단계
 * 	Scanner s = new Scanner(system.in);
 * 	으로 외부데이터 s.nextInt=(): 데이터를 숫자 입력으로 받음
 * 	for(;;)무한 루프처리
 * 	메뉴를 선택하세요.
 * 	1.한식
 * 	2.일식
 * 	3.중식
 * 	0.종료처리
 * 
 * 	1,2,3을 입력 시 종류선택
 *  0을 입력시 주문완료
 */
