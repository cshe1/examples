package tests;

import org.testng.annotations.Test;

public class googleTests {

    //Change the variable for different Google search results
    String searchTerm = "Lancelot";
    String luckyButtonID = "RNmpXc";
    @Test
    public void searchGoogle(){
        utils.initializeOptions();
        utils.navigateGoogle();
        utils.searchGoogle(searchTerm);
    }

    @Test
    public void searchGoogleLucky(){
        utils.initializeOptions();
        utils.maximizeCurr();
        utils.navigateGoogle();
        utils.typeSearchBar(searchTerm);
        utils.tapButton(luckyButtonID);
    }
}
