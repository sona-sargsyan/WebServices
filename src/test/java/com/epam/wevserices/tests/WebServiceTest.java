package com.epam.wevserices.tests;

import com.epam.wevserices.models.user.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebServiceTest {
    Response response;

    @BeforeTest
    public void initTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        response =  RestAssured.when().get("/users").andReturn();
    }

    @Test
    public void checkStatusCode() {
        Assert.assertEquals(response.getStatusCode(),200);

    }
    @Test
    public void checkResponseHeader(){
        Assert.assertNotNull(response.getContentType());
        Assert.assertTrue(response.getContentType().contains("application/json; charset=utf-8"));

    }
    @Test
    public void checkResponseBody(){
        User users[] =  response.getBody().as(User[].class);
        Assert.assertEquals( users.length,10);
    }
}
