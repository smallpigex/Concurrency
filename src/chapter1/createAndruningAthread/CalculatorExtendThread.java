package chapter1.createAndruningAthread;

public class CalculatorExtendThread extends Thread {

  private int number;

  public CalculatorExtendThread(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getState());
      System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i,
          i * number);
    }
  }
}
