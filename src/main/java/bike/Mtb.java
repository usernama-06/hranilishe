package bike;

public class Mtb implements RidingPlace {
    int wheelSize = 26;
    int frameSize = 22;
    String fork = "hydro";


    public void destination() {

        System.out.println("Lets ride MTB");
    }

    @Override
    public void rideOnHills() {
        System.out.println("Riders on the storm");
    }
}
