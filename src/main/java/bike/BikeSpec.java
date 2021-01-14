package bike;

public abstract class BikeSpec {

     public String vendor;
     public String bikeType;
     public int wheelSize;
     public int chainRingSize;
     public int chainRingsCount;
     public String forkType;
     public int speed;

    public String howToRide() {
        String howToDo = "jus pedal";
        System.out.println(howToDo);
        return howToDo;
    }

    public void jump(){
        System.out.println("Lift front and push handlebar forward");
    }


}
