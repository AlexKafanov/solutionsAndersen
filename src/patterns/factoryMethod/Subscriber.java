package patterns.factoryMethod;

public abstract class Subscriber implements Observer {
    protected String name;
    protected String notification;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String title) {
        notification = "Hello " + name + " " + "you have " + title;
        display();
    }

    protected abstract void display();
}
