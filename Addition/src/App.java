import java.util.Scanner;

public class App
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter the First Number:");
        a = scanner.nextInt();

        System.out.println("Enter the Second Number:");
        b = scanner.nextInt();

        scanner.close();

        c = a + b;

        System.out.println("The sum of " + a + " and " + b + " is: " + c);
    }
}