import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check if a number is even or odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}
