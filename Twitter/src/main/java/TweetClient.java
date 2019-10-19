import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;


public class TweetClient {

    protected final static String apiKey =
            "7Pvy36ZiArV8cA7rmeNzrj69w";
    protected final static String apiSecretKey =
            "Ri6xXeXcb9OOZNhpWOHJuufNrVHgL9DdgRFcmhso31RlpzKk8g";
    protected final static String accessToken =
            "1160321179-B7Q2jLNe56kCTH5YsZIZUp45SK4efsL1yi8Kse1";
    protected final static String accessTokenSecret =
            "THiVbKifRGgcaUtmOAboP88OrQpdK8i6cL44Trsey2wNV";

    protected final static String BASE_URL = "https://api.twitter.com/1.1";
    protected final static String TWEET_ENPOINT = "/statuses/update.json";

    public ValidatableResponse sendTweet(String status){
        return  given().auth().oauth(apiKey, apiSecretKey, accessToken,accessTokenSecret)
                .param("status", status).when().post(BASE_URL + TWEET_ENPOINT).then();
    }

}
