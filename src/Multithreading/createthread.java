package Multithreading;

public class createthread implements Runnable {

    @Override
    public void run() {
      try {

          for (int i = 0; i < 3; i++) {
              System.out.println("hey  " + Thread.currentThread().getId());
              Thread.sleep(100);
          }

      }catch (Exception e){

      }
        for(int i= 0;i<3 ;i++) {
            System.out.println("yo  " + Thread.currentThread().getId());
        }
    }
}
