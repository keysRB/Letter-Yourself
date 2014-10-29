//Purpose: Print a letter to yourself stating your name and address. Formatting should be included around info.

public class LetterToYourself {

	public static void main(String[] args) {
		String horizLine = "+---------------------------------------------------------+"; // Form top & bottom
		//int formatCheck = 0; 
		int lineCount = 0; //Count number of lines.


		
		while (lineCount < 10) { //Check to see if box should be finished.
			if (lineCount == 0) {
				System.out.println(horizLine); //Print Top Format Line
				lineCount++;
			} else if (lineCount == 1) {
				System.out.println("|						     #### |");
				lineCount++;
			} else if (lineCount == 2) {
				System.out.println("|						     #### |");
				lineCount++;
			} else if (lineCount == 3) {
				System.out.println("|						     #### |");
				lineCount++;
			} else if (lineCount == 4) {
				System.out.println("|						          |");
				lineCount++;
			} else if (lineCount == 5) {
				System.out.println("|						          |");
				lineCount++;
			} else if (lineCount == 6) {
				System.out.println("|			KEYS RB               		  |");
				lineCount++;
			} else if (lineCount == 7) {
				System.out.println("|			1 Address Way         		  |");
				lineCount++;
			} else if (lineCount == 8) {
				System.out.println("|			New York, NY 12345    		  |");
				lineCount++;
			} else if (lineCount == 9) {
				System.out.println("|						          |");
				System.out.println(horizLine);
				lineCount++;
			}
		}
	}

}
