import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int P1 = scanner.nextInt();
        int P2 = scanner.nextInt();
        int P3 = scanner.nextInt();
        int P4 = scanner.nextInt();
        if( P1 >= 10 && P2 >= 10 && P3 >= 10 && P4 >= 10)
           {
               System.out.println("YES");
           }
           else 
           {
               System.out.println("NO");
           }
    }
}