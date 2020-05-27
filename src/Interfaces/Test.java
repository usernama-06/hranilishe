package Interfaces;

public class Test {
    public static void main(String[] args) {
   Car car = new Car("Audi");
   Train train = new Train(5);
   car.open_door();
   train.ride();
    }
}
