package developmentInterface;


public class QA implements Result{

    public int bugId;

       public QA(int bugId) {
        this.bugId = bugId;
    }

    public QA() {

    }

    public void working () {

             System.out.println("created bug report");

    }

    @Override
    public void whatYouHaveDoneToday() {

        System.out.println("Bug id is"+ " " +this.bugId);



    }

    public int getBugId (int a, int b) {
           return a + b;

    }
}
