package Helper;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Parameters({"Adminpage","Openfiledialog","Homepageurl"})
//@Parameters({"Homepageurl"})
public class Para 
{

	@Test
    public void testDelete(){
        System.out.println("testDelete()");
    }
 
    @Test
    @Parameters({"Adminpage"})
    public void accessHomePage(String pageurl) {
        System.out.println("accessHomePage()");
        System.out.println(pageurl);
    }
  
    @Test
    @Parameters({"Adminpage","Openfiledialog"})
    public void accessAdminPage(String admin_Page, int open_file) {
        System.out.println("accessAdminPage()");
        System.out.println(admin_Page);
        System.out.println(open_file);
    }
 
    @Test
    public void openConfirmationDialog() {
        System.out.println("openConfirmationDialog()");
    }
 
    @Test
    public void openFileDialog() {
        System.out.println("openFileDialog()");
    }
     
    @Test
    public void uiGroupDependentTest(){
        System.out.println("uiGroupDependentTest()");
    }
 
     
    @Test
    public void backendGroupDependentTest1(){
        System.out.println("backendGroupDependentTest1()");
    }
 
    @Test
    public void backendGroupDependentTest2(){
        System.out.println("backendGroupDependentTest2()");
    }

}
