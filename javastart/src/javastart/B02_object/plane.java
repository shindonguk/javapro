package javastart.B02_object;
import java.sql.Array;
import java.util.Arrays;
import java.util.Calendar;

class Schedule{
	//��¥
	String date;
	//�ð�
	int time1; //����
	int time2; //��
	//��������
	String memo;
	//�ҿ�ð�
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
		Schedule[] plan= {new Schedule("�ȳ��ϼ���","2016/1/4",t,12,5),
				          new Schedule("�ݰ�����  ","2015/5/4",t,13,4),
				          new Schedule("���־��  ","2011/4/4",t,11,3),
				          new Schedule("�ٽø�����","2013/6/4",t,2,2),
				          new Schedule("��ħ�ذ� �߸�","2010/7/4",t,10,1)
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
		System.out.println("�ð�(0~23): " + day.get(Calendar.YEAR));
		System.out.println("�ð�(0~23): " + day.get(Calendar.HOUR_OF_DAY));
		a+=day.get(Calendar.DATE)+"��"+day.get(Calendar.HOUR_OF_DAY);
		System.out.println("�ð�(0~23): " + a);
		*/

		/*
		 * Ȯ�ο���
		 * 1�ܰ�
		 * 
		 * 	���� ��ȹǥ �ۼ�.
		 * 	Schedule
		 * 		�Ӽ�: ��������, ��¥, �ð�(����), �ҿ�ð�
		 * 		�ż���: showSchedule() ��ȹ����, ��¥/�ð�, �ҿ�ð� ���
		 * 	��ȹ 5���� �迭�� ����� �ش� �ż��带 ȣ���ϴ� ���� ��µǰ� ó��.
		 * 
		 * 2�ܰ�	
		 * 	�� ���뿡 �Ӽ��� �켱���Ǹ� �Է��Ͽ�,
		 * 	�ʱ⿡�� �켱������ ���Ƿ� �ְ� ����Ҷ� �켱������ ���� �ͺ��� ����ϰ� ó��
		 */
		//String[] shedule
		
	}

}
