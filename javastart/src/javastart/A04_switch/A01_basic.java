package javastart.A04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch case 
		 * switch�� ������ �����Ͱ� param��(�ܺο��� �Է�)���� �Էµ� ��,
		 * case�� ���� �ٸ� ó���� �� �� �ְ� �����ִ� �б⹮
		 * 
		 * 
		 * switch(param��){ // param���� �Ϲ������� ��������, ���ڿ��� jdk������ ���� �Է��� �����ϴ�.
		 * 						ex) int cho = 4;
		 * 							switch( cho )
		 * 		case param���� Ư��1������ �ö�:
		 * 			ó���� ���μ���
		 * 		case param���� Ư��2������ �ö�:
		 * 			ó���� ���μ���
		 * 		default: ������ ������ ���� ���� ��,
		 * 			ó���� ���μ���
		 */
		/*
		int choiceBtn = 5; //2�� ��ư�� Ŭ������ ��,
		switch( choiceBtn ){ 
			case 1: 								// 1�� ��ư ����
				System.out.println("1�� ���� ����");  // ó���� ���μ���
				break;								// case1�� ���� ���� �� ��������
			case 2:									// 2�� ��ư ����
				System.out.println("2�� ���� ����");  // ó���� ���μ���
				break;								// case2�� ���� ���� �� ��������
			case 3:									// 3�� ��ư ����
				System.out.println("3�� ���� ����");  // ó���� ���μ���
				break;								// case3�� ���� ���� �� ��������
			case 4:									// 4�� ��ư ����
				System.out.println("4�� ���� ����");  // ó���� ���μ���
				break;								// case4�� ���� ���� �� ��������
			default:								// switch���� case���̶� ���� �������
				System.out.println("�� ��ư");   // ó���� ���μ���
				break;								// default�� ���� ���� �� ��������	
		}System.out.println("�ٽ� �Է��ֿ�");
		
		*
		*/
		int bugernum = Integer.parseInt(args[0]);
		switch( bugernum ){ 
		case 1: 								
			System.out.println("������� 4000��"); 
			break;								
		case 2:									
			System.out.println("�Ұ����� 5000��");  
			break;								
		case 3:									
			System.out.println("ġ����� 4500��");
			break;
		default:									
			System.out.println("�ٸ��� ���Ⱦ�");
			break;
	}
		
		
		
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]);
		int avr = (kor+eng+mat)/3;
		String gre = "";
		switch( avr/10 ){ 	
			case 10:									
			case 9:									
				gre = "A";
				break;	
			case 8:									
				gre = "B";
				break;
			case 7:									
				gre = "C";
				break;
			case 6:									
				gre = "D";
				break;
			default:								
				gre = "F";
				break;
		}
		
		System.out.println("����: "+kor+"");
		System.out.println("����: "+eng+"");
		System.out.println("����: "+mat+"");
		System.out.println("���: "+avr+"");
		System.out.println("�� ��� ����: "+gre+" ");
	}		

}
