import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program to check program strength
        System.out.println("Enter a password to check it's strength: ");
        String pass = sc.nextLine();

        int passLen = pass.length();

        boolean hasLetters = false;
        boolean hasNumbers = false;
        boolean hasSymbols = false;


        //Check each character
        for(int i=0; i<passLen; i++) {
            char ch = pass.charAt(i);

            if (Character.isLetter(ch)) {
                hasLetters = true;
            } else if (Character.isDigit(ch)) {
                hasNumbers = true;
            } else {
                hasSymbols = true;
            }
        }

            //Check pass Strength
            if((hasLetters && !hasNumbers && !hasSymbols || hasNumbers && !hasLetters && !hasSymbols) && passLen < 6){
                System.out.println("Weak Password");
            }else if(hasLetters && hasNumbers && !hasSymbols && passLen >= 6 && passLen < 10){
                System.out.println("Medium Password");
            }else if(hasLetters && hasNumbers && hasSymbols && passLen >= 10){
                System.out.println("Strong Password");
            }else{
                System.out.println("Password does not meet defined criteria");
            }
        sc.close();
    }
}
