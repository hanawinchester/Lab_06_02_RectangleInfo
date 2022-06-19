import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        double sideOne = 0;
        double sideTwo = 0;
        double area;
        double perimeter;
        double diagonal = 0;
        String trash;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the length of one side of your rectangle: ");
        if (in.hasNextDouble())
        {
            sideOne = in.nextDouble();
            in.nextLine();

        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for side two. You entered: " + trash);
        }

        System.out.print("Enter the length of the other side of your rectangle: ");
        if (in.hasNextDouble())
        {
            sideTwo = in.nextDouble();
            in.nextLine();
            if (sideOne == 0) {
                System.out.println("Sides cannot be 0!");
            }
            else if (sideTwo == 0) {
                System.out.println("Sides cannot be 0!");
            }
            else {
                area = sideOne * sideTwo;
                perimeter = sideOne * 2 + sideTwo * 2;
                System.out.println("The area and perimeter of your rectangle are " + area + " and " + perimeter);
                diagonal = Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo));

                System.out.println("The length of the diagonal is " + diagonal);
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for side two. You entered: " + trash);
        }
    }
}