import org.testng.annotations.Test;

public class DemoSystemVar {

    @Test
    public void checkSystemVar() {
        String env = System.getProperty("env");

        System.out.println("===================================================");
        System.out.println(env);
        System.out.println("===================================================");
    }

    //mvn -Dtest=DemoSystemVar#checkSystemVar  -Denv=https://localhost test
}
