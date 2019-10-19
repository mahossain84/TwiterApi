import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTweets {
    protected TweetClient tweetClient;
    @BeforeClass
    public void setUp(){
        this.tweetClient = tweetClient;
    }
    @Test
    public void testUserTweetSuccessfully(){
        String status = "Tweeting from the nyc ";
        ValidatableResponse response = this.tweetClient.sendTweet(status);
        response.statusCode(200);
    }
}
