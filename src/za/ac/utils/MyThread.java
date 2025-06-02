package za.ac.utils;

import java.util.Random;

public class MyThread extends Thread {

    @Override
    public void run() {

        int num = new Random().nextInt(20) ;

        while(num<10){
            if (num % 2 == 0) {

                System.out.println("The evennumber is :"+num);
                num++;
            }

        }

    }
}
