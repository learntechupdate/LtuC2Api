package opc.thoidpaypal.createorderapiV2.requestpojo;

import lombok.Data;

@Data
public class ItemsItem{
	private String quantity;
	private String name;
	private String description;
	private UnitAmount unitAmount;
}