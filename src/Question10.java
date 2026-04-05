import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        //Grade according to marks
        System.out.print("Enter your percentage: ");
        int perc = sc.nextInt();

        if(perc >= 90 && perc <= 100){
            System.out.println("A");
        }else if(perc >= 80 && perc < 90){
            System.out.println("B");
        }else if(perc >= 70 && perc < 80){
            System.out.println("C");
        }else if(perc >= 60 && perc < 70){
            System.out.println("D");
        }else if(perc >= 50 && perc < 60){
            System.out.println("E");
        }else if(perc < 50 && perc >= 0){
            System.out.println("FAIL");
        }else{
            System.out.println("Invalid Percentage");
        }

        sc.close();
    }
}
