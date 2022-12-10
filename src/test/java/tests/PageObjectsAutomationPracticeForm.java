package tests;

import org.junit.jupiter.api.Test;
import static tests.TestData.*;



public class PageObjectsAutomationPracticeForm extends TestBase {

    @Test
    void fillFormTest() {


        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setBirthDate(day, month, year)
                .setSubjects(subject)
                .setLoadPicture(file)
                .setHobbiesWrapper(hobbies)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .pressSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName+" "+lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", day + " "+month+","+year)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", "image_2022-11-11_17-13-46.png")
                .verifyResult("Address", address)
                .verifyResult("State and City", state+" "+city);


    }

}
