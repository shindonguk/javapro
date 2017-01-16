package javastart.d01_inherit;

/*
Robot
변수 kind, attPt
일반메서드 attack()
추상메서드 spAttack()

하위
Atom
IronMan_28
 */

abstract class Robot {
	String kind;
	int attPt;
	int specialPt;
	int hp;

	public Robot(String kind, int attPt, int hp, int specialPt) {
		this.kind = kind;
		this.attPt = attPt;
		this.hp = hp;
		this.specialPt = specialPt;
	}

	int attack() {
		return this.attPt;
	}

	abstract String spAttack();

	
	public String getKind() 			{	return kind;			}
	public void setKind(String kind)	{	this.kind = kind;		}
	public int getspecialPt() 			{	return specialPt;		}
	public void setspecialPt(int attPt) {	this.specialPt = attPt;	}
	public int getAttPt() 				{	return attPt;			}
	public void setAttPt(int attPt) 	{	this.attPt = attPt;		}
	public int getHp() 					{	return hp;				}
	public void setHp(int hp)			{	this.hp = hp;			}
	
}

class Atom extends Robot{
	Atom(){
		super("Atom",30,2000,3);
		//String kind, int attPt, int hp
	}
	
	String spAttack() {
		return "메가톤 킥!";		
	}
}


class IronMan_28 extends Robot{
	 IronMan_28(){
		super("IronMan_28",20,3000,5);
		//String kind, int attPt, int hp
	}
	
	String spAttack() {
		return "태권도 제11장 태백!";		
	}
}

class Battle {
	Battle(Robot r1, Robot r2){
		int hp1;
		int hp2;
		int turn=0;
		hp1 = r1.getHp();
		hp2 = r2.getHp();
				
		int attackPoint1 = r1.getAttPt();
		int attackPoint2 = r2.getAttPt();
		int specialAttackPoint1 = attackPoint1*r1.getspecialPt();
		int specialAttackPoint2 = attackPoint2*r2.getspecialPt();
		
		System.out.println("대전! "+r1.getKind()+" VS "+r2.getKind());
		
		while(hp1 > 0 && hp2 >0){
			System.out.println("제 "+(++turn)+"턴");	

			int randomNumber1 = (int)(Math.random()*10)+1;
			int randomNumber2 = (int)(Math.random()*10)+1;
			
			if(randomNumber1 >= 9){
				System.out.println(r1.getKind()+"의 특수공격! "+r1.spAttack()+" "+r2.getKind()+"는 "
				                  +specialAttackPoint1+"의 데미지를 입었다. ("
				                  +r2.getKind()+"의 체력:"+hp2+"→"+(hp2-specialAttackPoint1)+")");
				hp2 -= specialAttackPoint1;
			}else{
				System.out.println(r1.getKind()+"의 공격! "+r2.getKind()+"는 "
								  +attackPoint1+"의 데미지를 입었다. ("
								  +r2.getKind()+"의 체력:"+hp2+"→"+(hp2-attackPoint1)+")");
				hp2 -= attackPoint1;
			}
			
			if(randomNumber2 >= 8){
				System.out.println(r2.getKind()+"의 특수공격! "+r2.spAttack()+" "+r1.getKind()+"는 "
				                  +specialAttackPoint2+"의 데미지를 입었다. ("
				                  +r1.getKind()+"의 체력:"+hp1+"→"+(hp1-specialAttackPoint1)+")");
				hp1 -= specialAttackPoint2;
			}else{
				System.out.println(r2.getKind()+"의 공격! "+r1.getKind()+"는 "
		                  +attackPoint2+"의 데미지를 입었다. ("
				          +r1.getKind()+"의 체력:"+hp1+"→"+(hp1-attackPoint2)+")");
				hp1 -= attackPoint2;		
			}
		}
		
		if(hp1 == 0 && hp2 == 0){
			System.out.println("무승부!");
		}else if(hp1 == 0){
			System.out.println(r2.getKind()+"의 승리! (남은체력 :"+hp2+")");
		}else{
			System.out.println(r1.getKind()+"의 승리! (남은체력 :"+hp1+")");
		}
	}
}

public class B02_exercise {

	public static void main(String[] args) {
		Robot t1 = new Atom();
		Robot t2 = new IronMan_28();
		Battle test = new Battle(t1, t2);

	}

}
