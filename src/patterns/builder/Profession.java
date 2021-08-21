package patterns.builder;

public enum Profession {

  EMPLOYEE, CLIENT;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
