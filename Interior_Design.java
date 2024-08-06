import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();
        int A = X1+Y1;
        int B = X2+Y2;
      if (A < B) {
          System.out.println(A);
      }
      else {
          System.out.println(B);
      }
    }
}