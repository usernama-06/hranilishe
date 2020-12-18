package tests;

import developmentInterface.Dev;
import developmentInterface.QA;

public class TestDevelopmentInterface {
    public static void main(String[] args) {
   QA qa = new QA(235);
   Dev dev = new Dev("curve code");
   qa.whatYouHaveDoneToday();
   dev.whatYouHaveDoneToday();

    }
}
