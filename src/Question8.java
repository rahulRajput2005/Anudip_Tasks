import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check if a year is a leap year or not
        System.out.print("Enter a year to check if it is leap year: ");
        int year = sc.nextInt();
        System.out.println(year + " : " + (year%4==0));
        sc.close();
    }
}
