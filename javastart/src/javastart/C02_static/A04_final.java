package javastart.C02_static;

/*
 * 1.final
 * 	1) ������ �ƴ� ��� ��, �����͸� �������� ���� �޸𸮸� ������ �� Ȱ���Ѵ�.
 * 		�빮�ڷ� �����Ѵ�. final int Mony = 40;
 * 	2) �޼��� �տ��� ���� ���� ��Ӱ���(overriding)�� ���� ���ϰ� ó��.
 *		����Ŭ�������� �������� ���ϰ� ó�� 		
 * 	3) Ŭ������ �տ��� ���� ���� ��ӵ��� �ʰ� ó��
 * 		public final class person{}
 * */
class Memo{
	final String ETERNAL_PROMISE1="��ġ �ʴ� ���";
	final private String ETERNAL_PROMISE2="��ġ �ʴ� ���";
	public void setPromise(String inDate){
		//���ο��� �Ҵ絵 ����̱⿡ �Ұ���
		//this.ETERNAL_PROMISE2=inDate;
	}}
//�Ϲ������� ����� static ������ �빮�ڷ� ǥ���Ͽ� �Ϲ� ������ �����Ѵ�.
public class A04_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memo m = new Memo();
		//����� ���Ҵ��� ���� �ʴ´�.
		//m.ETERNAL_PROMISE1="���ϴ� ���";
	}

}