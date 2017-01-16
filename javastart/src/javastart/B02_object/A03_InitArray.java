package javastart.B02_object;

import java.util.Arrays;
import java.util.Calendar;
public class A03_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 배열 선인과 초기데이터 활당
 * cf) 자바스크립트 {}: 객체, []배열
 * 		자바{}: 배열
 * 
 * 		선언 = {배열 데이터1, 배열 데이터2, 배열 데이터3};
 * 
 * for 문에서 배열형태의 데이터 매핑
 * for(단위객체 참조변수:배열객체)
 */
		String[] students = {"홍길동","김길동","신길동",};
		for(int idx=0;idx<students.length;idx++)
			System.out.println(idx+1+"번"+students[idx]);
		
		System.out.println("for(단위객체 참조변수:뱌열객체)");
		for(String student:students){
			System.out.println(student);
		}
		/*
		 * 1단계 확인예제
		 * 과목명: 국어, 영어, 수학
		 * 점수:   ??	??	??
		 * 올 데이터 선언과 할당을 바로하면서 처리하시오.
		 * for(단위객체: 배열객체)형태로 출력하세요.
		 * 
		 * 2단계: 평균점수, 출력하고, 최저점수 - 과목명
		 */
		int sum =0;
		String[] val = {"","",""};
		String[] datas = {"국어","영어","수학"};
		int[] point = {80,90,70};
		System.out.print("과목명: \t");
		for(String alldata:datas){
				System.out.print(alldata+"\t");
			}
		System.out.println();
		System.out.print("점수: \t");
		
		for(int allpoint:point){
				System.out.print(allpoint+"\t");
				sum += allpoint;
			}	
		System.out.println();
		System.out.println("평균: \t"+(sum/3));
		for(int a =0; a<3;a++){val[a] += point[a]+datas[a];}
		Arrays.sort(val); 
		System.out.println("최저점수 과목: \t"+val[0]);

		/*
		 * int tot = 0;
		 * int lowidx = 0; 
		 * int lowpnt = 0; //초기값 setting
		 * 				   //최저값 - 나올 수 있는 값중 최저값을 setting	
		 * 				   //최고값 - 0
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