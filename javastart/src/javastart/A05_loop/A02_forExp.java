package javastart.A05_loop;

public class A02_forExp {
	public static void main(String[] args) {
		/*
		 * for문 활용
		 * 1.배열과 함께 데이터 입력처리
		 * 	배열 length: 배열의 크기를 출력
		 * 2.배열은 [index]로 접근할 수 있다.
		 * 	3개의 크기배열, 0, 1, 2까지 가질수 있다.
		 * 
		 */
		System.out.println("입력된 데이터 크기: "+args.length);
		//0부터 시작해서 배열의 크기보다 1작을 때까지 가져온다.
		int price = 0;
		int cnt = 0;
		//int tot = 0;
		for(int idx=0;idx<args.length;idx++){
			System.out.print(args[idx]+"\t");
			if(idx%3==1){
				price = Integer.parseInt(args[idx]);
		}
			if(idx%3==2){// 0: 과일명 1: 단가 2: 수량
				// % 이용해서 수량일 때 줄바꿈 처리
				cnt = Integer.parseInt(args[idx]);
				System.out.print((price*cnt));
				System.out.println();
				//tot(price*cnt)
			// 홀수 배열의 데이터만 가져오고 싶다.
			/*if(idx%2 == 1){
			System.out.println("배열 args["+idx+"]"+args[idx]);*/
		}
		}		
	}
}

