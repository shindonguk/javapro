package javastart.A05_loop;

public class A07_while {
	public static void main(String[] args) {
		/*
		 * ����� 10��
		 */
		int apple=0;
		while(apple<=10){
			apple+=1;
			if(apple==5){continue;}
			System.out.println("���"+apple+"���� �����ϼ̽��ϴ�.");
		}
		
		
		/*
		 * do{
		 * 		�ݺ��� ���μ����� ����,
		 * 		������ ���� �ʴ��� 1���� ��µǰ� ó��
		 * }while(����);
		 */
		int vis=1;
		do{
			System.out.println("ȫ�浿 ���� �湮!!"+(vis++)+"ȸ!!");
		}while(vis<=0);
	}
}
