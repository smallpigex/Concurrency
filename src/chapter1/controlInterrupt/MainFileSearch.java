package chapter1.controlInterrupt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainFileSearch {

  public static void main(String[] args) throws IOException {
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


