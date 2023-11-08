package opc.thoidpaypal.createorderapiV2.requestpojo;

import lombok.Data;

@Data
public class ApplicationContext{
	private String returnUrl;
	private String cancelUrl;
}