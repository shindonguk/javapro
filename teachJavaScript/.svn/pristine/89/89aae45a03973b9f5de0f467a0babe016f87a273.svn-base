package javastart.d01_inherit;

// 객체에 붙는 연결고리.
interface FlyWay{
	// 인터페이스는 앞에 abstract가 항상 붙어 있다.
	// 생략가능.
	void fly();
}
// 인터페이스를 상속 받는 것은 implements
class CountryFlying implements FlyWay{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("우리 동네를 나르다!!");
	}
}
class WorldFlying implements FlyWay{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("세계를 누비다!!");
	}
	
}

class Mz{
	private String name;
	private FlyWay flyway;
	public Mz(){
		name="MZ";
	}
	public void attack(){
		System.out.println(name+"가 공격하다.");
	}
	// 실제 날개를 받을 수 있는 연결고리(interface) 장착
	public void setFlyway(FlyWay flyway) {
		this.flyway = flyway;
	}
	public void flying(){
		System.out.print(name+"가 ");
		// 인터페이스를 상속받은 실제 객체가 할당이 되면..
		if(flyway!=null){
			flyway.fly();
		}else{
			System.out.println("날개 장착되지 않아서 ...뛰기만 함.");
		}
	}
}
public class C01_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mz mz01 = new Mz();
		mz01.attack();
		mz01.flying();
		// FlyWay 상속받은 하위 객체인 CountryFlying()생성..
		CountryFlying flying = new CountryFlying();
		// FlyWay flyway= new CountryFlying();
		mz01.setFlyway(flying);
		mz01.flying();
		
		mz01.setFlyway(new WorldFlying());
		mz01.flying();
		
	
				
				
	}

}
