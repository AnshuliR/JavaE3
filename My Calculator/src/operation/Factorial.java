package operation;

public class Factorial {
	public static void factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		System.out.println("The factorial of "+n+" = "+fact);
	}
	public static void main(String[] args) {
		factorial(7);
		
	}
}
