//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for(int x=0;x>=0;x++) {
			if(x <10) {
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			System.out.println("Nothing");
		} else if (randomNumber == 1) {
			System.out.println("We Are Number One");
		} else if (randomNumber == 2) {
			System.out.println("Two is a lucky number");
		} else if (randomNumber == 3) {
			System.out.println("Three is an unlucky number");
		} else  {
			System.out.println("FOOOOOOUR!(Jhin)");
		} 

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
}
}
