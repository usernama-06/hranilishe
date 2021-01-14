package bike;

public class TrialBike extends BikeSpec implements Bicycle {


    @Override
    public void ride() {
        System.out.println("lets ride trial bike");
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
