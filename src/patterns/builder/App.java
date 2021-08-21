
package patterns.builder;

public class App {
    public static void main(String[] args) {
        Person employee = new Person.Builder(Profession.EMPLOYEE, "Alexander")
                .withResponsibilities(ResponsibilitiesEmployee.CONTRACT)
                .build();
        System.out.println(employee.toString());

        Person client = new Person.Builder(Profession.CLIENT, "Anastasia")
                .withResponsibilitiesClient(ResponsibilitiesClient.SIGN_CONTRACT)
                .build();
        System.out.println(client.toString());
    }
}
