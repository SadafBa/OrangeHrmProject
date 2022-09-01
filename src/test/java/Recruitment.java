import org.testng.annotations.Test;

public class Recruitment extends TestBase {
    @Test
    public void test01(){
        startLoginPage()
                .loginToPIMPage()
                .navigateToRecruitmentPage()
                .selectOPtionfromDropDown("QA Lead");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
