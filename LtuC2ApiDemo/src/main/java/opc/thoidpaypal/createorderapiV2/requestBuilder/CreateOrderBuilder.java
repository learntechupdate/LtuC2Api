package opc.thoidpaypal.createorderapiV2.requestBuilder;

import opc.thoidpaypal.createorderapiV2.requestpojo.ItemTotal;
import opc.thoidpaypal.createorderapiV2.requestpojo.Breakdown;
import opc.thoidpaypal.createorderapiV2.requestpojo.Amount;
import opc.thoidpaypal.createorderapiV2.requestpojo.ApplicationContext;
import opc.thoidpaypal.createorderapiV2.requestpojo.UnitAmount;
import opc.thoidpaypal.createorderapiV2.requestpojo.*;




import java.util.ArrayList;
import java.util.List;

public class CreateOrderBuilder {

    public CreateOrderRequest setCreateOrderServiceRequest(){

        CreateOrderRequest createOrderRequest=new CreateOrderRequest();

        createOrderRequest.setIntent("CAPTURE");


        List<PurchaseUnitsItem> purchaseUnitsItemList=new ArrayList<>();

        PurchaseUnitsItem purchaseUnitsItem=new PurchaseUnitsItem();

        List<ItemsItem> itemsItemList=new ArrayList<>();

        ItemsItem itemsItem=new ItemsItem();
        itemsItem.setQuantity("1");
        itemsItem.setName("T-Shirt");
        itemsItem.setDescription("Green XL");

        UnitAmount unitAmount = new UnitAmount();
        unitAmount.setValue("100.00");
        unitAmount.setCurrencyCode("USD");
        itemsItem.setUnitAmount(unitAmount);

        itemsItemList.add(itemsItem);
        purchaseUnitsItem.setItems(itemsItemList);

        createOrderRequest.setPurchase_units(purchaseUnitsItemList);

        Amount amount = new Amount();
        Breakdown breakdown = new Breakdown();
        ItemTotal itemTotal = new ItemTotal();
        itemTotal.setValue("100.00");
        itemTotal.setCurrencyCode("USD");
        breakdown.setItemTotal(itemTotal);
        amount.setBreakdown(breakdown);
        amount.setValue("100.00");
        amount.setCurrencyCode("USD");
        purchaseUnitsItem.setAmount(amount);
        purchaseUnitsItemList.add(purchaseUnitsItem);




        ApplicationContext applicationContext=new ApplicationContext();
        applicationContext.setReturnUrl("https://example.com/return");
        applicationContext.setCancelUrl("https://example.com/cancel");
        createOrderRequest.setApplicationContext(applicationContext);

        return  createOrderRequest;
    }
}
