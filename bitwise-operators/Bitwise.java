/* A class for exploring the more obscure Java operators, namely bitwise operators and shifts.
 * 
 * @author Mitch Rees-Jones
 * @created 12/27/2014
 * @modified 12/27/2014
 */

 public class Bitwise {
	public static void main(String[] args) {
		int a = 5;
		
		// prints 6
		System.out.println("++a=" + ++a);
		// also prints 6
		System.out.println("a++=" + a++);
		// a now 7
		System.out.println("a=" + a);

		System.out.println("~a=" + ~a);

		a = a << 1;
		System.out.println("a<<1=" + a);
	}
 }
