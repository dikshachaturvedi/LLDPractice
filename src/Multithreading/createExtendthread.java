package Multithreading;

public class createExtendthread extends Thread{

    @Override
    public void run() {
        for(int i= 0;i<3 ;i++) {
            System.out.println("main hey  " + Thread.currentThread().getId());
        }

    }
}
