package Interfaces;

public class Car implements interf {
    public String brend;

    public Car(String brend) {
        this.brend = brend;
    }

    public void open_door() {

        System.out.println("pic-pic");
    }
    @Override
    public void show_me() {

    }
}
