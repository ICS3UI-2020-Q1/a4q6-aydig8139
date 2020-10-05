import java.util.Scanner;

/**
 * checks if a number is prime
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask user for a number and declare a variable to store their answer
    System.out.println("Which number would you like to check?");
    int userNum = input.nextInt();

    //declare a variable to divide the number and another variable to count the number of times the number divides without a remainder
    int divisibility = 2;

    int count = 0;

    //create a while loop to keep dividing the number
    while(userNum > divisibility){
      int quotient = userNum % divisibility;
      divisibility = divisibility + 1;

      //write if statement to count the number of times the number divides without a remainder
      if (quotient == 0){
      count = count + 1;
    } 

    //create if else statement to tell the user if the number is prime or not.
    } if (count > 0){
      System.out.println(userNum + " is not a prime number");
    }else {
      System.out.println(userNum + " is a prime number");
    }
   
  }
}
