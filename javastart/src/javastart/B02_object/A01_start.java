package javastart.B02_object;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

/*class count{
	int[] sum = new int[4];
	int[] count = {0,0,0,0};
 	int allsum;

	int sum(){
		for(int a =0; a<4;a++){
		allsum +=sum[a];}
		return allsum; 	
	}
}*/
/*
 * ����Ű
 * ctrl + alt + ����Ű �Ʒ� => �ڵ� ����
 */
public class A01_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ����      =    �迭 ��ü �Ҵ�
		//tpye[] �迭�̸� = new type[�迭�� ũ��];
		Random rand = new Random();
		int how = (rand.nextInt()*4);
		int juic = (rand.nextInt()*4);
		int[] pay=new int[4];
		int x = 1;
		pay[0]=500;
		pay[1]=800;
		pay[2]=900;
		pay[3]=1000;
}
		 /*
		  * 1�ܰ� ���Ǳ⿡ �޴��� 4���� �ִ�.
		  * �� �޴��� ������ ����ϱ� ����
		  * �޴��� ������ �迭�� �����Ͽ� ����ϼ���.
		  * �޴��� ���� ���
		  * 
		  * 2�ܰ�
		  * 4���� ģ���� 0~5000�������� ��ٸ��� �������� ������ �������.
		  * ����, ������ �ݾ��� ����ϰ�, ���� ���� �ݾ��� �� ģ���� �ݾ��� ����Ͻÿ�.
		  */
}	
