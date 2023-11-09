package opc.thoidpaypal.createorderapiV2.request;

import com.google.gson.Gson;
import io.restassured.response.Response;
import opc.thoidpaypal.constant.Constant;


import java.util.HashMap;
import java.util.Map;

/**
 * The type Create order request service v 2.
 */
public class CreateOrderRequestServiceV2 {

    /**
     * Create order request service response.
     *
     * @return the response
     */
    public Response createOrderRequestService(){

        CreateOrderRequestAPI createOrderRequest=new CreateOrderRequestAPI();

        String url = Constant.createOrderPayPalUrl;

        CreateOrderRequestBuilderV2 createOrderBuilderv2=new CreateOrderRequestBuilderV2();
        CreateOrderRequestPojoV2 createOrderRequestPojoV2 = createOrderBuilderv2.setCreateOrderRequestBuilder();

        System.out.println("Reqbody : "+createOrderRequestPojoV2);
        String jsonBodyInStringFormat = new Gson().toJson(createOrderRequestPojoV2);
        return createOrderRequest.postApi(url,this.createOrderheader(),jsonBodyInStringFormat);
        
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
