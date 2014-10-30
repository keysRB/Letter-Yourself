//Purpose: Print a letter to yourself stating your name and address. Formatting should be included around info.

public class LetterToYourself {

	public static void main(String[] args) {		
		printLetter(); //Call to execute printing method.
	}

	private static void printLetter() { //Display letter with information
		String horizLine = "+---------------------------------------------------------+"; // Form top & bottom
		for (int i = 0; i<1; i++ ){
			System.out.println(horizLine); //Print Top Format Line
			System.out.println("|						     #### |");
			System.out.println("|						     #### |");
			System.out.println("|						     #### |");
			System.out.println("|						          |");
			System.out.println("|						          |");
			System.out.println("|			KEYS RB               		  |");
			System.out.println("|			1 Address Way         		  |");
			System.out.println("|			New York, NY 12345    		  |");
			System.out.println("|						          |");
			System.out.println(horizLine);
		}
	}
}
