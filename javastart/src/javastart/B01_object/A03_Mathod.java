package javastart.B01_object;



class Calcu
{
	int num01;
	int num02;
	String cal;
	int sum;
	// �ΰ��� ���� �Է¹޾� ����ó��
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
// ���ڸ� �Է��ϰ� �����ڸ� ������ ���ϴ� ��� �������� ������
// �ϴ� �ż��� ����
	void print(int num01, int num02, String cal){
		//�Էµ� cal�� ���������� �ִ� cal �� �Ҵ�.
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
		// �Է°��� �����ڸ� �Ѱ���... ȭ�鿡 ��±��� ó���ϴ� ����
		c01.print(25, 13, "-");
		//System.out.println(num01+"+"+num02+"="+c01.());
	}




}
