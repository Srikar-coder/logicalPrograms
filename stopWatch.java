import java.util.*;

public class stopWatch
{

  public static void main (String[]args)
  {

long start = System.currentTimeMillis();
for(int i=0;i<360000;i++);
long end = System.currentTimeMillis();
long elapsedTime = end - start;
System.out.println(elapsedTime);
  }
}
