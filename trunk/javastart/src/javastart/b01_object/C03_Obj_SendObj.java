package javastart.b01_object;

/*
��ü vs ��ü �ι�° �̾߱�
1. ��ü�� �޼��带 ���ؼ� �ѱ��..

Man 
	�Ӽ�:Friend, �̸�

Friend
    �Ӽ�:�̸�, ����

2. �޼��带 ���ؼ� ��ü �ѱ��.
	public void setFriend(Friend f)
    �޼���� �Ϲ������� public ���������ڷ� ��� ��ü�� ���ٰ���
    void : return X, ������ �����̳�, ���μ����� ó���� �� ����.
    set�빮�ڽ���XX : �����ϴ� �޼��带 �� ��, �Ϲ����� ���� set���� �����Ͽ�
                      �빮�ڷ� �����ϴ� ��� ������ �����Ѵ�.
    Friend f  : �ܺο��� ��ü�� ���� ��, �����ϴ� ��ü ����, ���������� ����Ѵ�.
        this.f = f : ��������(this�� �Ϲ������� ����Ŭ������)�� ���������� �Ҵ�ó���ϴ� ���� 
3. Main �޼��带 ���ؼ� ���� ��ü ������ ���� ����..
    Man m01 = new Man();
    Friend f = new Friend();
    m01.setFriend( f ); // ���� ��ü�� �����ǰ�, class���� ������ �޼��忡 �´� type�� ��ü��
                           �����Ѵ�.                          
 * 
 * */
// �ϳ��� ���Ͽ��� public class�� �ϳ��� ������ �Ǳ⶧����, �ٸ� Ŭ������ ����ó��..
// �Ϲ������� public���� ����� Ŭ������� ���ϸ��� ����
class Man02{
	private String name;
	private Friend01 friend;
	public void setName(String name) {
		this.name = name;
	}
	public void setFriend(Friend01 friend) {
		this.friend = friend;
	}
	public void introMyFriend(){
		System.out.println("���̸��� "+name+" �Դϴ�.");
		System.out.println("�� ģ���� �Ұ��մϴ�.");
		// friend��ü �ȿ� showAll()�� �ֱ� ������ ó���� ����..
		friend.showAll();
	}
}
class Friend01{
	private String name;
	private int age;
	public Friend01(){}
	
	public Friend01(String name, int age) {
		super(); // �� Ŭ������ ����ϴ� ����Ŭ������ ���ϸ� �Ϲ������� 
		         // ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ������ ���Ѵ�.
				// ObjectŬ������ �⺻������();�� ȣ��..
				// �ڵ� �ҽ� gen���� ������..
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showAll(){
		System.out.println("�̸��� "+name+"�̸�, ���̴� "+age+"�� �Դϴ�.");
	}
	
}
public class C03_Obj_SendObj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend01 f = new Friend01("��ģ��",28);
		f.showAll();
		Man02 m = new Man02();
		m.setName("��浿");
		m.setFriend(f); // Man02��ü�� setFriend�� ���� Friend01��ü�� �Ҵ�..	
		m.introMyFriend();
	}

}
