package Test;

public class ValidateTransaction {

	
    static String validateTransaction(double amount) {
        if (amount > 0) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }

    public static void main(String[] args) {
        System.out.println(validateTransaction(5000));
        System.out.println(validateTransaction(-2500));
        System.out.println(validateTransaction(0));
    }
}
