/*
 * 1�ܰ�
 * Hope //���� ���...��ü class
 * ����
 * ���ڿ�(String) hope01// ù��° ���
 * ���ڿ�(String) hope02// �ι�° ���
 * ���ڿ�(String) hope03// ����° ���
 * ���ڿ�(String) hope04// �׹�° ���
 * ����(int) newYear	   // ���س⵵
 * ���ڿ�(String) orgRnd// ���ض�?

 *�ż��� showMyHope()
 *	@@@�⵵ @@@�� ���ؿ� ���� �������
 *	1. @@@@
 *	2. @@@@
 *	3. @@@@
 */


package javastart.B01_object;
import java.util.Calendar;import java.util.spi.CalendarDataProvider;
import java.lang.invoke.SwitchPoint;
import java.sql.Array;
import java.util.Scanner;

class Man{
	String name;
	int age;
	void  printAll(){
		System.out.print("�̸���"+name);
		System.out.print(", ���̴�"+name+"��!!");
	}	
}

class showMyHope{
	String hope="";
	String orgRnd = "";
}

public class A02_ObjMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyHope show = new showMyHope();
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		int a = 1;
		int newyear = cal.get(Calendar.YEAR);
		
		for(;;){
			System.out.print("���ؿ� ���� ��������� �����ּ���: ");
			show.hope += (a++)+"\t"+scan.nextLine()+"\n";
		
		switch((newyear-1)%12){
		case 0:
			show.orgRnd = "��";
			break;
		case 1:
			show.orgRnd = "��";
			break;
		case 2:
			show.orgRnd = "����";
			break;
		case 3:
			show.orgRnd = "��";
			break;
		case 4:
			show.orgRnd = "��";
			break;
		case 5:
			show.orgRnd = "ȣ����";
			break;
		case 6:
			show.orgRnd = "�䳢";
			break;
		case 7:
			show.orgRnd = "��";
			break;
		case 8:
			show.orgRnd = "��";
			break;
		case 9:
			show.orgRnd = "��";
			break;
		case 10:
			show.orgRnd = "��";
			break;
		case 11:
			show.orgRnd = "������";
			break;
		}
		System.out.println(newyear+"�⵵\t"+show.orgRnd+"�� ���ؿ� ���� �������");
		System.out.println(show.hope);

		}
	}

}
