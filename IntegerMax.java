/*
 * finding the maximum number in given three integers
 */
public class IntegerMax {

	public static void main(String[] args) {
		System.out.println("***Welcome to the Test Maximum program***");
		Integer num1 = 9;
		Integer num2 = 1;
		Integer num3 = 5;
		/*
		 * putting the conditions in if else statement to satisfy the condition and
		 * printing the output
		 * 
		 */

		if (num1.compareTo(num2) == 1 && num1.compareTo(num3) == 1) {
			System.out.println("First number is maximum and number is : " + num1);

		} else if (num2.compareTo(num1) == 1 && num2.compareTo(num3) == 1) {
			System.out.println("Second number is maximum and number is : " + num2);

		} else {
			System.out.println("Third number is maximum and number is : " + num3);
		}

	}

}