/**
 * 
 */
package ejercicio1;

import java.util.Scanner;

/**
 * @author Juan Raúl Crespo
 *
 */
public class CharacterString2 {
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner (System.in); 
        String apenom1, apenom2; 
        int age1, age2;         
        System.out.print ("Enter last name and first name:"); 
        apenom1 = keyboard.nextLine ();         
        System.out.print ("Enter age:"); 
        age1 = keyboard.nextInt ();         
        System.out.print ("Enter last name and first name:"); 
        keyboard.nextLine ();         
        apenom2 = keyboard.nextLine ();         
        System.out.print ("Enter age:"); 
        age2 = keyboard.nextInt ();         
        System.out.print ("The oldest person is: ");
        if (age1 > age2) {
            System.out.print(apenom1);
        } else {
            System.out.print(apenom2);
        }
	}
}
