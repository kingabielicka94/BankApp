public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    /*metodę zaczynamy od modyfikatora dostępu public

     */
    public void showAccount(){
        System.out.println("Your account name is " + name);
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your login is " + login);
        System.out.println("Your balance is " + balance);


    }
}
