package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * if(����){
			 * 			������ true���� ���ö�, ó���� ���μ���,
			 * }
			 * 
			 * �Է� id�� passworld�� ���� ��, ???�� ȯ���մϴ�.
			 * 
			 * if(����){
			 * 		�� ������ true�϶� ó���� ���μ���
			 * }else{
			 * 		�� ������ false�� �� ó���� ���μ���
			 * }
			 *
			 */
	/*String inputid="himan";
		String password="7878";
		if(inputid.equals("himan")&&password.equals("7878")){
			System.out.println(inputid+"�� ȯ���մϴ�.");
		}else{
			System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �α��� �ϼ���");
		}
		System.out.println("�ູ Ȩ������");
		*/
		/*
		 * ���Ź�ǰ
		 * ���1����: 40,000��
		 * ����1����: 25,000��
		 * ����1����: 10,000��
		 * �Է��� ����: ��ȣ, ���� ��. args
		 * 
		 * ������ ��ȣ�� ??�� ???�� �����ϼ̽��ϴ�.
		 * ?? ���ڸ� �ֹ��ϼ̽��ϴ�.
		 * 
		 * 5�� �̸� ��: ���5��
		 * 5~10�� �� : 10000��ǰ��
		 * 10�� �̻� �� : 20000�� ��ǰ��
		 */
			/*int apple = 40000;
			int grape = 25000;
			int strawbr = 10000;
			int numb = Integer.parseInt(args[0]);
			int count =  Integer.parseInt(args[1]);
			if(numb == 1){
				int sum = apple*count;
				String prn = (sum >= 100000)? "20���� ��ǰ��":(sum>=50000 && sum<100000)? "10���� ��ǰ��":"��� 5����";
				System.out.println("������ ��ȣ�� "+numb+"�� apple �� �����ϼ̽��ϴ�.\n"+count+"���ڸ� �ֹ��ϼż̽��ϴ�.\n����ǰ�� "+prn+"�Դϴ�");
			}else if(numb == 2){
				int sum = grape*count;
				String prn = (sum >= 100000)? "20���� ��ǰ��":(sum>=50000 && sum<100000)? "10���� ��ǰ��":"��� 5����";
				System.out.println("������ ��ȣ�� "+numb+"�� grape �� �����ϼ̽��ϴ�.\n"+count+"���ڸ� �ֹ��ϼż̽��ϴ�.\n����ǰ�� "+prn+"�Դϴ�");	
			}else if(numb == 3){
				int sum = strawbr*count;
				String prn = (sum >= 100000)? "20���� ��ǰ��":(sum>=50000 && sum<100000)? "10���� ��ǰ��":"��� 5����";
				System.out.println("������ ��ȣ�� "+numb+"�� strawbr �� �����ϼ̽��ϴ�.\n"+count+"���ڸ� �ֹ��ϼż̽��ϴ�.\n����ǰ�� "+prn+"�Դϴ�");	
			} else{   System.out.println("������ ��ȣ�� ���� ��ȣ�Դϴ�. 1~3���� �ٽ� ����ּ���.");
	}
			*/
		
		int apple = 40000;
		int grape = 25000;
		int strawbr = 10000;
		int numb = Integer.parseInt(args[0]);
		int count =  Integer.parseInt(args[1]);
		String cho = null;
		int sum = 0;
		if(numb == 1){
			sum = apple*count;
			cho = "apple";
		}else if(numb == 2){
			sum = grape*count;
			cho = "grape"; 
		}else if(numb == 3){
			sum = strawbr*count;
			cho = "strawbr";
		}else{
			System.out.println("������ ��ȣ�� ���� ��ȣ�Դϴ�. 1~3���� �ٽ� ����ּ���.");
		}
		String prn = (sum >= 100000)? "20���� ��ǰ��":(sum>=50000 && sum<100000)? "10���� ��ǰ��":"��� 5����";
		System.out.println("������ ��ȣ�� "+numb+"�� "+cho+" �� �����ϼ̽��ϴ�.\n"+count+"���ڸ� �ֹ��ϼż̽��ϴ�.\n����ǰ�� "+prn+"�Դϴ�");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
