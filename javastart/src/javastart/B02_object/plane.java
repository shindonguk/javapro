package javastart.B02_object;
import java.sql.Array;
import java.util.Arrays;
import java.util.Calendar;

class Schedule{
	//날짜
	String date;
	//시간
	int time1; //시작
	int time2; //끝
	//일정내용
	String memo;
	//소요시간
	int delate;
	int sort;
	String[] rearray = new String[5];
	Schedule(String memo, String date, int time1,int time2, int sort){
		this.date=date;
		this.time1=time1;
		this.time2=time2;
		this.sort=sort;
		this.memo=memo;
	}
	void show(){
		delate = time2-time1;
		
		System.out.println(rearray);
	}
	
}
	
public class plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schedule sch = new Schedule("", "", 0,0,0);
		Calendar day = Calendar.getInstance();
		int t = day.get(Calendar.HOUR_OF_DAY);
		int[] old= new int[4];
		Schedule[] plan= {new Schedule("안녕하세요","2016/1/4",t,12,5),
				          new Schedule("반가워요  ","2015/5/4",t,13,4),
				          new Schedule("잘있어요  ","2011/4/4",t,11,3),
				          new Schedule("다시만나요","2013/6/4",t,2,2),
				          new Schedule("아침해가 뜨면","2010/7/4",t,10,1)
		};
	/*	for(int a=0;a<plan.length;a++){
			old[a]= plan[plan.langht]-1;
		}
		for(int =0; y<plan.length;y++){
			for(int x=0;x <plan.length;x++){
			
				plan[a].show();
		}
			for(int y=0;y<plan.length;y++){
				if(plan[5] > plan[]){
					
				}
			}
		}*/
		
		
		
		/*	Calendar day = Calendar.getInstance();
		String a = "";
		System.out.println("시간(0~23): " + day.get(Calendar.YEAR));
		System.out.println("시간(0~23): " + day.get(Calendar.HOUR_OF_DAY));
		a+=day.get(Calendar.DATE)+"일"+day.get(Calendar.HOUR_OF_DAY);
		System.out.println("시간(0~23): " + a);
		*/

		/*
		 * 확인예제
		 * 1단계
		 * 
		 * 	월간 계획표 작성.
		 * 	Schedule
		 * 		속성: 일정내용, 날짜, 시간(언제), 소요시간
		 * 		매서드: showSchedule() 계획내용, 날짜/시간, 소요시간 출력
		 * 	계획 5개를 배열로 만들어 해당 매서드를 호출하는 순간 출력되게 처리.
		 * 
		 * 2단계	
		 * 	위 내용에 속성값 우선순의를 입력하여,
		 * 	초기에는 우선순위를 임의로 넣고 출력할때 우선순위가 높은 것부터 출력하게 처리
		 */
		//String[] shedule
		
	}

}
