package tests;

import developmentAbstract.Devs;
import developmentAbstract.QA;

public class TestDevelopmentAbstract {
    public static void main(String[] args) {

        QA qa = new QA();
        Devs devs = new Devs();
        qa.doYourJob();
        devs.doYourJob();
        qa.createAnApp();
        devs.createAnApp();

    }
}
