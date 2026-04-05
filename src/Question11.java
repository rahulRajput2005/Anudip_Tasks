import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Calculate electricity Bill
        System.out.print("Enter units to calculate electricity bill: ");
        int units = sc.nextInt();

        double bill;

        if(units >= 0 && units <= 200){
            System.out.println("charges : 0");
        }else if(units > 200 && units <= 300){
            bill = ( units - 200 ) * 1.2;
            System.out.println("Charges: " + bill);
        }else if(units > 300 && units <= 400){
            bill = 100*1.2 + (units-300)*1.5;
            System.out.println("Charges: " + bill);
        }else if(units > 400 && units <= 500){
            bill = 100*1.2 + 100*1.5 + (units-400)*2.5;
            System.out.println("Charges: " + bill);
        }else if(units > 500){
            bill = 100*1.2 + 100*1.5 + 100*2.5 + (units-500)*8;
            System.out.println("Charges: " + bill);
        }else{
            System.out.println("Invalid Units");
        }


    }
}
