package stepdefination;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Weather {

    public RestAssured restAssured;




        @Given("I hit url of  weather  get api endpoint")
        public void I_hit_url_of_weather_get_api_endpoint () {
            restAssured.baseURI="http://www.google.com/ig/api?weather=Mumbai";

        }



}

