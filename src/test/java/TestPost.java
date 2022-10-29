import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    @Test
    public void firstTest(){
        stepUser.createUser("name","job");
    }
}
