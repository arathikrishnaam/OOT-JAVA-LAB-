import java.util.Scanner;
public class evenorodd
{
	public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER");
			int n = obj.nextInt();
			if(n%2==0)
			{
				System.out.println("EVEN NUMBER");
			}
			else
			{
				System.out.println("ODD NUMBER");
			}
		}
}
