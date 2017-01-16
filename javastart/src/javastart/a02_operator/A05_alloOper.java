package javastart.a02_operator;

public class A05_alloOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		* 대입연산자: 데이터를 할당할 때, 쓰이는 연산자를 말한다.
		 * 기본 int  age = 24;
		 * 
		 * 기본데이터에 다시 데이터를 누적하여 할당 할때,
		 * age += 10;
		 *cf) -=, *=, /=, %=
		 *
		 *증강연산자: 데이터를 1단위로 증강시키는 연산자를 말한다.
		 *cnt++: 현제데이터를 1단위를 증가시킨다. 단, 증가는 다음라인에 증가가 된다.
		 *++cnt: 현제데이터를 1단위를 증가시킨다. 단, 현제라인에 증가된다.
		 *cf) cnt--, --cnt
		 *
		 * 현제 사과의 갯수에서 3회 10개씩 누적시킨 총 갯수를 출력하세요.
		 */
		
			int appleCnt = 25;
			appleCnt+= 10;
			System.out.println("1회 후, 총 사과갯수:" +appleCnt);
			appleCnt+= 10;
			System.out.println("2회 후, 총 사과갯수:" +appleCnt);
			appleCnt+= 10;
			System.out.println("3회 후, 총 사과갯수:" +appleCnt);
			/*
			 *  곰돌이 3마리에게 현제 오렌지 3, 5, 6개를 처음에 나눠 주었다.
			 *  3회 7개씩 나누어준 후, 곰돌이 3마리가 가지고 있는 총 오렌지 개수를 계산하는 프로그램을 만들어 보세요.
			 *  
			 *  ==============
			 *  			곰돌이 1		곰돌이 2 		곰돌이 3		계
			 *  1				??				??				??			??
			 *  2
			 *  3
			 */
			
			int gom1 = 3;
			int gom2 = 5;
			int gom3 = 6;
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			int sum = gom1+ gom2+ gom3;
			System.out.println("횟수\t곰돌이1\t곰돌이2\t곰돌이3\t계");
			System.out.println("1회\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			sum = gom1+ gom2+ gom3;
			System.out.println("2회\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
			gom1 += 7;
			gom2 += 7;
			gom3 += 7;			
			sum = gom1+ gom2+ gom3;
			System.out.println("3회\t"+gom1+"\t"+gom2+"\t"+gom3+"\t"+sum);
		
			
			int fruitCnt1=1;
			int fruitCnt2=1;
			System.out.println("과일의 갯수 다음 프로세스 증가:"+(fruitCnt1++));
			System.out.println("과일의 갯수 다음 프로세스 증가:"+(++fruitCnt2));
			
	}

}
