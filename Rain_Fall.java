import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
      if (X < 3) {
          System.out.println("LIGHT");
      }
      else if (X >= 3 && X < 7) {
          System.out.println("MODERATE");
      }
      else {
          System.out.println("HEAVY");
      }
    }
}