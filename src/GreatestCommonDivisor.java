import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0||b==0)
            System.out.println("Không có ước số chung lớn nhất");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước số chung lớn nhất của 2 số là: " + a);
    }
}
