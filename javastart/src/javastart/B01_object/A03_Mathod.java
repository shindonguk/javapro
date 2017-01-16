package javastart.B01_object;



class Calcu
{
	int num01;
	int num02;
	String cal;
	int sum;
	// 두개의 값을 입력받아 덧셈처리
	int plus(int num01, int num02){
		cal = "+";
		sum = num01+num02;
		return sum;

	}
	int minus(int num01, int num02){
		cal = "-";
		sum = num01-num02;
		return sum;

	}
	int multi(int num01, int num02){
		cal = "*";
		sum = num01*num02;
		return sum;

	}
	int div(int num01, int num02){
		cal = "/";
		sum = num01+num02;
		return sum;

	}
// 숫자를 입력하고 연산자를 넣으면 원하는 출력 형식으로 나오게
// 하는 매서드 구현
	void print(int num01, int num02, String cal){
		//입력된 cal을 전역변수에 있는 cal 로 할당.
		this.cal=cal;
		if(cal.equals("+")){
			sum=plus(num01,num02);
			System.out.println(num01+"+"+num02+"="+sum);
		}
		if(cal.equals("-")){
			sum=minus(num01,num02);
			System.out.println(num01+"-"+num02+"="+sum);
		}
		if(cal.equals("*")){
			sum=multi(num01,num02);
			System.out.println(num01+"*"+num02+"="+sum);
		}
		if(cal.equals("/")){
			sum=div(num01,num02);
			System.out.println(num01+"/"+num02+"="+sum);
		}
	}
}
public class A03_Mathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c01 = new Calcu();
		int num01=4;
		int num02=5;
		System.out.println(num01+"+"+num02+"="+c01.plus(num01,num02));
		// 입력값과 연산자를 넘겨줘... 화면에 출력까지 처리하는 내용
		c01.print(25, 13, "-");
		//System.out.println(num01+"+"+num02+"="+c01.());
	}




}
