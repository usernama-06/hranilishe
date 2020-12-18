package bikeShop;

public class Bmx extends Bicycle {

   int wheelSize = 20;

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    int frameSize = 21;

    public String message;

    public void ride() {
        System.out.println("Lets ride BMX");
    }

    public String letsRide() {
        return message = "Lets ride BMX";
    }
}
