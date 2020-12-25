package bike;

public class Tricycle extends Bicycle {
    @Override
    public void ride() {
        System.out.println("Lets ride tricycle");

    }

    int wheelCount;

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }


}
