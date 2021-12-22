package test;

import org.testng.annotations.Test;

public class FirstTestSuite {

    @Test(groups = {"Order Processing", "OFT-100"})
    public void firstTest() {
        System.out.println("firstTest");
    }

    @Test(groups = {"Readings Processing", "OFT-101"})
    public void secondTest(){
        System.out.println("secondTest");
    }
}
