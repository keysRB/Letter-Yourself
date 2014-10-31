//Purpose: Print a letter to yourself stating your name and address. Formatting should be included around info.
import java.util.Scanner;

public class LetterToYourself {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.printf("Please enter your first name: ");
		String firstName = userInput.nextLine();
		System.out.printf("Please enter your last name:");
		String lastName = userInput.nextLine();
		System.out.printf("Please enter your address:");
		String userAddress = userInput.nextLine();
		System.out.printf("Please enter your City, State Zip Code:");
		String userLocation = userInput.nextLine();
		
		String horizLine = "+------------------------------------------------------------+"; // Form top & bottom
		for (int i = 0; i<1; i++ ){
			System.out.println(horizLine); //Print Top Format Line
			System.out.println("|						        #### |");
			System.out.println("|						        #### |");
			System.out.println("|						        #### |");
			System.out.println("|						             |");
			System.out.println("|						             |");
		
			// *******Format name line with information to fit the box formatting: ********************
			System.out.printf("|");
			int nameLength = firstName.length() + lastName.length() + 1; // Add 1 for space between names
			int totalSpace = (60 - nameLength);
			int spaceLeft = totalSpace / 2;
			for (int j = 0; j<spaceLeft; j++ ) {  //Need to count number of spaces to print before and after name
				System.out.printf(" ");
			}
			System.out.printf(firstName + " " + lastName);
			for (int k = 0; k < spaceLeft; k++) {
				System.out.printf(" ");
			}
			System.out.println("|");
			// ****************************************************************************************
			
			// *******Format address line with information to fit the box formatting: ********************
			System.out.printf("|");
			int addressLength = userAddress.length(); // Find length of address
			totalSpace = (60 - addressLength);
			spaceLeft = totalSpace / 2;
			for (int j = 0; j<spaceLeft; j++ ) {  //Need to count number of spaces to print before and after name
				System.out.printf(" ");
			}
			System.out.printf(userAddress);
			for (int k = 0; k < spaceLeft; k++) {
				System.out.printf(" ");
			}
			System.out.println("|");
			// ****************************************************************************************
			
			// *******Format location line with information to fit the box formatting: ********************
			System.out.printf("|");
			int locationLength = userLocation.length(); // Find length of address
			totalSpace = (60 - locationLength);
			spaceLeft = totalSpace / 2;
			for (int j = 0; j<spaceLeft; j++ ) {  //Need to count number of spaces to print before and after name
				System.out.printf(" ");
			}
			System.out.printf(userLocation);
			for (int k = 0; k < spaceLeft; k++) {
				System.out.printf(" ");
			}
			System.out.println("|");
			// ****************************************************************************************
			
			System.out.println("|						             |");
			System.out.println(horizLine);
		}
	}
}
