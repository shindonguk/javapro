package javastart.d01_inherit;

class Job2{
	private String name;
	private String kind;
	public void setName(String name){
		this.name=name;
	}
	public void setKind(String kind){
		this.kind=kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getName() {
		return name;
	}
	public void working(){
		System.out.println(kind+"인 "+name+"가  일을 하다.");
	}
	
}
class FireMan extends Job2{
	
	public FireMan(){
		setKind("소방관");
	}
	public void working(){
		System.out.println(getKind()+"인 "+getName()+"가  불을 끄다.");
	}	
}
class Developer extends Job2{
	
	public Developer(){
		setKind("개발자");
	}
	public void working(){
		System.out.println(getKind()+"인 "+getName()+"가  프로그램 개발을 하다.");
	}	
}
public class A03_basicExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireMan f = new FireMan();
		f.setName("홍길동");
		Developer f1 = new Developer();
		f1.setName("신길동");
		f.working();
		f1.working();
		// 다형성 처리.. 상위객체 = 하위객체..
		Job2 jobArr[]={new FireMan(),new Developer()};
		for(int idx=0;idx<jobArr.length;idx++){
			jobArr[idx].setName("홍길동"+(idx+1));
			jobArr[idx].working();
		}
		
	}

}
