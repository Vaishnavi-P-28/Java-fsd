import java.util.Scanner;
public class calculater {
	public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;

	    Scanner input = new Scanner(System.in);

	   
	    System.out.println("Choose an operator: +, -, *,/");
	    
	    operator = input.next().charAt(0);

	    
	    System.out.println("\nEnter first number");
	    number1 = input.nextDouble();

	    System.out.println("\n Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {
	        // addition
	        case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;
	        // subtraction
	        case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;
	        // multiplication
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	     // Division
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }

}
