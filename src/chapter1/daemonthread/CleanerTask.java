package chapter1.daemonthread;

import java.util.Date;
import java.util.Deque;

public class CleanerTask extends Thread {
    private Deque<Event> deque;

    public CleanerTask(Deque<Event> deque) {
        this.deque = deque;
        //setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            clean(date);
        }
    }

    private void clean(Date date) {
        long difference;
        boolean delete;
        if (deque.size() == 0) {
            System.out.println("size: 0");
            return;
        }
        delete = false;
        do {
            Event e = deque.getLast();
            difference = date.getTime() - e.getDate().getTime();
            if (difference > 10000) {
                System.out.println("Cleaner: " + e.getEvent() + "\n");
                deque.removeLast();
                delete = true;
            }
            if (delete) {
                System.out.printf("Cleaner: Size of the queue: " + deque.size() + "\n");
            }
        } while (true);
       
    }

}
