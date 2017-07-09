
package sahithya;
import java.util.*; 
public class numbers 
{
	public static void main(String[]args)
	{
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number: ");
		i= s.nextInt();
		if(i==0)
		{
			System.out.println("Number is Zero");
		}
		else if (i>0)
		{System.out.println("Number is positive");
		
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
