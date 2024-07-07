import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER A LIMIT");
    int n=sc.nextInt();
    int sum = 0;
    for(int i=0; i<n; i++)
    {
       sum = sum + i; 
    }
    System.out.println(sum);
}
}
