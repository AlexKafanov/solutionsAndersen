package patterns.builder;

public enum ResponsibilitiesEmployee {

  CONTRACT, CREDIT;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
