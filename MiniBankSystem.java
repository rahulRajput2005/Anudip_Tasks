package Loops;

import java.util.Scanner;

public class MiniBankSystem {
    private float amount; // This stores the balance

    public MiniBankSystem(float amount) {
        this.amount = amount;
    }

    // Logic for the main menu loop
    public void startSystem(Scanner sc) {
        boolean running = true;

        System.out.println("\n+-----------------------------------------------+");
        System.out.println("|            WELCOME TO ANUDIP BANK             |");
        System.out.println("+-----------------------------------------------+");

        while (running) {

            System.out.println("Current Balance: " + this.amount);
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    depositMoney(sc);
                    break;
                case 2:
                    withdrawMoney(sc);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + this.amount);
                    break;
                case 4:
                    System.out.println("Thank you for using Anudip Bank. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!");
            }
        }
    }

    public void depositMoney(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        float deposit = sc.nextFloat();
        if (deposit > 0) {
            this.amount += deposit;
            System.out.println("Successfully deposited: " + deposit);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdrawMoney(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        float withdraw = sc.nextFloat();

        // Pure logic: Check if user has enough money
        if (withdraw > 0 && withdraw <= this.amount) {
            this.amount -= withdraw;
            System.out.println("Successfully withdrawn: " + withdraw);
        } else if (withdraw > this.amount) {
            System.out.println("Insufficient Balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }


}