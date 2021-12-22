package test;

import org.testng.annotations.Test;

public class SecondTestSuite {
    @Test(groups = {"Order Processing", "OFT-103"})
    public void thirdTest() {
        System.out.println("thirdTest");
    }

    @Test(groups = {"Financial & Claims", "OFT-104"})
    public void fourthTest(){
        System.out.println("fourthTest");
    }
}
