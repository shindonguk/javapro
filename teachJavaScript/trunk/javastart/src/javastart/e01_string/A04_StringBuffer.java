package javastart.e01_string;

public class A04_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 greetSbf.toString() : String으로 변환됨..
		 애국가 검색..
		 1절을 기본 데이터롤 한 후.
		 1. 2,3,4절을 추가하고 출력..
		 2. 문자열 "일세"라는 검색한 후에 "입니다"로 변환(모두다)
		 3. "우리"라는 문자열 위치 확인 후, 삭제하고 해당 위치에
		    "대한민국"으로 삽입.
		 */
		String init="1. 동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세\n";
		StringBuffer song = new StringBuffer( init );
		song.append("2. 남산 위에 저 소나무 철갑을 두른 듯 바람 서리 불변함은 우리 기상일세\n");
		song.append("3. 가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세\n");
		song.append("4. 이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세\n");
		System.out.println("초기.");
		System.out.println(song);
		System.out.println("일세==>입니다.");
		song = new StringBuffer(song.toString().replace("일세","입니다"));
		System.out.println(song);
		String searchStr="나라";
		String insertStr="대한민국";
		int schIdx=0;
		int len=searchStr.length();
		while(true){
			schIdx=song.toString().indexOf(searchStr);
			// indexOf 문자열 검색..
			// 검색이 안되면 index -1로 return
			if(schIdx==-1){
				break; // 
			}
			// 검색 indx에서 검색할 문자열 크기+1
			song.delete(schIdx, (schIdx+len+1));
			song.insert(schIdx, insertStr);	
			System.out.println("나라==>대한민국 변경 후..");
			System.out.println(song);			
		};

		
		
		
	}

}
