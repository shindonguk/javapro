package javastart.D01_inherit;

 interface SSuck {
	 
	 void color();
}
class Redcolor implements SSuck{

		@Override
		public void color() {
			// TODO Auto-generated method stub
			System.out.println("·¹µå ½â");
		}
		
	}
class whitecolor implements SSuck{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("È­ÀÌÆ® ½â");
	}
	
}
class Rainbowcolor implements SSuck{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("¹«Áö°³ ½â");
	}
	
}
