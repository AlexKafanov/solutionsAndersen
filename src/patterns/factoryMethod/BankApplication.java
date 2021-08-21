package patterns.factoryMethod;

public class BankApplication {
    public static void main(String[] args) {
        BankAccountFactory factory = new BankAccountFactory();
        BankAccountInterface account = factory.createAccount("Alexander", "1001", 5000, "sms");
        account.showMenu();
    }
}
