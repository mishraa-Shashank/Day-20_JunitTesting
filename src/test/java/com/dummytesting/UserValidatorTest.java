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
}