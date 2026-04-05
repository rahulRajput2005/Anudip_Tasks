import java.util.Scanner;

public class Question13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Currency Denomination by Atm
        System.out.print("Enter the amount to be dispersed: ");
        int amount = sc.nextInt();

        System.out.println("**Denominated Notes**");
        int notes = 0;

        notes = amount / 2000;
        if(notes > 0){
            System.out.println("2000 x " + notes + " = "+ (notes * 2000));
            amount = amount - (notes * 2000);
        }

        notes = amount / 500;
        if(notes > 0){
            System.out.println("500 x " + notes + " = " + (notes * 500));
            amount = amount - (notes * 500);
        }

        notes = amount / 200;
        if(notes > 0){
            System.out.println("200 x " + notes + " = " + (notes * 200));
            amount = amount - (notes * 200);
        }

        notes = amount / 100;
        if(notes > 0){
            System.out.println("100 x " + notes + " = " + (notes * 100));
            amount = amount - (notes * 100);
        }

        notes = amount / 50;
        if(notes > 0){
            System.out.println("50 x " + notes + " = " + (notes * 50));
            amount = amount - (notes * 50);
        }

        if(amount > 0){
            System.out.println("No notes left to denominate the amount: " + amount);
        }

    sc.close();
    }
}