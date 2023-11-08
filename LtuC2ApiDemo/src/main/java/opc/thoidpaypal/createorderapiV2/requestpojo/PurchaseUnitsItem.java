package opc.thoidpaypal.createorderapiV2.requestpojo;

import java.util.List;
import lombok.Data;

@Data
public class PurchaseUnitsItem{
	private Amount amount;
	private List<ItemsItem> items;
}