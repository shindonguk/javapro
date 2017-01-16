package javastart.B02_object;

class team{
	//팀명
	String name;
	//총전적
	int totgame;
	//승수
	int vicCnt;
	//패
	int defCnt;
	//승률
	double vicRatio;
	team(String name, int vicCnt, int defCnt){
		this.name=name;
		this.totgame=vicCnt+defCnt;
		this.vicCnt=vicCnt;
		this.defCnt=defCnt;

	}
	void showCur(){
		vicRatio = vicCnt/(double)totgame;
		System.out.println(name+"\t"+totgame+"\t"+vicCnt+"\t"+defCnt+"\t"+vicRatio);
	}
}
public class B02_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		team t = new team("빵그래",20,17);
		t.showCur();
		/*
		 * 객체배열
		 * 1. 객체배열 크기선언
		 * 	객체[] 객체배열 =new person[5]; //5개 person객체가 들어갈 수 있는 배열
		 * 2. 객체배열 선언, 할당
		 * ex)person[] p = {new person("하이맨"),new person("하이맨2"),new person("하이맨3")}
		 * 3. 객체배열의 통한 메서드 활용
		 *  for(int idx=0; idx<p.lenght;idx++){
		 *  	p[idx].printAll(); //특정 배열 객체 내부에 있는 객체한개의 메서드 활용
		 *  }
		 *  for(person ps:p){
		 *  	p.printAll();
		 *  	}
		 */
		team[] tArray01 = new team[3];
		tArray01[0] = new team("두산베어즈",21,18);
		tArray01[1] = new team("넥센자이언트",19,18);
		tArray01[2] = new team("기아타이거",17,14);
		for(team tm:tArray01){
			tm.showCur();
		}
		team[] tArray02 = {new team("LA다져스",30,10),
						   new team("요미우리 자이언츠",5,27),
						   new team("삼성라이온즈",12,16),			
							};
		for(int idx=0; idx<tArray02.length;idx++){
			tArray02[idx].showCur();
		}
		

}
}
