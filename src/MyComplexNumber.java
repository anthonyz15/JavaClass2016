import java.util.Scanner;
public class MyComplexNumber
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		int a, b, c, d;
		int command;
		System.out.println("Please specify the following coefficients: ");
		System.out.print("a= ");
		a= keyboard.nextInt();
		System.out.println("coefficient for the first imaginary part ");
		System.out.print("b= ");
		b= keyboard.nextInt();
		System.out.print("c= ");
		c= keyboard.nextInt();
		System.out.println("Coefficient for the second imaginary part");
		System.out.print("d= ");
		d= keyboard.nextInt();
		System.out.print("Please specify the operation to be executed. Press 1 for sum, 2 for multiplication: ");
		command= keyboard.nextInt();
		if(command==1){

			System.out.println("(" + a + "+" + b + "i" + ")" + "+" + "(" + c + "+" + d + "i" + ")" + "=" + "(" + a + "+" + c + ")" + "+" + "(" + b + "+" + d + ")" + "i");


			int sumReal= a+c;
			int sumImaginary= b+d;

			System.out.println("The complete sum is: " + sumReal + "+" + sumImaginary + "i");
			keyboard.close();
		}
		else if (command==2)
		{
			System.out.println("(" + a + "+" + b + "i" + ")" + "(" + c + "+" + d + "i" + ")" + "=" + "(" + a + "*" + c + "-" + b +"*" + d + ")" + "(" + a + d + "+" + b + c + ")" + "i");
			int multReal= (a*c)-(b*d);
			int multImaginary= (a*d)+(b*c);
			System.out.println("The total product is " + multReal + "+" + multImaginary + "i");
			keyboard.close();
		} 
		
		keyboard.close();
		
	}
}
