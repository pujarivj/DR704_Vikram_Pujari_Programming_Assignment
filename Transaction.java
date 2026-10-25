package Test;

import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction ID: ");
        int id = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            System.out.println(amount + " Amount is valid");
        } else {
            System.out.println(amount + " Amount is invalid");
        }

        sc.close();
    }
}


