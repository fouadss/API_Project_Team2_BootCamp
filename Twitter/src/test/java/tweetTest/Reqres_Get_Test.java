package tweetTest;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Reqres_Get_Test {
    @Test(enabled = false)
    public void test_Case_4(){
        given().
                header("content-Type","application/json").
                get("https://reqres.in/api/users?page=2").
                then().statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name",hasItems("Michael","Lindsay"));
    }
@Test(enabled = false)
    public void test_Case_5(){
        given().
                get("https://reqres.in/api/users/2").
                then().statusCode(200).
                log().all();
}

@Test(enabled = false)
    public void test_case_6(){
        given().
                get("https://reqres.in/api/users/23").
                then().statusCode(404).
                log().
                all();
}

@Test(enabled = false)
    public void test_Case_7(){
        given().
                get("https://reqres.in/api/unknown").
                then().statusCode(200).
                log().all();
}
@Test(enabled = false)
    public void test_Case_8(){
        given().
                get("https://reqres.in/api/unknown/2").
                then().statusCode(200).log().all();
}
@Test(enabled = false)
    public void test_Case_9(){
        given().
                get("https://reqres.in/api/unknown/23").
                then().statusCode(404).log().all();
}
@Test
    public void test_Case_10(){
    Map<String,Object> map=new HashMap<>();
    map.put("name","fouad");
    map.put("job","QA");
    System.out.println(map);

}
}
