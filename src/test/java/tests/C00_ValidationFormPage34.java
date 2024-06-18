package tests;

import org.testng.annotations.Test;

import pages.FillFormPage;

import utilities.Driver;
public class C00_ValidationFormPage34 {

    @Test
    void fillFormTest() {
        FillFormPage fillFormPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        fillFormPage
                .enterFirstname("John")
                .enterLastname("Schwarzenegger")
                .enterAge("30")
                .chooseCountry("Iceland")
                .enterNotes("Hello World")
                .clickSubmit()
                .validateResponse()
        ;

        Driver.closeDriver();
    }

    @Test
    void fillFormTest2() {
        FillFormPage fillFormPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        fillFormPage
                .enterFirstname("Ali")
                .enterLastname("Schwarzenegger")
                .enterAge("45")
                .chooseCountry("Turkey")
                .enterNotes("Merhaba")
                .clickSubmit()
                .validateResponse()
        ;

        Driver.closeDriver();
    }

    @Test
    void fillFormTest3() {
        FillFormPage fillFormPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        fillFormPage
                .enterFirstname("Raju")
                .enterLastname("Schwarzenegger")
                .enterAge("25")
                .chooseCountry("India")
                .enterNotes("Namaste")
                .clickSubmit()
                .validateResponse()
        ;

        Driver.closeDriver();
    }
}