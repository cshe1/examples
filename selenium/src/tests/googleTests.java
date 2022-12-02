package tests;

import org.testng.annotations.Test;

public class googleTests {

    //Change the variable for different Google search results
    String searchTerm = "Lancelot";

    @Test
    public void searchGoogle(){
        utils.navigateGoogle();
        utils.searchGoogle(searchTerm);
    }
}
