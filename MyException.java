public class MyException extends Exception {
  public MyException(String m) {
    super(m);
  }

  public static void main(String[] args) {
    try {
      throw new MyException("QWERTYUIOP");
    } catch (MyException e) {
      System.out.println(e.getMessage());
    }
  }
}
