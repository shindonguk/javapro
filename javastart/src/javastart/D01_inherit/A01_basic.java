package javastart.D01_inherit;
/*
 * ���: is a(is a kind of)����� ������ �ִ� Ŭ������ 
 * ������ �ִ� Ŭ������ ���������� ���� �ȿ��� ��Ȱ�� �ϰ� �Ѵ�.
 * cf)���������� ������ ����� �� �� ���� �ȴ�.
 * 	has a ����: Ŭ���������� �ٸ� Ŭ���� ȣ���Ͽ� ���� ���踦 �ǹ��Ѵ�.
 */

/*class Father{
	private String name;
	int age;
	public void setDate(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void show(){
		System.out.println("�ƹ��� Ŭ����");
		System.out.println("�̸�: "+name+",\t ����"+age);
	}
}
class son extends Father{}
*/

class job{
	 String name;
	 String job;
		public void setDate(String name, String job) {
			this.name = name;
			this.job = job;
	}
		public void working(){
			System.out.println(name+"�� "+job+"���� �Ѵ�.");
		}
/*		public void spWorking(){
			System.out.println(job+"�� "+name+"�� ������ ��Ҵ�.");
		}*/
}
class Policeman extends job{

}
class FirMan extends job{
	
}
class Developer extends job{
	
}
public class A01_basic {

	public static void main(String[] args) {
		Policeman p = new Policeman();
		FirMan F = new FirMan();
		Developer D = new Developer();
		p.setDate("��ö��","����");
		F.setDate("�Ĺ�","���̾�������");
		D.setDate("�⽺��","����");
		p.working();
		F.working();
		D.working();
		
		//p.spWorking();
		// TODO Auto-generated method stub
		/*son s1 = new son();
		s1.setDate("ȫ",27);
		s1.show();*/
	}
	/*
	 * Ȯ�� ����
	 * 1�ܰ�
	 * ����: 
	 * 		jop ����: �̸�
	 * 		�ż���: working()
	 * 				???�� ���� �ϴ�
	 * 		policeMan
	 * 			����: kind="����"
	 * 			�ż���: spWorking()
	 * 					������ ???�� ������ ���.
	 * 2�ܰ�
	 * 		�� 1�ܰ� ������ ������ �ż���� ����
	 * 		������ �ʿ��� ���뺯�� ����, ������ working()���� 
	 * 		�����ؼ� ó��(���� �߰� Ŭ����)
	 * 		FirMan, Developer
	 */

}