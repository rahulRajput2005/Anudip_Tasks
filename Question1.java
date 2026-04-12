package Loops;

import java.util.Scanner;

public class Question1 {
    //Sum of first n numbers
    public static void sumOfFirstNNumbers(Scanner sc){
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }

        System.out.println("Sum of first n numbers: " + sum);
    }

    //Multiplication table of a number given by user
    public static void multiplicationTableOfANumber(Scanner sc){
        System.out.print("Enter a table print multiplication table: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }

    //Reverse of a number
    public static void reverseOfANumber(Scanner sc){
        System.out.print("Enter a number to find reverse of it: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum = (sum*10)+temp;
            num /= 10;
        }
        System.out.println("Reversed number: " + sum);
    }


    //Reverse a String
    public static void reverseAString(Scanner sc){
        System.out.print("Enter a String to find its reverse: ");
        String str = sc.nextLine();
        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String : " + reversed);
    }

    //Factorial of a number
    public static void factorial(Scanner sc){
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();

        long fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    //Fibonnaci series till a number n
    public static void fibonnaci(Scanner sc){
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++){
            System.out.print(a + ", ");
            int temp  = a + b;
            a = b;
            b = temp;
        }
    }

    //Greatest common divisor for two numbers
    public static void GCD(Scanner sc){
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0) gcd = i;
        }

        System.out.println("GCD: " + gcd);
    }

    //Print binary value of a given number
    public static void binaryValue(Scanner sc){
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        String binary = "";
        while(n != 0){
            int temp  = n%2;
            binary = temp  + binary;
            n /= 2;
        }
        System.out.println("Binary: " + binary);
    }

    //Print the frequency of digits in a number
    public static void frequencyOfDigits(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = Math.abs(num);

        for (int i = 0; i <= 9; i++) {
            int frequencyDigit = 0;
            int searchNum = tempNum;


            while (searchNum > 0) {
                int lastDigit = searchNum % 10;
                if (lastDigit == i) {
                    frequencyDigit++;
                }
                searchNum /= 10;
            }

            if (frequencyDigit > 0) {
                System.out.println(i + " -> " + frequencyDigit);
            }
        }
    }

    //Rotate a number clockwise
    public static void rotateClockWise(Scanner sc){
        System.out.print("Enter a number to rotate: ");
        int num = sc.nextInt();
        System.out.print("Enter how much rotations: ");
        short r = sc.nextShort();

        //Length
        int len  = length(num);

        //Pow
        int pow = powr(10, len-1);

        //Rotation
        for(int i=0; i<r; i++){
            int lastDigit = num%10;//Take last digit -> 12345 -> 5
            int remaining = num/10;//Remove last digit -> 12345 -> 1234

            num = (lastDigit * pow) + remaining; //Push last to front -> 5*10000 + 1234 -> 51234
        }

        System.out.println("Rotated number: " + num);

    }

    public static int length(int num){
        int count = 0;
        while( num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static int powr(int num, int p){
        int ans = 1;
        for(int i=0; i<p; i++){
            ans *= num;
        }
        return ans;
    }


    //Find if a number is automorphic or not
    public static void automorphicNumbers(Scanner sc){
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        //Find square
        int pow = powr(num, 2);
        System.out.println("Square of num : " + pow);

        //find length of num to compare
        int len = length(num);

        int tempPow = pow;
        int tempNum = num;

        boolean automorphic = true;
        for(int i=1; i<=len; i++){
            int temp1 = tempPow%10;
            int temp2 = tempNum%10;

            if(temp1 != temp2) {
                automorphic = false;
                break;
            }
            tempPow /= 10;
            tempNum /= 10;
        }

        if(automorphic) System.out.println(num +" is automorphic!");
        else System.out.println(num + " is not automorphic!");
    }


    //Find how many trailing numbers of zeros are there in a factorial of n
    public static void trailingZerosFactorial(Scanner sc){
        System.out.print("Enter a number to check trailing zero: ");
        int num = sc.nextInt();

        //First find factorial
        long fact = fact(num);

        long tempFact = fact;
        //Now count zeros
        int count = 0;
        while (tempFact > 0 && tempFact % 10 == 0) {
            count++;
            tempFact /= 10;
        }

        System.out.println("Zeros: " + count);

    }

    public static long fact(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void floydTriangle(Scanner sc){
        System.out.print("Enter a number to generate triangle: ");
        int num = sc.nextInt();

        int triangle = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(triangle + " ");
                triangle++;
            }
            System.out.println();
        }
    }

    public static void palindromicTriangle(Scanner sc){
        System.out.print("Enter a number to generate triangle: ");
        int num = sc.nextInt();

        /*
                             1
                           1 2 1
                         1 2 3 2 1
                       1 2 3 4 3 2 1
         */

        for(int i=1; i<=num; i++){
            //Spaces
            for(int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            //Stars left
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }

            //Stars right
            for(int j=i-1; j>=1; j--){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    //Check if a number is a spy number or not
    public static void spyNumber(Scanner sc){
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        int sumOfDigits = 0;
        int productOfDigits = 1;

        int tempNum = num;
        while(tempNum > 0){
            int temp = tempNum%10;
            sumOfDigits += temp;
            productOfDigits *= temp;
            tempNum /= 10;
        }

        System.out.println("Sum of Digits: " + sumOfDigits);
        System.out.println("Product of Digits: " + productOfDigits);

        if(sumOfDigits == productOfDigits) System.out.println(num + " is a spy number!");
        else System.out.println(num + " is not a spy number!");
    }

    public static void disariumNumber(Scanner sc){
        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();

        //135 -> 1pow1 + 3pow2 + 5pow 3 = 135
        //First find length
        int len = length(num);

        int sum = 0;
        int tempNum = num;
        for(int i=len; i>0; i--){
            int temp = tempNum%10;
            sum += powr(temp, i);
            tempNum /= 10;
        }

        System.out.println("Sum : " + sum);

        if(sum == num) System.out.println(num + " is a disarium number!");
        else System.out.println(num + " s not a disarium number!");
    }

    public static void diamond(Scanner sc){
        System.out.print("Enter a number to generate triangle: ");
        int num = sc.nextInt();

        //Upper half
        for(int i=1; i<=num; i++){
            //Spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //Lower half
        for(int i=num-1; i>=1; i--){

            //Spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Rotate a number to check all rotation are prime
    public static void circularPrime(Scanner sc){
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        int tempNum = num;
        //First find the length of number
        int len = length(num);

        boolean prime = true;
        for(int i=1; i<=len; i++){
            if(!isPrime(tempNum)){
                prime = false;
                break;
            }
            tempNum = rotate(tempNum, len);
        }
        if(prime) System.out.println("Yes " + num +" is a circular prime!");
        else System.out.println("No " + num + "is not a circular prime!");
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        for(int i=2; i<= Math.sqrt(num); i++){
            if(num % i == 0)return false;
        }
        return true;
    }

    public static int rotate(int n, int l){
        int lastDigit = n%10;
        int remaining = n/10;

        int pow = powr(10, l-1);
        return (lastDigit*pow) + remaining;
    }

    public static void moveZerosEnd(Scanner sc){
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int tempNum = num;

        //10908 -> 19800

        //First find length
        int len = length(num);

        int zeros = 0;
        int result = 0;

        while(tempNum > 0){
            int temp = tempNum%10;
            if(temp !=  0) result = (result*10)+temp;
            else zeros++;
            tempNum /= 10;
        }

        int finalResult = 0;
        while(result > 0){
            int temp = result%10;
            finalResult = (finalResult*10)+temp;
            result /= 10;
        }
        for(int i=0; i<zeros; i++){
            finalResult *= 10;
        }
        System.out.println("Moved zeros to end: "+ finalResult);
    }


    public static void findDuplicates(Scanner sc){
        System.out.print("Enter a number to find duplicates: ");
        int num = sc.nextInt();


        //12323 - > 2

        //If the frequency of a digit is more than 1, its duplicate

        for(int i=0; i<=9; i++){
            int frequency = 0;
            int search = num;

            while(search > 0){
                int temp = search%10;
                if(temp == i) frequency++;
                search /= 10;
            }
            if(frequency > 1) System.out.println("Digit "+i + " has duplicates!");
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// 1.       sumOfFirstNNumbers(sc);
// 2.       multiplicationTableOfANumber(sc);
// 3.       reverseOfANumber(sc);
// 4.       reverseAString(sc);
// 5.       factorial(sc);
// 6.       fibonnaci(sc);
// 7.       GCD(sc);
// 8.       binaryValue(sc);
// 9.       frequencyOfDigits(sc);
// 10.      rotateClockWise(sc);
// 11.      automorphicNumbers(sc);
// 12.      trailingZerosFactorial(sc);
// 13.      floydTriangle(sc);
// 14.      palindromicTriangle(sc);
// 15.      spyNumber(sc);
// 16.      disariumNumber(sc);
// 17.      diamond(sc);
// 18.      circularPrime(sc);
// 19.      moveZerosEnd(sc);
// 20.       findDuplicates(sc);


//        MiniBankSystem ac1 = new MiniBankSystem(10000);
//        ac1.startSystem(sc);


        //Pascals -> Zigzag -> Calendar these questions are hard





    }
}
