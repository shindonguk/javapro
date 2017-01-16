package javastart.d01_inherit;
class Job{
	String name;
	
	public void setName(String name){
		this.name=name;
	}
	public void working(){
		System.out.println(name+" 일을 하다!");
	}
}
class PoliceMan extends Job{
	private String kind;
	public PoliceMan(){
		kind="경찰";
	}
	
	public void spWorking(){
		System.out.println(kind+"인" + name+"이 도둑을 잡다.");
	}
}
public class A02_basicExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
