package javastart.A04_switch;

public class A02_exp01 {
	public static void main(String[] args) {
	/*
	 * switch case���� break ���� Ȯ�ο���
	 * ���� �Է��ϰ�, �ش� ���� ������ ��©�� switch case���� Ȱ���Ͽ� ����ϼ���.
	 * 
	 * 1�ܰ�
	 * ==��� ����
	 * �Էµ� ��:
	 * �ش� ���� ������ ����:
	 * 
	 * 2�ܰ�
	 * ����� �Է�:
	 * ���� ���̿� �츦 ���
	 * ���� ���̴� ??�̸�, ��� ???�Դϴ�. �����ι�������̽�������.
	 */
	//1�ܰ�
	int mon = Integer.parseInt(args[0]);
	int lasday = 0;
	switch( mon ){ 	
	case 12: lasday = 31; break; case 11: lasday = 30; break; 
	case 10: lasday = 31; break; case 9: lasday = 30; break;
	case 8: lasday = 31; break; case 7: lasday = 31; break; 
	case 6: lasday = 30; break; case 5: lasday = 31; break;
	case 4: lasday = 30; break; case 3: lasday = 31; break; 
	case 2: lasday = 28; break; case 1: lasday = 31; break;						
}
	System.out.println("�Էµ� ��: "+mon+"");
	System.out.println("������ ��¥: "+lasday+"");
	
	//2�ܰ�
	int biryear = 1991;
	int birmon = 9;
	int birday = 18;
	String ani = "";
	switch( (biryear %= 12) +1 ){ 	
	case 12: ani = "��"; break; case 11: ani = "��"; break; 
	case 10: ani = "��"; break; case 9: ani = "��"; break;
	case 8: ani = "��"; break; case 7: ani = "��"; break; 
	case 6: ani = "��"; break; case 5: ani = "��"; break;
	case 4: ani = "��"; break; case 3: ani = "��"; break; 
	case 2: ani = "��"; break; case 1: ani = "��"; break;						
}
	System.out.println("�������: "+biryear+"��"+birmon+"��"+birday+"��");
	System.out.println("���� ���̴� "+(2016 - biryear+1)+"�̸�, ���"+ani+"�Դϴ�.");
	System.out.println(biryear %= 12);
}
}
