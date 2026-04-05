import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check if a number is neg, pos or zero
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        sc.close();
    }
}
