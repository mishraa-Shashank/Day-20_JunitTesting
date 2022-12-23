package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest{
    private String email2Test;
    private boolean expectedResult;

    public void validEmailTest(String emails, boolean expectedResult){
        this.email2Test = emails;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com",true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true},
                {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true}, {"abc@abc@gmail.com", false}, {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false}, {"abc.@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}, {"abc@%*.com", false},
                {"abc()*@gmail.com", false}, {"abc123@.com.com", false}, {".abc123@.com", false}, {"abc123@gmail.a", false},
                {"abc@.com.my", false}});
    }

    @Test
    public void givenEmails_ShouldReturnAsPerTheParameterizedResult(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress(this.email2Test);
        Assert.assertEquals(this.expectedResult, result);
    }
}