package bike;

public class Bmx extends BikeSpec implements Bicycle {

    @Override
    public void ride() {
        System.out.println("lets ride bmx and make a trick!");
    }

    @Override
    public void speedRise() {
        System.out.println(speed);

    }

    @Override
    public void bikeParts() {
        System.out.println("my name is"+" " + vendor +" "+"i got" + wheelSize +"inches wheel ," + " " + forkType );

    }
}