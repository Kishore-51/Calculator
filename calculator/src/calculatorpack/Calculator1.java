package calculatorpack;
import calculatorpack.Cal;

import java.util.Scanner;
public class Calculator1
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Calculating arthmatic operation of two numbers:");
		System.out.println("Enter First number:");
		double first=s.nextDouble();
		System.out.println("Enter Second number:");
		double second=s.nextDouble();
        System.out.println("Choice one operation + or - or * or / or %");
        String op=s.next();
        switch(op)
        {
        case"+":
        {
        	System.out.println("sum of two number is :" + Cal.add(first,second));
        	break;
        }
        	
        case"-":
        {
        	System.out.println("subtraction of two number is :" + Cal.sub(first,second));
        	break;
        }
        	
        case"*":
        {
        	System.out.println("muliplication of two number is :" + Cal.mul(first,second));
        	break;
        }
        case"/":
        {
        	System.out.println("division of two number is :" + Cal.div(first,second));
        	break;
        }
        case"%":
        {
        	System.out.println("reaminder of two number is :" + Cal.rem(first,second));
        	break;
        }
        default:
        {
        	System.out.println("invalid");
        	break;
        }
        
        }
	}
}
