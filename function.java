import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int result = sum(num1, num2);
        System.out.println("The sum of the 2 numbers is: " + result);
    
    }
     static int sum(int a, int b)
    {
        int s = a + b;
        return s;
    }
}
