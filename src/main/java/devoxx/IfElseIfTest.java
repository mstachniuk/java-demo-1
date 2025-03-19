package devoxx;

class IfElseIfTest {
  public static void main(String[] args) {
    boolean a = System.getenv().containsKey("x");
    boolean b = System.getenv().containsKey("y");
    if (a) {
      System.out.println("x");
    } else if (b) {
      throw new RuntimeException("boom");
    }

    if (a) {
      System.out.println("x");
    } else if (b) {
      System.out.println("y");
    }

    if (a) {
      System.out.println("x");
    } else if (b) {
      System.out.println("y");
    } else {
      System.out.println("z");
    }
  }
}
