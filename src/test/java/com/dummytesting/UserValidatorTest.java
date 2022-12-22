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
}