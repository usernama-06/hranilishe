package bike;

import java.util.Scanner;

public class TestBike {

    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);


        System.out.print("Input a wheel size : ");
        int wheelSize = in.nextInt();


        System.out.print("Input a frame size : ");
        int frameSize = in.nextInt();

        String forkType = in.nextLine();

        Mtb mtb = new Mtb();
        Bmx bmx = new Bmx();

        in.close();
        if (wheelSize == mtb.wheelSize && frameSize == mtb.frameSize ){
            mtb.destination();
        }
        if (wheelSize == bmx.wheelSize && frameSize == bmx.frameSize){
            bmx.ride();
        }
    }
}