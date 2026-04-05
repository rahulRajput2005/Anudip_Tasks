import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // Check if triangle is valid
        boolean valid = (side1 + side2 > side3) &&
                (side2 + side3 > side1) &&
                (side1 + side3 > side2);

        if(valid) {
            System.out.println("It is a valid Triangle!");

            // Type of triangle
            if(side1 == side2 && side2 == side3){
                System.out.println("Equilateral Triangle");
            }
            else if(side1 != side2 && side2 != side3 && side1 != side3){
                System.out.println("Scalene Triangle");
            }
            else{
                System.out.println("Isosceles Triangle");
            }

            // Right Triangle check
            if((side1*side1 + side2*side2 == side3*side3) ||
                    (side2*side2 + side3*side3 == side1*side1) ||
                    (side1*side1 + side3*side3 == side2*side2)) {

                System.out.println("Right Angled Triangle");
            }
        }
        else {
            System.out.println("Not a valid Triangle");
        }

        sc.close();
    }
}