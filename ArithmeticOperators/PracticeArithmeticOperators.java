/***********************************************************************
 Program Name: PracticeArithmeticOperators.java
 Programmer's Name: Steven Bennett
 Program Description: Program prompts user to enter two integers.  The
 sum, difference, product, and quotient are calculated and displayed in
 tabular form.
 ***********************************************************************/
import javax.swing.JOptionPane;

public class PracticeArithmeticOperators {

	public static void main(String[] args) {
		String firstNumber; //first string entered by user
		String secondNumber; //second string entered by user
		int number1;
		int number2;
		
		//prompt for user input
		firstNumber = JOptionPane.showInputDialog("Enter first number: ");
		secondNumber = JOptionPane.showInputDialog("Enter second number: ");
		
		//convert string input to integers
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		//calculate sum, difference, product and quotient of number1 and number2
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		double quotient = number1 / number2;
		
		//display results
		JOptionPane.showMessageDialog(null, "Operation       Result\n" + number1 + " + " + number2 + "                " + sum + "\n" +
				number1 + " - " + number2 + "                 " + difference + "\n" + number1 + " * " + number2 + "                 " + product + "\n" +
				number1 + " / " + number2 + "                  " + quotient + "\n", "Results", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);

	}

}
