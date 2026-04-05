import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check whether a character is alphabet or number or special character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122){
            System.out.println( (ch >= 65 && ch <= 90) ? "Character in a Capital alphabet" : "Character in a Small alphabet");
        }else if(ch >= 48 && ch <= 57){
            System.out.println("Character is a Number");
        }else{
            System.out.println("Character is a special Character");
        }

        sc.close();
    }
}
