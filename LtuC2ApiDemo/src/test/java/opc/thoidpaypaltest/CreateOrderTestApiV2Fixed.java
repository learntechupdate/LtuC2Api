package opc.thoidpaypaltest;

import com.google.gson.Gson;
import io.restassured.response.Response;

import opc.thoidpaypal.createorderapiV2.request.CreateOrderRequestServiceV2;
import opc.thoidpaypal.createorderapiV2.response.CreateOrderResponsePojo;
import org.testng.annotations.Test;

/**
 * The type Create order test api v 2 fixed.
 */
public class CreateOrderTestApiV2Fixed {

    /**
     * Test create order api.
     */
    @Test
    public  void testCreateOrderApi(){

        CreateOrderRequestServiceV2 createOrderRequestService=new CreateOrderRequestServiceV2();

        Response response = createOrderRequestService.createOrderRequestService();

        System.out.println("response : "+response.asString());

        CreateOrderResponsePojo createOrderJavaResponse
                =new Gson().fromJson(response.asString(),CreateOrderResponsePojo.class);

        String id = createOrderJavaResponse.getId();
        System.out.println("id : "+id);
        String value = createOrderJavaResponse.getPurchase_units().get(0).getAmount().getBreakdown().getItem_total().getValue();
        System.out.println("value : "+value);
        String description = createOrderJavaResponse.getPurchase_units().get(0).getItems().get(0).getDescription();
        System.out.println("description : "+description);

    }
}
