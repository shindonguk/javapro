package javastart.f01_api;

import java.util.Random;

public class A02_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Random 
nextInt(����) :0���� ���������� ������ ������ return
nextFloat(����) : 0.0~�������� ������ �Ǽ��� return
nextBoolean() : ������ ����(true/false)�� return
 * */
		Random rd = new Random();
		// 1~100���� ������ ������ ��return
		int ranInt=rd.nextInt(100);
		System.out.println("1~100���� ������ �� return:"+ranInt);
		float ranFlat=rd.nextFloat();//�Ǽ��� return
		System.out.println("�Ǽ��� return:"+ranFlat);
		boolean ranBoolean=rd.nextBoolean();// boolean�� return
		System.out.println("boolean�� return:"+ranBoolean);
/*
 Ȯ�ο���
 1. 1~6���� ������ �ֻ��� �ΰ� �� ���(�ջ�)
 2. Boolean�� �̿��ؼ� ���� ��/�޸� ���Ƿ� ����ϱ�
 3. �迭�� ���� �Ҵ��ϰ�..
    ����, ����, ��  ���Ƿ� �ΰ� �� ����ϱ�..
    A:����   B:����

 */		
		
		
	}

}
