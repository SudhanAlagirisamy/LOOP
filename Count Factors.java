import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
      if (n%i==0)
      {
        count++;
      }
    }
    System.out.print(count);
  }
}
