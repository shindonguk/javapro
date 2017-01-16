package javastart.d01_inherit;

abstract class Pizza{
	private String kind;
	private int price;
	private int cnt;
	public Pizza(String kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	public abstract String taste();
	public int order(int cnt){
		this.cnt=cnt;
		System.out.println(taste()+" " + kind+"피자 "+ price+" "+cnt+"판");
		return price*cnt;
	}
}
class Bugogi extends Pizza{
	public Bugogi() {
		super("불고기", 32000);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "불고기맛";
	}
}
class Shrimp extends Pizza{
	public Shrimp() {
		super("새우", 28000);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "통새우맛";
	}
}
class DominoBest extends Pizza{
	public DominoBest() {
		super("도미노", 25000);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "치즈콤보맛";
	}
}

public class C03_pizzWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Bugogi();
		p1.order(5);
		System.out.println("##########");
		Pizza[] orderedList = {new Bugogi(), new Shrimp(), new DominoBest()};
		int tot=0;
		for(Pizza piz:orderedList){
			tot+=piz.order((int)(Math.random()*5)+1);
		}
		System.out.println("총계:"+tot+"원");
	}

}
