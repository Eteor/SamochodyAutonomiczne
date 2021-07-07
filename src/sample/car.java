package sample;

public class car {

    int currentSpeed=0;


    public int accelerate(int speed){
        speed+=3;
        return speed;
    }
    public int breaking(int speed)
    {
        speed-=10;
        return speed;
    }

    public int looseSpeed(int speed)
    {
        speed-=1;
        return speed;
    }


}
