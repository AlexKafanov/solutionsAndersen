package patterns.singleton;

public class MySingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        singleton1.employee = "Alexander";
        System.out.println(singleton1.employee);
        System.out.println("---------------");

        SingletonEnum singletonEnum = SingletonEnum.EMPLOYEE;
        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum.hello());
    }

}


