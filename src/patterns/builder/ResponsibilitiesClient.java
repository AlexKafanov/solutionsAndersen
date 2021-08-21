package patterns.builder;

public enum ResponsibilitiesClient {

  SIGN_CONTRACT(" which sign contract"),
  PAY_CREDIT("which to pay credit");

  ResponsibilitiesClient(String title) {
    this.title = title;
  }

  private final String title;

  @Override
  public String toString() {
    return title;
  }
}
