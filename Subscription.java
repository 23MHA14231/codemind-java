import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if(X <= 40)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}