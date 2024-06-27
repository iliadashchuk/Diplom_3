package site.stellarburgers.steps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import site.stellarburgers.model.User;

import static io.restassured.RestAssured.given;

public class UserSteps {
    @Step
    public ValidatableResponse createUser(User user) {
        return given().log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/api/auth/register")
                .then();
    }
    @Step
    public ValidatableResponse loginUser(User user) {
        return given().log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/api/auth/login")
                .then();
    }
    @Step
    public ValidatableResponse deleteUser(User user){
        return given().log().all()
                .headers("Authorization",
                        "Bearer " + user.getAccessToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .body(user)
                .when()
                .delete("/api/auth/user")
                .then();
    }
}