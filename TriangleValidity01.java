// Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered through the keyboard.  
// A triangle is valid if the sum of all the three angles is equal to 180 degrees.
import java.util.Scanner;

public class TriangleValidity01 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the three angles from the user
        System.out.print("Enter the first angle (in degrees): ");
        int angle1 = sc.nextInt();

        System.out.print("Enter the second angle (in degrees): ");
        int angle2 = sc.nextInt();

        System.out.print("Enter the third angle (in degrees): ");
        int angle3 = sc.nextInt();

        // Check if the sum of angles is 180 degrees
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("These angles form a valid triangle.");
        } else {
            System.out.println("These angles do not form a valid triangle.");
        }

        sc.close();
    }
}
