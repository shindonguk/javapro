package javastart.a05_loop;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
for(�ʱⰪ;�Ѱ谪;����){
	�ݺ�ó���� ����..
}* */
		for(int cnt=3;cnt<=20;cnt+=5){
			System.out.print(cnt+"��°\t");
		}
		System.out.println();
/*
 * ������ ó��..
 * 2 * 1 = 2   @@ * @@ = ##
 * 2 * 2 = 4
 * 2 * 3 = 6
 * */		
		int grade=2;
		System.out.println("    "+grade+"��");
		for(int num=1;num<=9;num++){
			System.out.println(grade+" * "+num+" = "+(grade*num));
		}
/* 1�ܰ�
 	1) 5 ~ 20 ���� 1������ �������� ����ϼ���.   ex) 5 6 7 8...
 	2) 30 ~ 100 ���� 5������ �������� ����ϼ���. ex) 30 35 40 45
 	3) 1000 ���� 900���� 2�� ���ҽ��� ����ϼ���. ex) 1000 998 996
*/
		for(int cnt=5;cnt<=20;cnt++){
			System.out.print(cnt+" ");
		}
		System.out.println();
		for(int cnt=30;cnt<=100;cnt+=5){
			System.out.print(cnt+" ");
		}		
		System.out.println();
		for(int cnt=1000;cnt>=900;cnt-=2){
			System.out.print(cnt+" ");
		}		
/*   2�ܰ� : if�� Ȱ��, \n, \t Ȱ��..
    1) ������ ��ü�� ������ ���� �������� ����ϼ���.
       2��    3��        4��       5��  .....  9��
      2*1=2  3*1=3  4*1=4  5*1=5        9*1=9
      2*2=4  3*2=6  4*2=8  5*2=10       9*2=18
      2*3=6  3*3=9  4*3=12 5*3=15       9*3=27
      ....
      ..
*/		
		System.out.println();
		for(grade=2;grade<=9;grade++)
		System.out.print(grade+"��\t");
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
			for(grade=2;grade<=9;grade++)
				System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
			System.out.println();
		}
/**/		
		for(grade=2;grade<=9;grade++)
		System.out.print(grade+"��\t");	
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
			for(grade=2;grade<=9;grade++){
				System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
			}	
			// �ٹٲ�ó��..
			System.out.println();
		}
	}

}
