package javastart.b01_object;


class Calcu{
	int num01;
	int num02;
	String cal;
	int sum;
	// �ΰ��� ���� �Է¹޾� ����ó��.
	int plus(int n01, int n02){
		cal="+";
		sum=n01+n02;
		return sum;
	}
	int minus(int n01, int n02){
		cal="-";
		sum=n01-n02;
		return sum;
	}
	int multi(int n01, int n02){
		cal="*";
		sum=n01*n02;
		return sum;
	}
	int div(int n01, int n02){
		cal="/";
		sum=n01/n02;
		return sum;
	}	
	// ���ڸ� �Է��ϰ� �����ڸ� ������ ���ϴ� ��� �������� ������ 
	// �ϴ� �޼��� ����..
	void print(int num01, int num02, String cal){
		// �Էµ� cal�� ���������� �ִ� cal�� �Ҵ�.
		this.cal=cal;		
		if(cal.equals("+")){
			sum=plus(num01,num02);
		}
		if(cal.equals("-")){
			sum=minus(num01,num02);
		}
		if(cal.equals("*")){
			sum=multi(num01,num02);
		}
		if(cal.equals("/")){
			sum=div(num01,num02);
		}		
		System.out.println(num01 +" "+cal+" "+num02 +" = "+ sum );
	}
}

public class A04_MethodFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c01 = new Calcu();
		int num01=4;
		int num02=5;
		System.out.println(num01 +" + "+num02 +" = "+ c01.plus(num01, num02));
		// �Է°��� �����ڸ� �Ѱ���.. ȭ�鿡 ��±��� ó���ϴ� ����..
		c01.print(25, 13, "-");
	}
/*
Ȯ�ο���..
1�ܰ� 
BookStore ����..
���� : ������, ����, ����, ��
�޼��� : 
  buyBook 
  	�Է°� : ������� ����, ����
  	return : ���Ȱ�
  showCalcu
    ��� exp : java�Թ�  �ܰ� 25000  2��  �� : 50000
2�ܰ�
�� buyBook�� ���ؼ� ������ ������ ������ �� ������.
showCalcu �޼��带 ���ؼ� ������ �������� ������ �Ʒ� �������� ���
       ���� ���� ����
   java  25000  2 50000
   jsp   33000  1 33000
        ��        83000
        
        
        



 * 
 * */
}
