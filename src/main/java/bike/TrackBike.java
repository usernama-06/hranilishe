package bike;

public class TrackBike extends BikeSpec implements Bicycle {



    @Override
    public void ride() {
        System.out.println("lets ride track bike at high speed");
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

