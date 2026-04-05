import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //All leap years between given range
        System.out.println("Enter the starting & ending year: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start; i<=end; i++){
            if(i%4 == 0)
                System.out.println(i);
        }

        sc.close();
    }
}
