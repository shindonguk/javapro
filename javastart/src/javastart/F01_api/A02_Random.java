package javastart.F01_api;

import java.sql.Array;
import java.util.Random;

import javastart.B01_object.ARRAY;

public class A02_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Random
		 * nextInt(����): 1���� ���������� ������ ������ return
		 * nextfloat(����): 0.0~���� ���������� ������ �Ǽ��� return
		 * nextBoolean(): ������ ������(true/false)�� return
		 */
		
		
		Random rand = new Random();
		// 1~100���� ������ ������ �� return
		int ranInt=rand.nextInt(100);
		System.out.println("1~100������ ������ �� return:"+ranInt);
		float raFlat=rand.nextFloat();
		System.out.println("1~100������ ������ �� return:"+raFlat);
		boolean ranBoolean=rand.nextBoolean();
		System.out.println("1~100������ ������ �� return:"+ranBoolean);
		/*
		 * Ȯ�ο���
		 * 1. 1~6���� ������ �ֻ��� �ΰ� �� ��� �ջ�
		 * 2. Boolean�� �̿��ؼ� ���� ��/�޸� ���Ƿ� ����ϱ�
		 * 3. �迭�� ���� �Ҵ��ϰ� ����, ����, �� ���Ƿ� �ΰ� �� ����ϱ�
		 * 		A:���� B:����
		 */
		String coins = new String();
		int[] jjang = {1,2,3};
		int[] first = new int[3];	
		
		int dise1 = rand.nextInt(6);
		int dise2 = rand.nextInt(6);
		System.out.println("�ֻ��� ���� : "+(dise1+dise2));
		
		boolean coin =rand.nextBoolean();
		if(coin == false){ coins ="��";}else
		if(coin == true){ coins ="��";};
		System.out.println("�� & ��"+coins);
		
		int game=rand.nextInt(2);
		for(int a=0; a<2; a++){
			first[a] = jjang[game];
		}
			if(first[0]==first[1]){}
		System.out.println("1~100������ ������ �� return:"+raFlat);

	}

}