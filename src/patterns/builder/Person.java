package patterns.builder;

public final class Person {

  private final Profession profession;
  private final String name;
  private final ResponsibilitiesClient responsibilitiesClient;
  private final ResponsibilitiesEmployee responsibilitiesEmployee;

  private Person(Builder builder) {
    this.profession = builder.profession;
    this.name = builder.name;
    this.responsibilitiesClient = builder.responsibilitiesClient;
    this.responsibilitiesEmployee = builder.responsibilitiesEmployee;
  }

  @Override
  public String toString() {

    var sb = new StringBuilder();
    sb.append("This is a ")
        .append(profession)
        .append(" named ")
        .append(name);
    if (responsibilitiesClient != null) {
      sb.append(responsibilitiesClient).append(' ');
    }
    if (responsibilitiesEmployee != null) {
      sb.append(" and which issues a ").append(responsibilitiesEmployee);
    }
    sb.append('.');
    return sb.toString();
  }

  public static class Builder {

    private final Profession profession;
    private final String name;
    private ResponsibilitiesClient responsibilitiesClient;
    private ResponsibilitiesEmployee responsibilitiesEmployee;

    public Builder(Profession profession, String name) {
      if (profession == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.profession = profession;
      this.name = name;
    }

    public Builder withResponsibilitiesClient(ResponsibilitiesClient responsibilitiesClient) {
      this.responsibilitiesClient = responsibilitiesClient;
      return this;
    }

    public Builder withResponsibilities(ResponsibilitiesEmployee responsibilitiesEmployee) {
      this.responsibilitiesEmployee = responsibilitiesEmployee;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
