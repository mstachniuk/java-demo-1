package devoxx;

class IfElseIfTest {
  public static void main(String[] args) {
    if (true) {
      System.out.println("x");
    } else if (true) {
      throw new RuntimeException("boom");
    }

    if (true) {
      System.out.println("x");
    } else if (true) {
      System.out.println("y");
    }

        if (true) {
      System.out.println("x");
    } else if (true) {
      System.out.println("y");
    } else {
      System.out.println("z");
    }
  }
}
