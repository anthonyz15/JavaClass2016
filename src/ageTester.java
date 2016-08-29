
import java.util.Scanner;
public class ageTester
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
  
      int age, months;
      System.out.println("Please enter your age in months: ");
      months= keyboard.nextInt();
      age= (int)  months/12;
      int residue= (int) months%12;
      System.out.println("Your age in years and months is: " + age + " years and " + residue + " months");
   keyboard.close();
   }
}
