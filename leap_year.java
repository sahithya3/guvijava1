// LEAP YEAR
package sahithya;
import java.util.*; 
public class leap
{
	public static void main(String[]args)
	{
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number: ");
		i= s.nextInt();
		if(i%4==0)
		{
			System.out.println("Year is leap year");
		}
	
		else
		{
			System.out.println("Year is not a leap year");
		}
	}
}
