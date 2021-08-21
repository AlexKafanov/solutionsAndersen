package patterns.singleton;

public class Singleton {
    String employee;
    private static patterns.singleton.Singleton instance;

    private Singleton() {
    }

    public static patterns.singleton.Singleton getInstance() {
        if (instance == null) {
            instance = new patterns.singleton.Singleton();
        }
        return instance;
    }
}
