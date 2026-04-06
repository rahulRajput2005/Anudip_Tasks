import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units to calculate electricity bill: ");
        int units = sc.nextInt();

        float bill = 0;

        if (units >= 0 && units <= 200)
            bill = 0;
        else if (units <= 300)
            bill = (units - 200) * 1.2f;
        else if (units <= 400)
            bill = 100 * 1.2f + (units - 300) * 1.5f;
        else if (units <= 500)
            bill = 100 * 1.2f + 100 * 1.5f + (units - 400) * 2.5f;
        else if (units > 500)
            bill = 100 * 1.2f + 100 * 1.5f + 100 * 2.5f + (units - 500) * 8f;
        else {
            System.out.println("Invalid Units");
            return;
        }

        System.out.println("Charges: " + bill);


    }
}
