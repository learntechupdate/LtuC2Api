package opc.thoidpaypal.createorderapiV2.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

    @Data
    public class CreateOrderResponsePojo {
        String id;
        String intent;
        String status;
        ArrayList
                <PurchaseUnit> purchase_units;
        Date create_time;
        ArrayList
                <Link> links;
    }


