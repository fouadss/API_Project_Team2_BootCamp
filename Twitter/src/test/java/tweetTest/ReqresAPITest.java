package tweetTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReqresAPITest {
    @Test
    public void testCase_03(){
        Response response= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println( response.getBody());
        System.out.println( response.getStatusCode());
        System.out.println( response.getStatusLine());
        System.out.println( response.getHeader("content-type"));
        System.out.println( response.getTime());
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
}
