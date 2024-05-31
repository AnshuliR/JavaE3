package methodShadowing;

public class ChildClass extends MethodShadow {
	static int a = 19;
	double b = 12;
	public static void m1() {
		System.out.println("From child class");
	}
	public static void main(String[] args) {
		MethodShadow m = new MethodShadow();
		m.m1();
		System.out.println(m.a+" "+m.b);
		ChildClass c = new ChildClass();
		c.m1();
		System.out.println(c.a+" "+c.b);
		MethodShadow pm = new ChildClass();
		pm.m1();
		System.out.println(pm.a+" "+pm.b);
	}
}