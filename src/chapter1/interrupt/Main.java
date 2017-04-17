package chapter1.interrupt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

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


