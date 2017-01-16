package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * if(조건){
			 * 			조건이 true값이 나올때, 처리할 프로세스,
			 * }
			 * 
			 * 입력 id와 passworld가 맞을 대, ???님 환영합니다.
			 * 
			 * if(조건){
			 * 		위 조건이 true일때 처리할 프로세스
			 * }else{
			 * 		위 조건이 false일 때 처리할 프로세슨
			 * }
			 *
			 */
	/*String inputid="himan";
		String password="7878";
		if(inputid.equals("himan")&&password.equals("7878")){
			System.out.println(inputid+"님 환영합니다.");
		}else{
			System.out.println("틀렸습니다. 다시 로그인 하세요");
		}
		System.out.println("행복 홈페이지");
		*/
		/*
		 * 구매물품
		 * 사과1상자: 40,000원
		 * 포도1상자: 25,000원
		 * 딸기1상자: 10,000원
		 * 입력할 내용: 번호, 상자 수. args
		 * 
		 * 선택한 번호는 ??번 ???를 선택하셨습니다.
		 * ?? 상자를 주문하셨습니다.
		 * 
		 * 5만 미만 고객: 라면5개
		 * 5~10만 고객 : 10000상품권
		 * 10만 이상 고객 : 20000원 상품권
		 */
			/*int apple = 40000;
			int grape = 25000;
			int strawbr = 10000;
			int numb = Integer.parseInt(args[0]);
			int count =  Integer.parseInt(args[1]);
			if(numb == 1){
				int sum = apple*count;
				String prn = (sum >= 100000)? "20만원 상품권":(sum>=50000 && sum<100000)? "10만원 상품권":"라면 5상자";
				System.out.println("선택한 번호는 "+numb+"번 apple 를 선택하셨습니다.\n"+count+"상자를 주문하셔셨습니다.\n사은품은 "+prn+"입니다");
			}else if(numb == 2){
				int sum = grape*count;
				String prn = (sum >= 100000)? "20만원 상품권":(sum>=50000 && sum<100000)? "10만원 상품권":"라면 5상자";
				System.out.println("선택한 번호는 "+numb+"번 grape 를 선택하셨습니다.\n"+count+"상자를 주문하셔셨습니다.\n사은품은 "+prn+"입니다");	
			}else if(numb == 3){
				int sum = strawbr*count;
				String prn = (sum >= 100000)? "20만원 상품권":(sum>=50000 && sum<100000)? "10만원 상품권":"라면 5상자";
				System.out.println("선택한 번호는 "+numb+"번 strawbr 를 선택하셨습니다.\n"+count+"상자를 주문하셔셨습니다.\n사은품은 "+prn+"입니다");	
			} else{   System.out.println("선택한 번호는 없는 번호입니다. 1~3에서 다시 골라주세요.");
	}
			*/
		
		int apple = 40000;
		int grape = 25000;
		int strawbr = 10000;
		int numb = Integer.parseInt(args[0]);
		int count =  Integer.parseInt(args[1]);
		String cho = null;
		int sum = 0;
		if(numb == 1){
			sum = apple*count;
			cho = "apple";
		}else if(numb == 2){
			sum = grape*count;
			cho = "grape"; 
		}else if(numb == 3){
			sum = strawbr*count;
			cho = "strawbr";
		}else{
			System.out.println("선택한 번호는 없는 번호입니다. 1~3에서 다시 골라주세요.");
		}
		String prn = (sum >= 100000)? "20만원 상품권":(sum>=50000 && sum<100000)? "10만원 상품권":"라면 5상자";
		System.out.println("선택한 번호는 "+numb+"번 "+cho+" 를 선택하셨습니다.\n"+count+"상자를 주문하셔셨습니다.\n사은품은 "+prn+"입니다");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
