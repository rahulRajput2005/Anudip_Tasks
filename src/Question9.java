import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check the greatest in three numbers
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if(num1 > num2){
            if(num1 > num3){
                System.out.println("Number " +num1+" is greatest!");
            }else{
                System.out.println("Number "+num3+" is greatest!");
            }
        }else {
            if (num2 > num3) {
                System.out.println("Number " + num2 + " is greatest!");
            }else{
                System.out.println("Number "+num3+" is greatest!");
            }
        }
        sc.close();
    }
}
