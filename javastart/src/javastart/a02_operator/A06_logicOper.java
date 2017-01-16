package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 논리연산자: 비교연산자(!=, ==)의 결과값을 2개이상 연결하여 연산처리할 때, 사용한다.
		 * &&(and): 두가지 조건을 다 만족시킬 때
		 * ||(or): 두가지 조건중 1개라도 만족시킬 때
		 * !(not): 조건을 반대 처리
		 * 
		 * 연령에 따른 할인율을 적용하고자 한다.
		 * 8~18: 할인율을 20%을 하면
		 * 4미만, 65이상: 할인율 100%(무료)로 하는 처리는 논리 연산자를 통하여 처리하여라.
		 */
		
		int age=3; // arg값을 입력 가능
		boolean dis20 = (age>=8 && age<=18);
		System.out.println("할인율 20%대상자(8~18)?"+dis20);
		//8세 이상이고, 18세 이하일 때 20%할인율 적용 유뮤
		boolean disNopay = (age< 4 || age>=65);
		System.out.println("할인율 100%대상자?"+disNopay);
		//4세 미만이고, 65세 이상일 때 100%할인율 적용 유뮤
		
		
		/*
		 * 확인예제
		 * 해당과목의 평균점수가 70점 이상이고, 각과목의 40점 미만 점수가 없을 때
		 * 합격처리를 한다고 한다. 이상에 해당하는 프로그램의 아래의 형식으로 출력하시오.
		 * 
		 * 최종점수
		 * 국어: ??
		 * 영어: ??
		 * 수학: ??
		 * 평균: ??
		 * 합격 여부: ??
		 */
		

		int kor=50;
		int eng=90;
		int mat=90;
		int avr = (kor+eng+mat)/3;
		boolean okcheck = (avr>=70 && kor>40 && mat>40 && eng>40);
		System.out.println("국어점수:\t"+kor);
		System.out.println("영어점수:\t"+eng);
		System.out.println("수학점수:\t"+mat);
		System.out.println("평균점수:\t"+avr);
		System.out.println("합격여부:\t"+okcheck);

		
		
	}

}
