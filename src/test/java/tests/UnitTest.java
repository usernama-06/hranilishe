package tests;

import developmentInterface.QA;

public class UnitTest {


    public static void main(String[] args) {

        QA qa = new QA();
        int expectingResult = qa.getBugId(1,2);
        if (expectingResult != 10) {
            System.out.println("wrong id");


        }






    }
}
