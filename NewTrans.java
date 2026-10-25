package Test;
import java.io.File;
import java.util.Scanner;

public class NewTrans {
	public static void main(String[] args) throws Exception {

        File file = new File("transaction.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextDouble()) {
            double amount = sc.nextDouble();

            if (amount > 0) {
                System.out.println(amount + " - VALID");
            } else {
                System.out.println(amount + " - INVALID");
            }
        }

        sc.close();
    }

}
