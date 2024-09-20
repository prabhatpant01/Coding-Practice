// A five digit number is entered through the keyboard.
// Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not.
import java.util.Scanner;
public class reverse01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number : ");
        int originalNumber = sc.nextInt();

        // Reverse the digits
        int reversedNumber = 0;
        int temp = originalNumber;
        while (temp > 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        // Check if original and reversed numbers are equal
        if (originalNumber == reversedNumber) {
            System.out.println("The original and reversed numbers are equal.");
        } else {
            System.out.println("The original and reversed numbers are not equal.");
        }

        sc.close();
    }
}



