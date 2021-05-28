import java.util.*;

public class revNum
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

    int number = sc.nextInt (), reverse = 0;

    while (number != 0)
      {

	int dig = number % 10;

	  reverse = reverse * 10 + dig;

	  number /= 10;

      }
    System.out.println ("Reversed Number: " + reverse);

  }
}
