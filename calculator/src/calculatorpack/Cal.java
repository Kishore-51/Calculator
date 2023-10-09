package calculatorpack;

	public class Cal
	{
			
	public static double add(double a,double b)
	{
	return(a+b);
	}
	public static double sub(double a,double b)
	{
	return(a-b);
	}
	public static double mul(double a,double b)
	{
	return(a*b);
	}
	public static double div(double a,double b)
	{
		 if (b != 0) {
	            return a / b;
	        } else {
	            // Handle division by zero error
	            System.err.println("Error: Division by zero.");
	            return Double.NaN; // Not-a-Number
	        }
	}
	public static double rem(double a,double b)
	{
	return(a%b);
	}
}
	


