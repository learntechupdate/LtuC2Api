package opc.thoidpaypaltest;

import io.restassured.response.Response;
import opc.thoidpaypal.createorderapi.CreateOrderRequest;
import opc.thoidpaypal.createorderapiV2.CreateOrderRequestService;
import org.testng.annotations.Test;

public class CreateOrderTestAPIV2 {

    @Test
    public  void testCreateOrderApi(){

        CreateOrderRequestService createOrderRequestService=new CreateOrderRequestService();

        Response response = createOrderRequestService.createOrderRequestService();




        System.out.println(response.asString());
        //testbranch

    }
}
