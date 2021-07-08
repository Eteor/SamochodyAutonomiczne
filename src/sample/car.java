package sample;

import java.util.concurrent.TimeUnit;

public class car {

    int currentSpeed=0;


    public void accelerate()
    {
        currentSpeed+=3;
    }
    public void breaking()
    {
        if(currentSpeed>7)
        currentSpeed-=7;
        else if ((currentSpeed<7)&(currentSpeed>0))
            currentSpeed-=1;
        else;
    }

   /* public void looseSpeed() throws InterruptedException {
        while(currentSpeed>0){
            currentSpeed-=1;
            TimeUnit.SECONDS.sleep(1);

        }

    }*/


}
