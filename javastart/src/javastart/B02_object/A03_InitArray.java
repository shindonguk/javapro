package javastart.B02_object;

import java.util.Arrays;
import java.util.Calendar;
public class A03_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * �迭 ���ΰ� �ʱⵥ���� Ȱ��
 * cf) �ڹٽ�ũ��Ʈ {}: ��ü, []�迭
 * 		�ڹ�{}: �迭
 * 
 * 		���� = {�迭 ������1, �迭 ������2, �迭 ������3};
 * 
 * for ������ �迭������ ������ ����
 * for(������ü ��������:�迭��ü)
 */
		String[] students = {"ȫ�浿","��浿","�ű浿",};
		for(int idx=0;idx<students.length;idx++)
			System.out.println(idx+1+"��"+students[idx]);
		
		System.out.println("for(������ü ��������:�򿭰�ü)");
		for(String student:students){
			System.out.println(student);
		}
		/*
		 * 1�ܰ� Ȯ�ο���
		 * �����: ����, ����, ����
		 * ����:   ??	??	??
		 * �� ������ ����� �Ҵ��� �ٷ��ϸ鼭 ó���Ͻÿ�.
		 * for(������ü: �迭��ü)���·� ����ϼ���.
		 * 
		 * 2�ܰ�: �������, ����ϰ�, �������� - �����
		 */
		int sum =0;
		String[] val = {"","",""};
		String[] datas = {"����","����","����"};
		int[] point = {80,90,70};
		System.out.print("�����: \t");
		for(String alldata:datas){
				System.out.print(alldata+"\t");
			}
		System.out.println();
		System.out.print("����: \t");
		
		for(int allpoint:point){
				System.out.print(allpoint+"\t");
				sum += allpoint;
			}	
		System.out.println();
		System.out.println("���: \t"+(sum/3));
		for(int a =0; a<3;a++){val[a] += point[a]+datas[a];}
		Arrays.sort(val); 
		System.out.println("�������� ����: \t"+val[0]);

		/*
		 * int tot = 0;
		 * int lowidx = 0; 
		 * int lowpnt = 0; //�ʱⰪ setting
		 * 				   //������ - ���� �� �ִ� ���� �������� setting	
		 * 				   //�ְ� - 0
		 * 
		 * 
		 * 
		 * */
		int p1p=0;
		int p2p=0;
		int p3p=0;
		int p4p=0;
}
}