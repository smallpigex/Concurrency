package chapter1.interrupt;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    Thread task = new PrimeGenerator();
    task.start();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    task.interrupt();
  } 
}


