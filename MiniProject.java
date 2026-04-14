package miniProject;

import java.util.Scanner;


public class MiniProject {
    static int invalidAttempts = 0;
    static final int maxAttempts = 3;

    private static void handleInvalid(){
        invalidAttempts++;
        System.out.println("Invalid input ! Attempts left: " + (maxAttempts - invalidAttempts));
        if(invalidAttempts >= maxAttempts){
            System.out.println("Program terminated due to invalid inputs!");
            System.exit(0);
        }
    }

    private static int getInt(Scanner sc){
        while(true){
            try{
                int val = sc.nextInt();

                return val;
            }catch(Exception e){
                sc.next();
                handleInvalid();
            }
        }
    }

    private static long getLong(Scanner sc){
        while(true){
            try{
                long val = sc.nextLong();
                return val;
            }catch(Exception e){
                sc.next();
                handleInvalid();
            }
        }
    }

    private static double getDouble(Scanner sc){
        while(true){
            try{
                double val = sc.nextDouble();
                return val;
            }catch(Exception e){
                sc.next();
                handleInvalid();
            }
        }
    }

    private static char getChar(Scanner sc){
        while(true){
            String input = sc.next().toLowerCase();
            if(input.length() == 1){
                return input.charAt(0);
            }else{
                handleInvalid();
            }
        }
    }
    public static void mainMenu(Scanner sc) throws InterruptedException {
        boolean run = true;
        while(run){
            System.out.println("==============Main Menu==============");
            System.out.println("1. CALCULATOR");
            System.out.println("2. NUMBER ANALYZER");
            System.out.println("3. PATTERN GENERATOR");
            System.out.println("4. ADVANCED MATH TOOLS");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");

            int choice = getInt(sc);

            if (choice < 0 || choice > 4) {
                handleInvalid();
                continue;
            }
            invalidAttempts = 0;

            switch (choice){
                case 1:
                    calculator(sc);
                    break;
                case 2:
                    numberAnalyzer(sc);
                    break;
                case 3:
                    patternGenerator(sc);
                    break;
                case 4:
                    advancedMathTools(sc);
                    break;
                case 0:
                    System.out.print("Thank your for using Smart Utility System");
                    Exit();
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Input !! Try Again");
                    break;
            }
        }
    }

    private static void advancedMathTools(Scanner sc) throws InterruptedException {
        System.out.println("\n\n");

        boolean run = true;
        while(run){
            System.out.println("Advanced Math Tools Menu -->");
            System.out.println("1. FACTORIAL");
            System.out.println("2. FIBONACCI SERIES");
            System.out.println("3. POWER");
            System.out.println("4. GCD & LCM");
            System.out.println("0. EXIT TO MAIN MENU");
            System.out.print("Enter your choice: ");
            int choice = getInt(sc);

            if (choice < 0 || choice > 5) {
                handleInvalid();
                continue;
            }
            invalidAttempts = 0;

            switch(choice){
                case 1:
                    factorial(sc);
                    break;
                case 2:
                    fibonacci(sc);
                    break;
                case 3:
                    powerOf(sc);
                    break;
                case 4:
                    gcd_lcm(sc);
                    break;
                case 5:
                    resetAttempts();
                    mainMenu(sc);
                    break;
                case 0:
                    System.out.print("Good Bye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice !! Try Again");
                    break;
            }
        }
    }

