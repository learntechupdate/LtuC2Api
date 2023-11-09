package opc.thoidpaypaltest;

import io.restassured.response.Response;

import opc.thoidpaypal.createorderapiV2.CreateOrderRequestServiceV2;
import org.testng.annotations.Test;

public class CreateOrderTestAPIV3 {

    @Test
    public  void testCreateOrderApi(){

        CreateOrderRequestServiceV2 createOrderRequestService=new CreateOrderRequestServiceV2();

        Response response = createOrderRequestService.createOrderRequestService();




        System.out.println(response.asString());
        //testbranch

    }
}
