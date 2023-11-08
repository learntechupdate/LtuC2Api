package opc.thoidpaypal.createorderapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class CreateOrderRequest {

    RequestSpecification reqSpc= RestAssured.given();

    public Response postApi(String url, String body){
        Response response;

        reqSpc.header("Authorization","Bearer A21AALIgvZehn7eYabXHGC3pvVGls47NR-e5jHQBHq-tHnwAGayaOv-QSmvAqb_xaqqDVjfh-hnOLRJ3TRNgrlm3feq_HttLg");
        reqSpc.header("Postman-Token","<calculated when request is sent>");

        reqSpc.header("Content-Type","application/json");
        reqSpc.header("Prefer","return=representation");
        reqSpc.header("PayPal-Request-Id","A v4 style guid");


        reqSpc.body(body);

        response=reqSpc.post(url);

        return response;


    }


}
