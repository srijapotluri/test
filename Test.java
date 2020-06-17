package sample;

class A {
	public int x=12;
	public static void draw() {
		System.out.println("parent");
	}
	
}

public class Test extends A {
	public int x=10;
	public static void draw() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			System.out.println("hello");
			A a=new Test();
			a.draw();
			System.out.println(a.x);
	}

}
