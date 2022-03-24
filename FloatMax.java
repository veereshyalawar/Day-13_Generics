
/*
 * Given 3 Floats finding the maximum
 */
public class FloatMax {

	public static void main(String[] args) {
		System.out.println("***Welcome to the Test Maximum program***");
		
		Float num1 = 2.3f;
		Float num2 = 5.2f;
		Float num3 = 10.4f;
		
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