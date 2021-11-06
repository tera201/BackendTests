import Pojo.CreateUser;
import Pojo.UserPojo;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * @author rnaryshkin
 */
public class BackendTests {
    /** uri ресурса для api */
    public static final String petstore = "https://petstore.swagger.io/v2";
    /** билд специпикации запроса */
    private static final RequestSpecification ReqSpec = new RequestSpecBuilder().setBaseUri(petstore).
    setBasePath("/user").setContentType(ContentType.JSON).build();
    /** путь к json файлу */
    private static final File body = new File("src/test/java/body.json");

    /** тест post с двумя пользователями */
    @Test
    public void postTwoUser(){
        UserPojo user = CreateUser.fromJson(body);
        UserPojo rq = new UserPojo().setId(0L).setUsername("TestTT");
        List<UserPojo> users = new ArrayList<UserPojo>();
        users.add(rq);
        users.add(user);
        Response response = RestAssured.given().spec(ReqSpec).body(users).post("/createWithList");
        Assertions.assertEquals(200, response.getStatusCode());
    }

    /** тест post с пустым списком пользователей */
    @Test
    public void postEmptyUserList(){
        List<UserPojo> users = new ArrayList<UserPojo>();
        Response response = RestAssured.given().spec(ReqSpec).body(users).post("/createWithList");
        Assertions.assertEquals(200, response.getStatusCode());
    }

    /** тест put с пустым полями для изменения пользователя */
    @Test
    public void putUserEmptyData(){
        UserPojo user = new UserPojo();
        Response response = RestAssured.given().spec(ReqSpec).body(user).put("/someUsername");
        Assertions.assertEquals(200, response.getStatusCode());
    }

    /** тест put с заполнеными полями для изменения пользователя */
    @Test
    public void putUserFullData(){
        UserPojo user = CreateUser.fromJson(body);
        Response response = RestAssured.given().spec(ReqSpec).body(user).put("/someUsername");
        Assertions.assertEquals(200, response.getStatusCode());
    }

    /** тест put без имени пользователя в запросе */
    @Test
    public void putWithoutUsername(){
        UserPojo user = CreateUser.fromJson(body);
        Response response = RestAssured.given().spec(ReqSpec).body(user).put("/");
        Assertions.assertEquals(405, response.getStatusCode());
    }
}
