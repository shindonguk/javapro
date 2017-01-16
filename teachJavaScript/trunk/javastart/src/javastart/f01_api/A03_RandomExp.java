package javastart.f01_api;

import java.util.Random;

public class A03_RandomExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		// 1번주사위
		int num01=rd.nextInt(6)+1;
		// 2번 주사위
		int num02=rd.nextInt(6)+1;
		// 주사위 합산
		int sum=num01+num02;
		System.out.println("주사위 두개 합산:"+sum);
		System.out.println("동전 앞 뒷면:"+(rd.nextBoolean()?"앞면":"뒷면"));
		String games[]={"가위","바위","보"};
		System.out.print("A:"+games[rd.nextInt(3)]+"\t");
		System.out.print("B:"+games[rd.nextInt(3)]+"\t");
		
		
		
	}

}
