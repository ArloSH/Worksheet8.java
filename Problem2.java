public class StaticExample2 {
	private static int x = 0;
	public void mymethod () {
		x = x + 1;
	}
	
	public int getX () {
		return x;
	}
	public static void main (String[] args) {
		StaticExample2 s1 = new StaticExample2();
		s1.mymethod();
		StaticExample2 s2 = new StaticExample2();
		s2.myMethod();
		System.out.println("s1.getX() returned " + s1.getX();
	}
}
