import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("Provide your account name");
        name = scanner.next();
        System.out.println("Provide your account number");
        accountNumber = scanner.next();
        System.out.println("Provide your login");
        login = scanner.next();
        System.out.println("Provide your account balance");
        balance = scanner.nextLong();
    }

    /*metodę zaczynamy od modyfikatora dostępu public

     */
    public void showAccount(){
        System.out.println("Your account name is " + name);
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your login is " + login);
        System.out.println("Your balance is " + balance);
    }

    public void deposit(){
        System.out.println("Podaj ilość wpłacanej gotówki");
        long kwotaWplaty;
        kwotaWplaty = scanner.nextLong();
        balance = kwotaWplaty + balance;
    }

    public void withdrawl(){
        System.out.println("Podaj ilość wypłacanej gotówki");
        long kwotaWyplaty;
        kwotaWyplaty = scanner.nextLong();
        balance = balance - kwotaWyplaty;
        if(balance<kwotaWyplaty){
            System.out.println("Brak wystarczających środków na koncie");}
            else {
                balance = balance-kwotaWyplaty;
        }
    }

}
