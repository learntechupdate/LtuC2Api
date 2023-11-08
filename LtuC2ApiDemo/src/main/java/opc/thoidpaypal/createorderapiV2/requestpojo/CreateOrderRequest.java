package opc.thoidpaypal.createorderapiV2.requestpojo;

import java.util.List;
import lombok.Data;

@Data
public class CreateOrderRequest{
	private ApplicationContext applicationContext;
	private List<PurchaseUnitsItem> purchase_units;
	private String intent;
}