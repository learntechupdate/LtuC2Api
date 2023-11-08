package opc.thoidpaypal.createorderapiV2;

import io.restassured.response.Response;
import opc.thoidpaypal.constant.Constant;
import opc.thoidpaypal.createorderapiV2.requestBuilder.CreateOrderBuilder;
import opc.thoidpaypal.createorderapiV2.requestpojo.CreateOrderRequest;

import java.util.HashMap;
import java.util.Map;

public class CreateOrderRequestService {

    public Response createOrderRequestService(){

        CreateOrderRequestAPI createOrderRequest=new CreateOrderRequestAPI();

        String url = Constant.createOrderPayPalUrl;

        CreateOrderBuilder createOrderBuilder=new CreateOrderBuilder();
        CreateOrderRequest body = createOrderBuilder.setCreateOrderServiceRequest();

        System.out.println("CreateOrderRequest"+body);

        return createOrderRequest.postApi(url,this.createOrderheader(),body);
        
    }
    
    private Map<String,String> createOrderheader (){
        Map<String,String> headers = new HashMap<>();

        headers.put("Authorization","Bearer A21AALIgvZehn7eYabXHGC3pvVGls47NR-e5jHQBHq-tHnwAGayaOv-QSmvAqb_xaqqDVjfh-hnOLRJ3TRNgrlm3feq_HttLg");
        headers.put("Postman-Token","<calculated when request is sent>");

        headers.put("Content-Type","application/json");
        headers.put("Prefer","return=representation");
        headers.put("PayPal-Request-Id","A v4 style guid");
        return headers;
    }
    
}
