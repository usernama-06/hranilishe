package bike;

public abstract class BikeSpec {

    public static String bikeType;
    public static int wheelSize;
    public int chainRingSize;

    public String howToRide() {
        String howToDo = "just pedal";
        System.out.println(howToDo);
        return howToDo;
    }

    public static String jump() {
        String jump = "Lift front and push handlebar forward";
        System.out.println(jump);
        return jump;
    }

}





