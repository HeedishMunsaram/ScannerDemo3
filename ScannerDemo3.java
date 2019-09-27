import java.util.Scanner;
public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scannerObject = new Scanner(System.in);
	
	System.out.println("Next enter two words:");

	String word1 = scannerObject.next( );
	String word2 = scannerObject.next( );
	System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");
			
	String junk = scannerObject.nextLine( );
	
	System.out.println("Next enter a line of text:");
	String line = scannerObject.nextLine( );
	
	}

}
