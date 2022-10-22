import java.util.Scanner;
public class LinearEquationRunner
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("\nEnter coordinate 2: ");
        String coord2 = scan.nextLine();

        int x1 = Integer.parseInt(coord1.substring(coord1.indexOf("(") + 1, coord1.indexOf(", ")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(", ") + 2, coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(coord2.indexOf("(") + 1, coord2.indexOf(", ")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(", ") + 2, coord2.indexOf(")")));

        if(x1 == x2)
        {
            System.out.print("The line is vertical and has an equation of x = " + x1);
        }
        else
        {
            LinearEquation LE = new LinearEquation(x1, x2, y1, y2);

            System.out.println(LE.equation());
            System.out.println(LE.distance());
            System.out.println(LE.yIntercept());
            System.out.println(LE.slope());
        }
        LinearEquation LE = new LinearEquation(x1, x2, y1, y2);


    }
}
