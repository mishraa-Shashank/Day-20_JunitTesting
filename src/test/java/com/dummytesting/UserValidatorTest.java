package com.dummytesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidatorTest {

    UserValidator validator = new UserValidator();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.validateFirstName("Shashank");
        Assert.assertTrue(result);
//        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.validateLastName("Mishra");
        Assert.assertTrue(result); /* when we have boolean method in the main class then we can use assertTrue or assertFalse
                                     directly.*/
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = validator.validateEmailAddress("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_IsValid_ShouldReturnTrue() {
        boolean result = validator.validateMobileNumber("+91 9919819801");
//        Assert.assertFalse(result);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_IsValid_ShouldReturnTrue() {
        boolean result = validator.validatePassword("Shashank1");
        Assert.assertTrue(result);
    }
}