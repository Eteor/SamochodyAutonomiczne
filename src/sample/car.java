package sample;

public class car {

    int currentSpeed=0;
    int minimumSpeed=0;


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

    public int looseSpeed(int speed)
    {
        speed-=1;
        return speed;
    }


}
