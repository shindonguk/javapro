package javastart.E01_string;

public class A03_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * stringBuffer: �߰��Ǵ� �������ڿ� ó��
		 * 
		 * �ż��� append("�߰��� ���ڿ�")
		 * insert(������index,"������ ���ڿ�")
		 * delate(������ ���� index, ������ ������ ����)
		 * 
		 */
		StringBuffer greesbf = new StringBuffer("hello");
		greesbf.append("World");
		System.out.println("�߰��� :" +greesbf);
		greesbf.insert(5,"!!!");
		System.out.println("Ư�� ��ġ�� �߰� �� :" +greesbf);
		greesbf.delete(0, 5);
		System.out.println("Ư�� ��ġ�� ���� �� :" +greesbf);
		
		
/*
 * �ֱ��� �˻�
 * 1 ���� �⺻ ������ ����
 * 2,3,4 ���� �߰��ϰ� ���
 * ���ڿ� "�ϼ�"�� �˻��� "�Դϴ�"�� ��ȯ
 * "�츮"��� ���ڿ� ��ġ Ȯ�� ��, �����ϰ� �ش� ��ġ�� 
 * "���ѹα�"���� ����		
 */		
		StringBuffer korsong1 = new StringBuffer("���ع��� ��λ��� ������ �⵵��, �ϴ����� �����ϻ� �츮���󸸼�.\n");
		StringBuffer korsong2 =  new StringBuffer("�������� �� �ҳ��� ö���� �θ���, �ٶ����� �Һ����� �츮����ϼ�.\n");
		StringBuffer korsong3 =  new StringBuffer("���� �ϴ� ��Ȱ�ѵ�, ���� �������� ���� ���� �츮���� ����ܽ��ϼ�.\n");
		StringBuffer korsong4 =  new StringBuffer("�� ���� �� ������ �漺�� ���Ͽ� ���ο쳪 ��ſ쳪 �������ϼ�.");
		korsong1.append(korsong2);
		korsong1.append(korsong3);
		korsong1.append(korsong4);
		System.out.println(	korsong1);
		
		for(;;){
		korsong1.delete(korsong1.indexOf("�ϼ�"),2);
		korsong2.delete(korsong2.indexOf("�ϼ�"),2);
		korsong3.delete(korsong3.indexOf("�ϼ�"),2);
		korsong4.delete(korsong4.indexOf("�ϼ�"),2);
		System.out.println(	korsong1);
}
	}
