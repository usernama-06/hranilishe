package tests;

import package02.QA;

import java.util.Arrays;

public class UnitTest {


    public static void main(String[] args) {

        QA qa = new QA();
        int expectingResult = qa.getBugId(1,2);
        if (expectingResult != 10) {
            System.out.println("wrong id");


        }






    }
}
