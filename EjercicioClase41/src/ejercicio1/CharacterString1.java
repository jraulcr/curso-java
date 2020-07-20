/**
 * 
 */
package ejercicio1;

import java.util.Scanner; 
/**
 * @author Juan Raúl Crespo
 *
 */
public class CharacterString1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); 
        String name1, name2; 
        int age1, age2;         
        System.out.print ("Enter name:"); 
        name1 = keyboard.next(); 
        System.out.print ("Enter age:"); 
        age1 = keyboard.nextInt (); 
        System.out.print ("Enter name:"); 
        name2 = keyboard.next (); 
        System.out.print ("Enter age:"); 
        age2 = keyboard.nextInt (); 
        System.out.print ("The oldest person is: ");         
        if (age1 > age2) {
            System.out.print (name1);
        }else {
            System.out.print(name2);
        }
	}
}
