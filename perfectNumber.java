import java.util.*;
public class perfectNumber
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt(),sum=0;
    for(int i=1; i<n; i++)
    {
        if(n%i == 0)
        sum+=i;
    }
    System.out.println((sum == n)? "Yes it is a perfect number":"No it is not a perfect number");
    
  }
}
