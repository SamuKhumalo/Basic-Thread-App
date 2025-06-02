package za.ac.utils;

import java.util.Random;

public class MyThreadOdd extends Thread {

    @Override
    public void run() {

        int oddNum = new Random().nextInt(20);

        while (oddNum < 10) {
            if (oddNum % 2 == 1) {
                System.out.println("The odd num: " + oddNum);
                oddNum++;
            }
        }

    }

}
