package developmentInterface;

public class Dev implements Result{

 public String code;

    public Dev(String code) {
        this.code = code;
    }

    public void workingHard () {

     System.out.println("I've created one bug");
 }

    @Override
    public void whatYouHaveDoneToday() {
        System.out.println("I've wrote"+ " " +this.code+" "+"today");

    }
}