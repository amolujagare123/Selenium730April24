package TestNGDemo.DemoParam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void beforeClassThree(String p1,String p2,String p3)
    {
       /* String url = "http://example.com";
        String username = "user-1";
        String password = "pass-1";*/

        String url = p1;
        String username = p2;
        String password = p3;

        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
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
