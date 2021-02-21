import bike.Bmx;
import bike.Mtb;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    void howToRideTest() {
        Bmx bmx = new Bmx();
        Assert.assertEquals(bmx.howToRide(), "just pedal");
    }
    @Test void howToJump(){
        Mtb mtb = new Mtb();
        Assert.assertEquals(Mtb.jump(),"Lift front and push handlebar forward");
    }

}