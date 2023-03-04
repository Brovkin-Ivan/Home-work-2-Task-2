import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int purchase = 1100;

        if (purchase > 1000) {
            System.out.println(balance + purchase + (purchase / 100) + " Баланс");
            System.out.println("Бонус: " + purchase / 100);
        } else {
            System.out.println(balance + purchase + " Баланс");
        }

    }
}