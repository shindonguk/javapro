package javastart.b02_array;

class Schedule{
	String cont;
	String date;
	String time;
	int sphours;
	public Schedule(String cont, String date, String time, int sphours) {
		this.cont = cont;
		this.date = date;
		this.time = time;
		this.sphours = sphours;
	}
	void showSchedule(){
		System.out.println(cont+"\t"+date+"\t"+time+"\t"+sphours+"\t");
	}
	
}
class Schedule2{
	String cont;
	String date;
	String time;
	int sphours;
	int priority;
	public Schedule2(String cont, String date, 
						String time, int sphours,
						int priority) {
		this.cont = cont;
		this.date = date;
		this.time = time;
		this.sphours = sphours;
		this.priority=priority;
	}
	void showSchedule(){
		System.out.println(priority+"\t"+cont+"\t"+date+"\t"+time+"\t"+sphours+"\t");
	}
	
}
public class A06_ObjArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schedule[] monSch={
				new Schedule("여행    "," 1월 7일","09:00",48),
				new Schedule("개발회의"," 1월10일","09:00",2),
				new Schedule("고객점심"," 1월12일","12:00",1),
				new Schedule("working"," 1월21일","18:00",15),
				new Schedule("월간정산"," 1월30일","15:00",3),
				
		};
		for(Schedule s:monSch){
			s.showSchedule();
		}
		
		Schedule2[] monSch2={
				new Schedule2("여행    "," 1월 7일","09:00",48,2),
				new Schedule2("개발회의"," 1월10일","09:00",2,3),
				new Schedule2("고객점심"," 1월12일","12:00",1,1),
				new Schedule2("working"," 1월21일","18:00",15,4),
				new Schedule2("월간정산"," 1월30일","15:00",3,5),
				
		};
		System.out.println("====정렬된 리스트1====");		
		Schedule2[] orderSch= new Schedule2[5];
		Schedule2 tmp;
		for(int idx=0;idx<monSch2.length-1;idx++){
			orderSch[idx]=monSch2[idx];
			for(int odx=idx+1;odx<monSch2.length;odx++){
				if(orderSch[idx].priority>monSch2[odx].priority){
					tmp=monSch2[odx];
					monSch2[odx]=orderSch[idx];
					orderSch[idx]=tmp;
					
				}
			}	
			orderSch[idx].showSchedule();
		}		

		
		/*
		System.out.println("====정렬된 리스트2====");
		Schedule2 tmp;
		for(int idx=0;idx<monSch2.length-1;idx++){
			for(int odx=idx+1;odx<monSch2.length;odx++){
				if(monSch2[idx].priority>monSch2[odx].priority){
					tmp=monSch2[odx];
					monSch2[odx]=monSch2[idx];
					monSch2[idx]=tmp;
				}
			}	
			monSch2[idx].showSchedule();
		}
		*/		
	}

}
