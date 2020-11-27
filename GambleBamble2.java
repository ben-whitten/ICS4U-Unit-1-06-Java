/*
* The GambleBamble2 program implements an application that
* generates a random numberfrom 1 to whatever the user puts as the max.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-24 
*/

import java.util.Scanner;  // Import the Scanner class

public class GambleBamble2 {
  /**
   * Function which generates a random number.
   */
  static int rollDie(int maxValue) {
    final int numberTemp = (int) (Math.random() * maxValue + 1);
      
    return numberTemp;
  }

  /**
   * This function handles the input and output of the program.
   */
  public static void main(String[] args) {
    try {
      //Getting the max number from user.
      Scanner scan = new Scanner(System.in);
      System.out.println("Insert the maximum number to roll:");
      int maxValue = scan.nextInt();
      // Getting the value back from rollDie.
      int numberRolled = rollDie(maxValue);
      // Outputing the rolled number.
      System.out.println("The rolled number is: " + numberRolled);
    } catch (Exception e) {
      System.out.println("ERROR: Invalid Input");
    }
  }
}
