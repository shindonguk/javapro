package javastart.a05_loop;

public class A09_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� 10�� 
		/*  while( ���� ){
		 *     �ݺ��� ���� ó��...
		 * }
		 * */
		int appleCnt=0;
		while(appleCnt <10){
			appleCnt++;
			if(appleCnt==5){
				System.out.println("5���� ����");
				continue;
			}
			System.out.println("��� "+appleCnt+"���� �����Ͽ����ϴ�.");	
		}
		/* do{
		 *   �ݺ��� ���μ����� ����,
		 *   ������ ���� �ʴ��� 1���� ��µǰ� ó��..
		 * }while(����);
		 * 
		 * */
		int visitCnt=1;
		do{
			System.out.println("ȫ�浿 ���� �湮!!"+(visitCnt++)+"ȸ!!");
			
		}while(visitCnt<=0);
		System.out.println(" ����!!!!");
		
	}

}
