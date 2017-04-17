package chapter1.createAndruningAthread;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      Calculator calculator = new Calculator(i);
      Thread thread = new Thread(calculator);
      thread.start();
    }
    
    for (int i = 1; i <= 10; i++) {
      CalculatorExtendThread calculator = new CalculatorExtendThread(i);
      calculator.start();
    }
  }

}
