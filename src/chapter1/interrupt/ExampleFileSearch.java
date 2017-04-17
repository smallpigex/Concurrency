package chapter1.interrupt;

import java.util.concurrent.TimeUnit;

public class ExampleFileSearch {

  public static void main(String[] args) {
    FileSearch searcher = new FileSearch("C:\\", "autoexec.bat");
    Thread thread = new Thread(searcher);
    thread.start();
    try {
      TimeUnit.SECONDS.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread.interrupt();
  }
}

