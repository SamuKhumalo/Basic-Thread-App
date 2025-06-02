
package basicthreadapp;

import za.ac.utils.MyThread;
import za.ac.utils.MyThreadOdd;


public class BasicThreadApp {

    public static void main(String[] args) throws InterruptedException {
       MyThread t1= new MyThread();
       MyThreadOdd t2= new MyThreadOdd();
       
       t1.start();
        Thread.sleep(1000);
       t2.start();
    }
    
}
