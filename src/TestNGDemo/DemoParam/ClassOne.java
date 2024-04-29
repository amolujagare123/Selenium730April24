package TestNGDemo.DemoParam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void beforeClassOne(String p1,String p2,String p3)
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
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }
    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }

}
