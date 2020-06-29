package tweetTest;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Reqres_Post_Test {
    @Test(enabled = false)
    public void test_Case_10(){
//        Map<String,Object> map=new HashMap<>();
//        map.put("name","fouad");
//        map.put("job","QA");
//        System.out.println();
        JSONObject request = new JSONObject();
        request.put("name","fouad");
        request.put("job","QA");
        System.out.println(request);
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).log().all();
    }
    @Test(enabled = false)
    public void test_Case_11(){
        JSONObject request=new JSONObject();
        request.put("name","demo");
        request.put("job","SDET");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201);
    }
    @Test(enabled = false)
    public void test_Case_12(){
        JSONObject request=new JSONObject();
        request.put("name","david");
        request.put("job","qa Lead");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201);
    }
    // put method
    @Test(enabled = false)
    public void test_Case_13(){
        JSONObject request=new JSONObject();
        request.put("name","david");
        request.put("job","qa Lead");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    @Test(enabled = false)
    public void tes_Case_14(){
        JSONObject request=new JSONObject();
        request.put("name","demo");
        request.put("job","SDET");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    // patch method
    @Test(enabled = false)
    public void test_Case_15(){
        JSONObject request=new JSONObject();
        request.put("name","david");
        request.put("job","qa Lead");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    @Test(enabled = false)
    public void test_Case_16(){
        JSONObject request=new JSONObject();
        request.put("name","demo");
        request.put("job","SDET");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    @Test(enabled = false)
    public void test_Case_17(){
        JSONObject request = new JSONObject();
        request.put("name","fouad");
        request.put("job","QA");
        System.out.println(request);
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    // delete metthod
    @Test
    public void test_Case_18(){
        given().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).log().all();
    }
@Test
    public void test_Case_19(){

}
}
