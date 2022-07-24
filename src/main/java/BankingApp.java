import java.sql.SQLOutput;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w aplikacji bankowej!");
        int inputNumber;
        do {
            System.out.println("Co chcesz zrobić? \n 1. Pokaż informacje o koncie \n 2. Wpłata gotówki \n 3. Wypłata gotówki \n 4. Zakończ");
             inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;

            }
        } while (inputNumber != 4);
            /* wykrzyknik to zaprzeczenie

             */

    }



}
