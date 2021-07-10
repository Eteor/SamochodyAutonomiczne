package sample;

import java.util.concurrent.TimeUnit;

public class car {
    int limit = 120;

    int currentSpeed = 0;


    public void accelerate() {

        if (currentSpeed <= limit - 3) {
            currentSpeed += 3;
        } else {
            currentSpeed = limit;
        }
    }

    public void breaking() {
        if (currentSpeed > 7) {
            currentSpeed -= 7;
        } else {
            currentSpeed = 0;
        }
    }

   /* public void looseSpeed() throws InterruptedException {
        while(currentSpeed>0){
            currentSpeed-=1;
            TimeUnit.SECONDS.sleep(1);

        }

    }*/


}