package devoxx;

class IfElseIfTest {
  if (true) {
    System.out.println("x");
  } else if (true) {
    throw new RuntimeException("boom");
  }
}
