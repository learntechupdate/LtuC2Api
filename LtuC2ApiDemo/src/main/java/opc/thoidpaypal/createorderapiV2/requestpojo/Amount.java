package opc.thoidpaypal.createorderapiV2.requestpojo;

import lombok.Data;

@Data
public class Amount{
	private Breakdown breakdown;
	private String value;
	private String currencyCode;
}