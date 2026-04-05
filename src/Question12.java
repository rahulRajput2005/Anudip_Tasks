import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency note: ");
        int note = sc.nextInt();

        if (note == 2000 || note == 500 || note == 200 || note == 100 || note == 50) {
            System.out.println("Valid currency note for deposit!");
        } else {
            System.out.println("Invalid currency note!");
        }
        sc.close();
    }
}
