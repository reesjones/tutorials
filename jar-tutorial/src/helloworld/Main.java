/* Entry point for HelloWorld program
 * @author Mitch Rees-Jones
 * @created 12/15/2014
 * @modified 12/15/2014
 */
package helloworld;

import helper.Printer;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.printHelloWorld();
		printer.printToTen();
		printer.printString("Printer class brought to you by the co.reesjones.helper package!");
		System.out.println("Currently unable to import package helper");
	}
}
