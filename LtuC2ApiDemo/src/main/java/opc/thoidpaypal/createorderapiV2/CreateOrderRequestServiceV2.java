package opc.thoidpaypal.createorderapiV2;

import io.restassured.response.Response;
import opc.thoidpaypal.constant.Constant;



import opc.thoidpaypal.createorderapiV2.requestV2.CreateOrderRequestBuilderV2;
import opc.thoidpaypal.createorderapiV2.requestV2.CreateOrderRequestV2;


import java.util.HashMap;
import java.util.Map;

public class CreateOrderRequestServiceV2 {

    public Response createOrderRequestService(){

        CreateOrderRequestAPI createOrderRequest=new CreateOrderRequestAPI();

        String url = Constant.createOrderPayPalUrl;

        CreateOrderRequestBuilderV2 createOrderBuilderv2=new CreateOrderRequestBuilderV2();
        CreateOrderRequestV2 body = createOrderBuilderv2.setCreateOrderRequestBuilder();
        
        System.out.println("CreateOrderRequestV2"+body);

        return createOrderRequest.postApi(url,this.createOrderheader(),body);
        
    }
    
    private Map<String,String> createOrderheader (){
        Map<String,String> headers = new HashMap<>();

        headers.put("Authorization","Bearer A21AALicWZ5kreXGsSe0Hhm6xZe9AuQzvklFm9cJhdxWccdUsfbfZ1Pl_m-nTwTiDRwG3J5clkmEGpD8s5Y_ySAujD79xeGEg");
        headers.put("Postman-Token","<calculated when request is sent>");

        headers.put("Content-Type","application/json");
        headers.put("Prefer","return=representation");
        headers.put("PayPal-Request-Id","A v4 style guid");
        return headers;
    }
    
}