    private static void gcd_lcm(Scanner sc) {
        System.out.print("Enter two numbers : ");
        int a = getInt(sc);
        int b = getInt(sc);
        int x = a, y = b;
        int gcd = 1;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);
        System.out.println();
    }

    private static void powerOf(Scanner sc) {
        System.out.println("Enter a number: ");
        int num = getInt(sc);
        System.out.println("Enter an exponent: ");
        int exp = getInt(sc);

        int result = 1;
        for(int i=1; i<=exp; i++){
            result *= num;
        }
        System.out.println(num + " power of " + exp + " : " + result);
        System.out.println();
    }

    private static void fibonacci(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = getInt(sc);

        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++){
            System.out.print(a);
            if(i < n ) System.out.print(", ");
            int temp  = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }


    public static void factorial(Scanner sc){
        System.out.print("Enter a number to find its factorial: ");
        int n = getInt(sc);

        long fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        System.out.println();
    }

    private static void patternGenerator(Scanner sc) throws InterruptedException {
        System.out.println("\n\n");
        boolean run = true;
        while(run){
            System.out.println("Pattern Generator Menu -->");
            System.out.println("1. STAR TRIANGLE");
            System.out.println("2. REVERSE STAR TRIANGLE");
            System.out.println("3. NUMBER TRIANGLE");
            System.out.println("4. PYRAMID");
            System.out.println("5. MAIN MENU");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");

            int choice = getInt(sc);

            if (choice < 0 || choice > 5) {
                handleInvalid();
                continue;
            }
            invalidAttempts = 0;

            switch(choice){
                case 1:
                    starTriangle(sc);
                    break;
                case 2:
                    reverseStarTriangle(sc);
                    break;
                case 3:
                    numberTriangle(sc);
                    break;
                case 4:
                    pyramid(sc);
                    break;
                case 5:
                    resetAttempts();
                    mainMenu(sc);
                    break;
                case 0:
                    System.out.print("good Bye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice !! Try Again");
                    break;
            }
        }
    }

    private static void pyramid(Scanner sc) {
        System.out.println("Enter numbers of rows: ");
        int n = getInt(sc);
        System.out.println("Enter character you want the pattern in: ");
        char  ch = getChar(sc);

        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(ch);
            }
            System.out.println();
        }
            System.out.println();
    }

    private static void numberTriangle(Scanner sc) {
        System.out.println("Enter numbers of rows: ");
        int n = getInt(sc);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
            System.out.println();
    }

    private static void reverseStarTriangle(Scanner sc) {
        System.out.println("Enter numbers of rows: ");
        int n = getInt(sc);
        System.out.println("Enter character you want the pattern in: ");
        char  ch = getChar(sc);

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
            System.out.println();
    }

    private static void starTriangle(Scanner sc) {
        System.out.println("Enter numbers of rows: ");
        int n = getInt(sc);
        System.out.println("Enter character you want the pattern in: ");
        char  ch = getChar(sc);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
            System.out.println();
    }

    private static void numberAnalyzer(Scanner sc) throws InterruptedException {
        System.out.println("\n\n");
        boolean run = true;
        while(run){
            System.out.println("\n");
            System.out.println("Number Analyzer Menu -->");
            System.out.println("1. EVEN / ODD");
            System.out.println("2. PRIME");
            System.out.println("3. PALINDROME");
            System.out.println("4. ARMSTRONG");
            System.out.println("5. NUMBER OF DIGITS");
            System.out.println("6. MAIN MENU");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");

            int choice = getInt(sc);

            if (choice < 0 || choice > 6) {
                handleInvalid();
                continue;
            }
            invalidAttempts = 0;

            switch(choice){
                case 1:
                    evenOdd(sc);
                    break;
                case 2:
                    prime(sc);
                    break;
                case 3:
                    palindrome(sc);
                    break;
                case 4:
                    armstrong(sc);
                    break;
                case 5:
                    numberOfDigits(sc);
                    break;
                case 6:
                    resetAttempts();
                    mainMenu(sc);
                    break;
                case 0:
                    System.out.print("Good Bye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice !! Try Again");
                    break;
            }
        }

    }

    private static void numberOfDigits(Scanner sc) {
        System.out.println("Enter a number: ");
        long num = getLong(sc);
        if (num == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        num = Math.abs(num);
        int digit = 0;
        while( num > 0){
            num /= 10;
            digit++;
        }
        System.out.println("Number of digits : " + digit);
        System.out.println();
    }

    private static void armstrong(Scanner sc) {
        System.out.print("Enter a number to check: ");
        int a = getInt(sc);
        int x = a;
        if (a < 0) {
            System.out.println(a + " is not Armstrong!");
            return;
        }
        //First find length of number
        int len = length(a);

        int sum = 0;
        while(x > 0){
            int temp = x%10;
            sum = sum + powr(temp, len);
            x /= 10;
        }
        if(sum == a) System.out.println(a + " is Armstrong !");
        else System.out.println(a + " is not Armstrong !");

        System.out.println();

    }

    public static int powr(int num, int l){
        int ans = 1;
        for(int i=0; i<l; i++){
            ans *= num;
        }
        return ans;
    }

    public static int length(int num){
        int count = 0;
        while( num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    private static void palindrome(Scanner sc) {
        System.out.println("Enter a number to check: ");
        int p = getInt(sc);
        if (p < 0) {
            System.out.println(p + " is not Palindrome");
            return;
        }
        int x = p;
        int rev = 0;
        while(x > 0){
            int temp = x%10;
            rev = (rev * 10 ) + temp;
            x /= 10;
        }
        if(p == rev) System.out.println(p+ " is Palindrome !");
        else System.out.println(p + " is not Palindrome");

        System.out.println();
    }

    private static void prime(Scanner sc) {
        System.out.print("Enter a number to check: ");
        int p = getInt(sc);

        if (p <= 1) {
            System.out.println(p + " is NOT Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                System.out.println(p + " is NOT Prime");
                return;
            }
        }

        System.out.println(p + " is Prime");

        System.out.println();
    }

    private static void evenOdd(Scanner sc) {
        System.out.print("Enter a number to check: ");
        int n = getInt(sc);

        if(n%2==0) System.out.println(n + " is even!");
        else System.out.println(n + " is odd");
    }

    private static void calculator(Scanner sc) throws InterruptedException {
        System.out.println("\n\n");
        boolean run = true;
        while(run){
            System.out.println("Calculator Menu -->");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. MAIN MENU");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");

            int choice = getInt(sc);

            if (choice < 0 || choice > 6) {
                handleInvalid();
                continue;
            }
            invalidAttempts = 0;

            switch(choice){
                case 1:
                    addition(sc);
                    break;
                case 2:
                    subtraction(sc);
                    break;
                case 3:
                    multiplication(sc);
                    break;
                case 4:
                    division(sc);
                    break;
                case 5:
                    modulus(sc);
                    break;
                case 6:
                    resetAttempts();
                    mainMenu(sc);
                    break;
                case 0:
                    System.out.println("Good Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!! Try Again");
                    break;
            }

        }
    }

    private static void resetAttempts() {
        invalidAttempts = 0;
    }

    private static void modulus(Scanner sc) {
        System.out.print("Enter two numbers for modulus: ");
        int a = getInt(sc);
        int b = getInt(sc);
        if (b == 0) {
            System.out.println("Modulus by zero not possible!");
            return;
        }
        int result = a % b;
        System.out.println("Result: " + result);
        while (true) {
            System.out.print("Continue modulus? (y/n): ");
            char ch = getChar(sc);
            if (ch != 'y') break;
            System.out.print("Enter next number: ");
            int num = getInt(sc);
            if (num == 0) {
                System.out.println("Modulus by zero not possible!");
                continue;
            }
            result %= num;
            System.out.println("Updated Result: " + result);
        }
        System.out.println();
    }

    private static void division(Scanner sc) {
        System.out.print("Enter two numbers to div: ");
        int a = getInt(sc);
        int b = getInt(sc);
        if (b == 0) {
            System.out.println("Division by zero is not possible!");
            return;
        }
        double result = (double) a / b;
        System.out.println("Result: " + result);
        while (true) {
            System.out.print("Continue division? (y/n): ");
            char ch = getChar(sc);
            if (ch != 'y') break;
            System.out.print("Enter next number: ");
            int num = getInt(sc);
            if (num == 0) {
                System.out.println("Division by zero is not possible!");
                continue;
            }
            result /= num;
            System.out.println("Updated Result: " + result);
        }
        System.out.println();
    }

    private static void multiplication(Scanner sc) {
        System.out.print("Enter two numbers to mul: ");
        int a = getInt(sc);
        int b = getInt(sc);
        int result = a * b;
        System.out.println("Result: " + result);
        while (true) {
            System.out.print("Continue multiplication? (y/n): ");
            char ch = getChar(sc);
            if (ch != 'y') break;
            System.out.print("Enter next number: ");
            int num = getInt(sc);
            result *= num;
            System.out.println("Updated Result: " + result);
        }
        System.out.println();
    }

    private static void subtraction(Scanner sc) {
        System.out.print("Enter two numbers to sub: ");
        int a = getInt(sc);
        int b = getInt(sc);
        int result = a - b;
        System.out.println("Result: " + result);
        while (true) {
            System.out.print("Continue subtraction? (y/n): ");
            char ch = getChar(sc);
            if (ch != 'y') break;
            System.out.print("Enter next number: ");
            int num = getInt(sc);
            result -= num;
            System.out.println("Updated Result: " + result);
        }
        System.out.println();
    }

    private static void addition(Scanner sc) {
        System.out.print("Enter two numbers: ");
        double a = getDouble(sc);
        double b = getDouble(sc);

        double result = a + b;
        System.out.println("Result: " + result);

        while (true) {
            System.out.print("Do you want to continue addition? (y/n): ");
            char ch = getChar(sc);

            if (ch != 'y') break;

            System.out.print("Enter next number: ");
            double num = getDouble(sc);

            result += num;  
            System.out.println("Updated Result: " + result);
        }
        System.out.println();
    }

    private static void Exit() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(200);
            System.out.print(". ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);


        System.out.println("+------------------------------------------------------+");
        System.out.println("***************Welcome to my MINI PROJECT***************");
        System.out.println("+------------------------------------------------------+");
        System.out.println();
        System.out.print("Kindly enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name + " to Smart Utility System!");
        System.out.println();
        mainMenu(sc);
    }
}
