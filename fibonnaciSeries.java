import java.util.*;

public class fibonnaciSeries
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print("0 1 ");
		for(int i=0;i<n-2;i++)
		{
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
		}
	}
}
