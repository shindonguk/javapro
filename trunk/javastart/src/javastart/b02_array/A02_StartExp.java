package javastart.b02_array;

public class A02_StartExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1�ܰ�
		 ���Ǳ⿡ �޴��� 4���� �ִ�.
		 �� �޴��� ������ ����ϱ� ����..
		 �޴��� ������ �迭�� �����Ͽ� ����ϼ���.
		 �޴���(String[])�� ���� ����ұ��?  (�޴���� ������ �����ϴ� �迭 2���� ����� ����ϼ���)
		 @@@   @@@  @@@   @@@   
		 3000  2000 1000  2000  
		*/
		String[] menus=new String[4];
		int[] prices=new int[4];
		menus[0]="�ݶ�";
		menus[1]="���̴�";
		menus[2]="ȯŸ";
		menus[3]="��ī��";
		prices[0]=1200;
		prices[1]=1000;
		prices[2]=800;
		prices[3]=900;
		for(int idx=0;idx<menus.length;idx++){
			System.out.print(menus[idx]+"\t");
		}
		System.out.println();
		for(int idx=0;idx<prices.length;idx++){
			System.out.print(prices[idx]+"\t");
		}		
		/*
		2�ܰ�
		 4���� ģ���� 0~5000 �������� ��ٸ��� �������� ������ �������.
		 ����, ������ �ݾ��� ����ϰ�, ���� ���� �ݾ��� �� ģ���� �ݾ��� ����ϼ���(�ݾ���100������)
		 1: @@@, 2: @@@, 3:@@@@, 4:@@@ 
		 �ְ� �ݾ� :@@@@

		 */	
		System.out.println();
		int []pays=new int[4];
		int top=0;
		for(int idx=0;idx<pays.length;idx++){
			// 0~50  * 100  100����ó��..
			pays[idx]=(int)(Math.random()*51)*100;
			if(top<pays[idx]){
				top=pays[idx];
			}
			System.out.print((idx+1)+":"+pays[idx]+", ");
		}
		System.out.println("\n�ְ� �ݾ�:"+top);
	}

}
