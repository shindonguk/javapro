package javastart.D01_inherit;

 interface SSuck {
	 
	 void color();
}
class Redcolor implements SSuck{

		@Override
		public void color() {
			// TODO Auto-generated method stub
			System.out.println("���� ��");
		}
		
	}
class whitecolor implements SSuck{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("ȭ��Ʈ ��");
	}
	
}
class Rainbowcolor implements SSuck{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("������ ��");
	}
	
}
