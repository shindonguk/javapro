package javastart.d01_inherit;

class gameManager{
	Hero player1;
	Hero player2;
	int maxhp01;
	int maxhp02;	
	
	
	public gameManager(Hero player1,Hero player2){
		this.player1=player1;
		this.player2=player2;
		
	}
	
	public int getAttack1(){
		return player2.getheaPt()-player1.getattPt();
	}
	
	public int getAttack2(){
		return player1.getheaPt()-player2.getattPt();
	}
	
	public int getCriAtt1(){
		return player2.getheaPt()-player1.getcriPt();
	}
	
	public int getCriAtt2(){
		return player1.getheaPt()-player2.getcriPt();
	}
	
	public void Battle(){
		maxhp01=player1.getheaPt();
		maxhp02=player2.getheaPt();
		
		
		while (maxhp01>0 && maxhp02>0){	
			double rand= Math.floor(Math.random())*10;
			if(rand<7){
				maxhp02-=player1.getattPt();
				System.out.println("player1 :"+player1.kind+" ������ : "+player1.getattPt());
				System.out.println("player1 :"+player1.kind+" ü�� : "+maxhp01+"    "+"player2 :"+player2.kind+" ü�� : "+maxhp02);
				System.out.println("====================================================");
				maxhp01-=player2.getattPt();
				System.out.println("player2 :"+player2.kind+" ������ : "+player2.getattPt());
				System.out.println("player1 :"+player1.kind+" ü�� : "+maxhp01+"    "+"player2 :"+player2.kind+" ü�� : "+maxhp02);
				System.out.println("====================================================");
			}else if(rand>=6){
				maxhp02-=player1.getcriPt()*2;
				System.out.println("player1 :"+player1.kind+" ������ : "+player1.getcriPt()*2);
				System.out.println("player1 :"+player1.kind+" ü�� : "+maxhp01+"    "+"player2 :"+player2.kind+" ü�� : "+maxhp02);
				System.out.println("====================================================");
				maxhp01-=player2.getcriPt()*2;
				System.out.println("player2 :"+player2.kind+" ������ : "+player2.getcriPt()*2);
				System.out.println("player1 :"+player1.kind+" ü�� : "+maxhp01+"    "+"player2 :"+player2.kind+" ü�� : "+maxhp02);	
				System.out.println("====================================================");
			}
		}	
		if(maxhp01<=0){
			System.out.println(player2.kind+" Win!!");

		}
		if(maxhp02<=0){
			System.out.println(player1.kind+" Win!!");						
		}
	}
}

abstract class Hero{
	protected String kind;
	private int attPt;
	private int heaPt;
	
	
	public Hero(String kind,int attPt,int heaPt){
		this.kind = kind;
		this.attPt = attPt;
		this.heaPt = heaPt;
		
	}
	
	public int getcriPt(){
		 return attPt;
	}
	
	public int getattPt(){
		return attPt;
	}
	
	public int getheaPt(){
		return heaPt;
	}
	public String getKind(){
		return kind;
	}
	
	


	
	public void attack(){
		System.out.println(kind+"��"+getattPt()+" �������� �ݴϴ�.");
	}
	public abstract void spAttack();
	
}

class Tracer extends Hero{
	
	public Tracer() {
		super("Ʈ���̼�",20,200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println(kind+"�� ġ��Ÿ "+getcriPt()+"�� �����ϴ�.");
	}
	
}
class Repper extends Hero{
	
	public Repper() {
		super("����",30,200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spAttack() {
		// TODO Auto-generated method stub
		System.out.println(kind+"�� ġ��Ÿ "+getcriPt()+"�� �����ϴ�.");
		
	}
}
/*
1�ܰ�
����  Hero
  ���� : kind, attPt
  �Ϲݸ޼ҵ�: attack()
  �߻�޼ҵ�: spAttack()
 
���� Tracer, Repper
   
*/


/*
2�ܰ�
	���� : heaPt(��ü��)
	�Ϲ� �޼��� : attack() return������ ����
		defend(���ݹ��� ������)
		���ݹ��� ��ŭ ü�� ����..
����
Mz �߰�

������ 2�� �κ��� ���� ������ ����..
ü���� ���� �ٴڳ��� �ش� �κ� ��..
 */
public class B02_Hero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tracer t1 = new Tracer();
		Repper r1 = new Repper();
		
		gameManager B1= new gameManager(t1,r1);
		B1.Battle();
		
		
	}

}
