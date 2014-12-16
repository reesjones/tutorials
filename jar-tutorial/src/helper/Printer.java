/* Service class that prints various things
 * @author Mitch Rees-Jones
 * @created 12/15/2014
 * @modified 12/15/2014
 */

package helper;

public class Printer {

	public static void printToTen() {
		for(int num = 1; num <= 10; num++) {
			System.out.println(num);
		}
	}

	public static void printString(String stringToPrint) {
		System.out.println(stringToPrint);
	}

	public static void printHelloWorld() {
		System.out.println("Hello World");
	}

}
