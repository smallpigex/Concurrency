package chapter1.uncontrolledexceptions;

public class Task implements Runnable {

    @Override
    public void run() {
        int numero = Integer.parseInt("TTT");
        System.out.println("oh ya.....");
    }

}
