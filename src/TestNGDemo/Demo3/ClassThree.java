package TestNGDemo.Demo3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeTest
    public void beforeMyTest2()
    {
        System.out.println("beforeMyTest2");
    }
    @AfterTest
    public void afterMyTest2()
    {
        System.out.println("afterMyTest2");
    }

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
