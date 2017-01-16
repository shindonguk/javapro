package javastart.a02_operator;

public class A07_tripOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 3항연산자: 조건처리의 결과물을 한라인에서 true, false값에 따라 
			 * 바로 처리하고자 할 때, 쓰이는 연산자
			 * 
			 *  (조건/논리연산자)? true 일때 처리결과물: false일때 처리결과물
			 *  ex) pt >=? "합격", "불합격";
			 *  변수 할당도 가능하다
			 *  	string isPass = pt >=70? "합격": "불합격";
			 */
				
			/*
			 * 확인예제
			 * 3항연산자를 활용하여,
			 * 학점 평가를 하세요.
			 * 점수를 입력받아 아래와 같은 조건에서 결과를 출려하세요.
			 * 90이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F
			 * 	=======
			 *  획득점수
			 *  학점등급
			 */
		
		int point = 70;
		String dis = (point > 90)? "A":
					 (point>=80 && point<90)? "B":
				     (point>=70 && point<80)? "C":
				     (point>=60 && point<70)? "D":"F";	 
		System.out.println("획득점수:\t"+point+"\n학점등급:\t"+dis);
	}

}
