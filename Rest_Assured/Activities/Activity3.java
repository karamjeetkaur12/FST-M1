package restAssuredExamples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity3 {
    // Declare request specification
    RequestSpecification requestSpec;
    // Declare response specification
    ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec = new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                // Set base URL
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                // Build request specification
                .build();

        responseSpec = new ResponseSpecBuilder()
                // Check status code in response
                .expectStatusCode(200)
                // Check response content type
                .expectContentType("application/json")
                // Check if response contains name property
                .expectBody("status", equalTo("alive"))
                // Build response specification
                .build();
    }

    @DataProvider
    public Object[][] petInfoProvider() {
        // Setting parameters to pass to test case
        Object[][] testData = new Object[][] { 
            { 77232, "Riley", "alive" }, 
            { 77233, "Hansel", "alive" }
        };
        return testData;
    }

    @Test(priority=1)
    
    public void addPets() {
        String reqBody = "{\"id\": 77232, \"name\": \"Riley\", \"status\": \"alive\"}";
        Response response = given().spec(requestSpec) 
                .body(reqBody) 
                .when().post(); 

        reqBody = "{\"id\": 77233, \"name\": \"Hansel\", \"status\": \"alive\"}";
        response = given().spec(requestSpec) 
                .body(reqBody) 
                .when().post(); 
       
        response.then().spec(responseSpec); 
    }

    @Test(dataProvider = "petInfoProvider", priority=2)
    public void getPets(int id, String name, String status) {
        Response response = given().spec(requestSpec) 
                .pathParam("petId", id) 
                .when().get("/{petId}"); 

   
        System.out.println(response.asPrettyString());
       
        response.then()
        .spec(responseSpec) 
        .body("name", equalTo(name)); 
    }

   
    @Test(dataProvider = "petInfoProvider", priority=3)
    public void deletePets(int id, String name, String status) {
        Response response = given().spec(requestSpec) 
                .pathParam("petId", id) 
                .when().delete("/{petId}"); 

      
        response.then().body("code", equalTo(200));
    }

}