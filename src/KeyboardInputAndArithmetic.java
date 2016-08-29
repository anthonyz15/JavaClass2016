 //Example of keyboard input read

import java.util.Scanner;
public class KeyboardInputAndArithmetic
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
  
      int value1,
          value2,
          sum;
         
      String wordForTheResult;
     
      System.out.print("Enter the first integer   : ");
      value1 = keyboard.nextInt();
      System.out.print("Enter the second integer   : ");
      value2 = keyboard.nextInt();
      System.out.print("Enter label that will precede the result  : ");
      wordForTheResult = keyboard.next();
     
      sum = value1 + value2;


      System.out.println(wordForTheResult + " = " + sum);

      keyboard.close();
     
   }
}
