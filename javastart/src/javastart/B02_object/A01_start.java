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
 * 단축키
 * ctrl + alt + 단축키 아래 => 자동 복사
 */
public class A01_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언      =    배열 객체 할당
		//tpye[] 배열이름 = new type[배열의 크기];
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
		  * 1단계 자판기에 메뉴가 4개가 있다.
		  * 이 메뉴의 가격을 출력하기 위해
		  * 메뉴의 가격을 배열로 설정하여 출력하세요.
		  * 메뉴명도 같이 출력
		  * 
		  * 2단계
		  * 4명의 친구가 0~5000범위에서 사다리를 랜덤으로 게임을 만들었다.
		  * 이중, 각각의 금액을 출력하고, 가장 많은 금액을 낸 친구의 금액을 출력하시오.
		  */
}	
