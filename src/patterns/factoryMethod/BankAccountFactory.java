package patterns.factoryMethod;


public class BankAccountFactory {
    public BankAccountInterface createAccount(String name, String id, Integer amount, String notificationType) {
        if (name == null || id == null || amount == null || notificationType == null)
            return null;
        else {
            Observer s1;
            if (notificationType.equals("email"))
                s1 = new EmailSubscriber(name);
            else
                s1 = new SmsSubscriber(name);
            BankAccountInterface tempobj = new BankAccount(name, id, amount);
            System.out.println(name);
            tempobj.subscribe(s1);
            return tempobj;
        }
    }
}
