package chapter1.Sleep;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileClock implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            System.out.printf("%s\n", new Date());
        }
    }

}
