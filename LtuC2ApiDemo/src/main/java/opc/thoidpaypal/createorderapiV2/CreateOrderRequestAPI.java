package opc.thoidpaypal.createorderapiV2;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import opc.thoidpaypal.createorderapiV2.requestpojo.CreateOrderRequest;

import java.util.Map;

public class CreateOrderRequestAPI {



    public Response postApi(String url, Map<String,String> headers, CreateOrderRequest body){
        Response response;
        RequestSpecification reqSpc= RestAssured.given();
        reqSpc.headers(headers);
        
        String jsonBody = new Gson().toJson(body);
        reqSpc.body("["+jsonBody+"]");
        System.out.println("jsonBody"+jsonBody);
        response=reqSpc.post(url);
        return response;

    }


}
