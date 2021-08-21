package patterns.factoryMethod;

public class EmailSubscriber extends Subscriber {
    public EmailSubscriber(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("this is an email notification");
        System.out.println(notification);
    }
}
