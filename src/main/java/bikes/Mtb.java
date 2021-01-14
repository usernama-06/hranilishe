package bike;

public class Mtb extends BikeSpec implements Bicycle {

    @Override
    public void ride() {
        System.out.println("lets ride MTB");

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
