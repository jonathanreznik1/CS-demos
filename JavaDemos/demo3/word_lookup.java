// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Also useful to set breakpoints and show how debugging works in java
// using breakpoints on lines 32, 37, 39, 42

// Importing input output classes
import java.io.*;
import java.util.Scanner;

// Main class
public class word_lookup{

	// main driver method
	public static void main(String[] args) throws Exception
	{

		// Creating an object of BufferedReader class
		File file = new File("words_alpha.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);  

        // Console input/output
        System.out.println("Lookup a word in the English dictionary.");
        System.out.println("Enter word: ");
        String word = input.nextLine();  // Read user input
        
        // Declaring a string variable and initializing a boolean variable
		String st;
        boolean found = false;

        // Looping through through the words file for the word specifically
		while ((st = br.readLine()) != null)
            //Use .equals() to check for a match
			if(st.equals(word)){    //breakpoint
                System.out.println("The word "+word+" is in the english dictionary.");
                found = true;   //word is found
            }
        // Handle the case when the word is not found
        if(found==false)
            System.out.println("The word "+word+" is not in the english dictionary.");
    }
}
        