package javastart.A05_loop;

public class A03_test {
	public static void main(String[] args) {
		/*
		 * 1. 단계
		 * 데이터 args로 아래와 같은 데이터가 있다. 
		 * 급여 300,000 0 마트 0 100,000 옷구매 0 50,000
		 * 알바 100,000 0
		 * 1)수입/지출 항목을 출력하시오
		 * 2)총수입액
		 * 
		 * 
		 * 2. 단계
		 * 위 데이터를 아래의 형시을 출력하세요.
		 * 가계부
		 * no	항목	  지출액   현잔액
		 * 1     급여	     0	 300,000	
		 * 
		 * 		for(int leng=0;leng< args.length;leng++){
			System.out.print(args[leng]+"\t");
			System.out.print("총수입액: "+args[leng]+"\t");
		 * 3. 단계
		 * 급여    300,000  수입  마트  100,000  지출  옷구매  50,000 지출
		 */
		System.out.println("------1단계------");
		int num=0;
		String label = ""; 
		int x = 0;
		int y = 0;
		int z = 0; 
		System.out.println("수입\t지출");
		for(int a=0;a<args.length;a++){ 

			if(a%3==1){
				x += Integer.parseInt(args[a]);
			System.out.print(args[a]+"\t");
			}else if(a%3==2){
				y += Integer.parseInt(args[a]);
				System.out.print(args[a]+"\t");
				}else {System.out.println();
				}
		}
		System.out.println();
		System.out.println("총수입액: "+(x-y));
		System.out.println();
		System.out.println();
		System.out.println("------2단계------");
		System.out.println("no\t항목\t지출\t현제잔액");
		for(int a=0;a<args.length;a++){ 
			if(a%3==0){
			++num;
			
			System.out.print(num+"\t");	
			System.out.print(args[a]+"\t");
			}else if(a%3==1){
				x = Integer.parseInt(args[a]);
				z+=x;
			}
			else {
				y = Integer.parseInt(args[a]);
				System.out.print(args[a]+"\t");		
				System.out.print((z-y));
				System.out.println();}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("------3단계------");
		for(int a=0;a<args.length;a++){ 
			if(a%3==0){
			System.out.print(args[a]+"\t");
			}else if(a%3==1){
				x = Integer.parseInt(args[a]);
				if(x==0){}else{System.out.print(args[a]+"\t");}
			}
			else {y = Integer.parseInt(args[a]);
				if(y==0){}else{System.out.print(args[a]+"\t");}
				if(x==0){System.out.print("지출\t");}else
				if(y==0){System.out.print("수입\t");}		
				}
				}
			}
		}
