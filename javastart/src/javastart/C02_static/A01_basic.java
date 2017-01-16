package javastart.C02_static;
class Child{
	private String name;
	private int eatCnt; // ��ü�� ����� ���� ����..
	private static int restCnt;// ��ü���� �����ϴ� ���� ��� ����
	// �����ڸ� ���� �̸� �Ҵ�
	public Child(String name){
		this.name =name;
	}
	// �ʱ�, ������� �����ϴ� �޼���..
	public void restoreApple(int addApple){
		restCnt+=addApple;
		System.out.println(name+"�� ����� ���̺� ����"
				+addApple+" ���� �߰� �Ͽ����ϴ�.");
		restCnt();
	}
	public void eatApple(){
		// ���������� ����� �Դ� ��..
		eatCnt++;
		// ���� ���� �����..
		restCnt--;
		System.out.println(name+"����� ����"+eatCnt+"�� �Ծ����ϴ�.");
		restCnt();
	}
	private void restCnt(){
		System.out.println("���� ���� ����� "+restCnt+"�� �Դϴ�.");
	}	
}
public class A01_basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child("�����");
		Child c2 = new Child("Ȳ�ֿ�");
		Child c3 = new Child("������");
		c3.restoreApple(20);
		c1.eatApple();
		c1.eatApple();
		c1.eatApple();
		c2.eatApple();
		c2.eatApple();
		c3.eatApple();
	}
}

