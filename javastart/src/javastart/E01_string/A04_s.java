package javastart.E01_string;

public class A04_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* wrapper 클래스: primitive data type을 원하는 데이터 형태로 변환 및
						기능메서드 지원을 위해 객체형으로 바꾸는 것을 말한다.
		*/
			int num= 256;
			//생성자를 통한 primitive data ==> 객체화
			Integer warpInt = new Integer(num);
			System.out.println("기본문자열로 변환:"+warpInt.toString());
			//compareTo:값이 동일하면0, 적으면 -1, 크면 +1
			System.out.println("compareTo:"+warpInt.compareTo(new Integer("350")));
			
			char grade ='A';
			System.out.println("Character :"+Character.toString(grade));
			double weight = 75.5;
			System.out.println("기본문자열로 변환:"+new Double(weight).toString());
			/*
			 *  변환 처리
			 *  Integer.parseInt("정수형문자") ==> 정수
			 *  Double.parseDouble("실수형문자") ==> 실수
			 */
			String dblstr="76.7";
			System.out.println("Double.parseDouble:"+(Double.parseDouble(dblstr)+0.7));
	}

}
