package javastart.A04_switch;

public class A02_exp01 {
	public static void main(String[] args) {
	/*
	 * switch case문의 break 관련 확인예제
	 * 월을 입력하고, 해당 월의 마지막 날짤르 switch case문을 활용하여 출력하세요.
	 * 
	 * 1단계
	 * ==출력 형식
	 * 입력된 월:
	 * 해당 월의 마지막 날자:
	 * 
	 * 2단계
	 * 생년월 입력:
	 * 현제 나이와 띠를 출력
	 * 현제 나이는 ??이며, 띠는 ???입니다. 자축인묘진사오미신유술해.
	 */
	//1단계
	int mon = Integer.parseInt(args[0]);
	int lasday = 0;
	switch( mon ){ 	
	case 12: lasday = 31; break; case 11: lasday = 30; break; 
	case 10: lasday = 31; break; case 9: lasday = 30; break;
	case 8: lasday = 31; break; case 7: lasday = 31; break; 
	case 6: lasday = 30; break; case 5: lasday = 31; break;
	case 4: lasday = 30; break; case 3: lasday = 31; break; 
	case 2: lasday = 28; break; case 1: lasday = 31; break;						
}
	System.out.println("입력된 월: "+mon+"");
	System.out.println("마지막 날짜: "+lasday+"");
	
	//2단계
	int biryear = 1991;
	int birmon = 9;
	int birday = 18;
	String ani = "";
	switch( (biryear %= 12) +1 ){ 	
	case 12: ani = "미"; break; case 11: ani = "오"; break; 
	case 10: ani = "사"; break; case 9: ani = "진"; break;
	case 8: ani = "묘"; break; case 7: ani = "인"; break; 
	case 6: ani = "축"; break; case 5: ani = "자"; break;
	case 4: ani = "해"; break; case 3: ani = "술"; break; 
	case 2: ani = "유"; break; case 1: ani = "신"; break;						
}
	System.out.println("생년월일: "+biryear+"년"+birmon+"월"+birday+"일");
	System.out.println("현제 나이는 "+(2016 - biryear+1)+"이며, 띠는"+ani+"입니다.");
	System.out.println(biryear %= 12);
}
}
