package javastart.A05_loop;

public class A04_restudi {
	public static void main(String[] args) {
		int tot =0;
		int spend = 0;
		int inc = 0;
		
		System.out.println("\t수입/지출 항목(1단계)");
		for(int a=0; a<args.length;a++){
			if(a%3==0)
				System.out.println(args[a]);
			if(a%3==1)
				System.out.println(args[a]);
			}System.out.println("총수입액"+tot);
			
			
			System.out.println("");
			System.out.println("\t수입/지출 항목(2단계)");
			System.out.println("no\t항목\t수입액\t지출액\t현잔액");
			for(int a=0; a<args.length/3;a++){
				inc=Integer.parseInt(args[a*3+1]);
				spend = Integer.parseInt(args[a*3+2]);
				tot+=(inc - spend);
				System.out.println((a+1)+"\t");	
				System.out.println(args[a*3]+"\t");	
				System.out.println(inc+"\t");
				System.out.println(spend+"\t");	
				System.out.println(tot+"\t");	
			}
			
		for(int a=0; a<args.length/3;a++){
			if(args[a*3+2].equals("수입")){
				inc=Integer.parseInt(args[a*3+2]);
				spend = 0;
			}else{
				spend = Integer.parseInt(args[a*3+1]);
				inc = 0;
			}
			tot+=(inc - spend);
					
			System.out.println((a+1)+"\t");	
			System.out.println(args[a*3]+"\t");	
			System.out.println(inc+"\t");
			System.out.println(spend+"\t");	
			System.out.println(tot+"\t");	
		}
	}
}
